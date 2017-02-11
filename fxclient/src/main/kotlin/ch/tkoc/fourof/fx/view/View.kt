package ch.tkoc.fourof.fx.view

import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.stage.Stage
import kotlin.reflect.KProperty

abstract class View {

    var fxmlLoader: FXMLLoader? = null

    abstract fun show(primaryStage: Stage)

    fun <T: Node> fxml(hasController: Boolean = false) = object : ViewProperty<T> {

        init {
            val componentType = this@View.javaClass
            val fxmlLocation = componentType.getResource("${componentType.simpleName}.fxml")
                    ?: throw IllegalStateException("fxml not found for $componentType")
            fxmlLoader = FXMLLoader(fxmlLocation).apply {
                if(hasController) {
                    setControllerFactory { this@View }
                } else {
                    setController(this@View)
                }
            }
        }
        val value: T = fxmlLoader!!.load()

        override operator fun getValue(view: View, property: KProperty<*>) = value
    }

    inline fun <reified T: Node> fxid() = object : ViewProperty<T> {

        override fun getValue(view: View, property: KProperty<*>): T {
            val value = this@View.fxmlLoader!!.namespace[property.name]
            when(value) {
                null -> throw IllegalArgumentException("Property ${property.name} could not be found in namespace")
                is T -> return value
                else -> throw IllegalArgumentException("Property ${property.name} is not of type ${property.returnType}")
            }
        }
    }
}
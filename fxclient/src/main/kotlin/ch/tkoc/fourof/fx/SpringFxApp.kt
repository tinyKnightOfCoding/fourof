package ch.tkoc.fourof.fx

import ch.tkoc.fourof.fx.view.View
import javafx.stage.Stage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component

@Component
class SpringFxApp @Autowired constructor(private val applicationContext: ApplicationContext) {

    private val application: AppFx = AppFx()
    private val primaryStage: Stage = application.createStage()

    fun switchToViewBean(beanName: String) {
        val bean = applicationContext.getBean(beanName)
        when(bean) {
            is View -> switchToView(bean)
            else -> throw IllegalArgumentException("bean $beanName is not of type View")
        }
    }

    private fun switchToView(view: View) {
        view.show(primaryStage)
    }
}

fun main(vararg args: String) {
    val context = AnnotationConfigApplicationContext("ch.tkoc.fourof.fx")
    println(context)
    context.beanDefinitionNames.forEach { println(it) }
}
package ch.tkoc.fx

import javafx.application.Application
import javafx.stage.Stage
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class SpringFxLauncher : Application() {


    companion object {
        var primaryStage: Stage? = null
        var basePackage: String? = null

        fun launch(basePackage: String) {
            Companion.basePackage = basePackage
//            launch(SpringFxLauncher::class.java)
        }
    }


    override fun start(primaryStage: Stage) {
        Companion.primaryStage = primaryStage
        val context = AnnotationConfigApplicationContext("ch.tkoc.fx", SpringFxLauncher.basePackage)
        context.beanDefinitionNames.forEach { println("- $it") }
    }

    fun createStage() : Stage {
        return primaryStage!!
    }
}
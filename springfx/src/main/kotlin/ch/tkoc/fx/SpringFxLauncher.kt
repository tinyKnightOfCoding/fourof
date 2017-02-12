package ch.tkoc.fx

import javafx.application.Application
import javafx.stage.Stage
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class SpringFxLauncher : Application() {

    companion object {
        var primaryStage: Stage? = null
        var basePackages: String? = null

        fun launch(basePackages: String) {
            Companion.basePackages = basePackages
            launch(SpringFxLauncher::class.java)
        }
    }


    override fun start(primaryStage: Stage) {
        Companion.primaryStage = primaryStage
        val context = AnnotationConfigApplicationContext(basePackages!!)
        println("context initialized: ")
        context.beanDefinitionNames.forEach { println("- $it") }
    }

    fun createStage() : Stage {
        return primaryStage!!
    }
}
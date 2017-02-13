package ch.tkoc.fx

import javafx.application.Application
import javafx.stage.Stage
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.core.env.Environment
import kotlin.reflect.KClass

var customConfigClass: Class<*>? = null
var applicationContext: ApplicationContext? = null
var primaryStage: Stage? = null

fun launchSpringFx(configClass: Class<*>) {
    customConfigClass = configClass
    Application.launch(SpringFxLauncher::class.java)
}

fun launchSpringFx(configClass: KClass<*>) {
    launchSpringFx(configClass.java)
}

class SpringFxLauncher : Application() {

    override fun start(primaryStage: Stage) {
        ch.tkoc.fx.primaryStage = primaryStage
        applicationContext = AnnotationConfigApplicationContext(customConfigClass, SpringFxConfiguration::class.java)
        applicationContext!!.apply {
            println("context created: ")
            beanDefinitionNames.forEach{println("- $it")}
            val env = getBean(Environment::class.java)
            println("${env.getProperty("springfx.initial")}")
        }
    }

    fun createStage() : Stage {
        return primaryStage!!
    }
}
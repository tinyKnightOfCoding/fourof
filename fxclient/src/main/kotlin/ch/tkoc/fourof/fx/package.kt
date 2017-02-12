package ch.tkoc.fourof.fx

import ch.tkoc.fx.SpringFxConfiguration
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(vararg args: String) {
    val context = AnnotationConfigApplicationContext(SpringFxConfiguration::class.java, FxAppConfiguration::class.java)
    context.beanDefinitionNames.forEach(::println)
}
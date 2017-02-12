package ch.tkoc.fourof.fx

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(vararg args: String) {
    val context = AnnotationConfigApplicationContext("ch.tkoc.fourof.fx")
    println(context)
    context.beanDefinitionNames.forEach { println(it) }
}
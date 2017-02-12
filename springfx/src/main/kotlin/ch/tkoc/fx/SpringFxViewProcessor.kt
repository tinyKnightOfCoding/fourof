package ch.tkoc.fx

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Component

@Component
class SpringFxViewProcessor : BeanPostProcessor {

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any {
        println("after $beanName")
        return bean
    }

    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any {
        println("before $beanName")
        return bean
    }
}
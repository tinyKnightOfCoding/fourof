package ch.tkoc.fx

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Aspect
@Component("ch.tkoc.fx.transitionAspect")
class TransitionAspect @Autowired constructor(val springFxApp: SpringFxApp, val applicationContext: ApplicationContext) {

    @Pointcut("@annotation(ch.tkoc.fx.annotation.FxTransition)")
    fun methodAnnotatedWithFxTransition() {
    }

    @Pointcut("execution(public * *(..))")
    fun methodReturnsString() {
    }

    @AfterReturning(pointcut = "methodReturnsString() && methodAnnotatedWithFxTransition()", returning = "returnValue")
    fun transition(joinPoint: JoinPoint, returnValue: String) {
        println("transitioning to view: $returnValue")
        springFxApp.transitionToBean(beanName = returnValue)
    }
}
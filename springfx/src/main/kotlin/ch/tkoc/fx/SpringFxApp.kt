package ch.tkoc.fx

import ch.tkoc.fx.view.View
import javafx.stage.Stage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component("ch.tkoc.fx.springFxApp")
class SpringFxApp @Autowired constructor(@Value("\${springfx.initial}") val initialViewName: String, val applicationContext: ApplicationContext) {

    fun View.transition() {
        show(primaryStage)
    }

    private val primaryStage: Stage = ch.tkoc.fx.primaryStage!!

    @PostConstruct
    fun showInitialView() = resolveInitialView().transition()

    private fun resolveInitialView(): View = resolveView(initialViewName)

    private fun resolveView(beanName: String): View =  applicationContext.getBean(beanName).let { bean ->
        when (bean) {
            is View -> return bean
            else -> throw IllegalArgumentException("bean $initialViewName must be of type View")
        }
    }

    fun transitionToBean(beanName: String) = resolveView(beanName).transition()
}

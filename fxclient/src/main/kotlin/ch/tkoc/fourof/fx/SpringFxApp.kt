package ch.tkoc.fourof.fx

import ch.tkoc.fourof.fx.view.View
import javafx.stage.Stage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Component
class SpringFxApp @Autowired constructor(private val applicationContext: ApplicationContext) {

    private val primaryStage: Stage = SpringFxLauncher.primaryStage!!

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

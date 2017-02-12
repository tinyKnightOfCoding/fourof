package ch.tkoc.fourof.fx

import ch.tkoc.fourof.fx.view.FxView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.core.annotation.AnnotationUtils
import org.springframework.stereotype.Component

@Component
class FxViewInitializer @Autowired constructor(val springFxApp: SpringFxApp) : BeanPostProcessor {

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any {
        AnnotationUtils.findAnnotation(bean.javaClass, FxView::class.java)?.apply {
            if(initial) {
                springFxApp.switchToViewBean(beanName)
            }
        }
        return bean
    }
}
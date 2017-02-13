package ch.tkoc.fx

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.annotation.Resource

@Configuration("ch.tkoc.fx.springFxConfiguration")
class SpringFxConfiguration {

    val springFxApp: SpringFxApp
        @Bean("ch.tkoc.fx.springFxApp") get() = SpringFxApp()
}
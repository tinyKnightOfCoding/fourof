package ch.tkoc.fx

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration("ch.tkoc.fx.springFxConfiguration")
class SpringFxConfiguration {

    val springFxViewProcessor: SpringFxViewProcessor
        @Bean("ch.tkoc.fx.springFxViewProcessor") get() = SpringFxViewProcessor()

    val springFxApp: SpringFxApp
        @Bean("ch.tkoc.fx.springFxApp") get() = SpringFxApp()
}
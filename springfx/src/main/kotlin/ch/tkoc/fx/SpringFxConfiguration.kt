package ch.tkoc.fx

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.annotation.Resource

@Configuration("ch.tkoc.fx.springFxConfiguration")
class SpringFxConfiguration(@Resource(name="\${springfx.initial}") val initialView: View) {

    val springFxApp: SpringFxApp
        @Bean("ch.tkoc.fx.springFxApp") get() = SpringFxApp(initialView)
}
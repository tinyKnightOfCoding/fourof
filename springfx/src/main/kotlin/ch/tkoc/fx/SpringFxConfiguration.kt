package ch.tkoc.fx

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

//TODO fix entry point
@Configuration("ch.tkoc.fx.springFxConfiguration")
@EnableAspectJAutoProxy
@ComponentScan("ch.tkoc.fx")
class SpringFxConfiguration
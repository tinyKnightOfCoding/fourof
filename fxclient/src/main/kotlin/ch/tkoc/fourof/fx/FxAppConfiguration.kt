package ch.tkoc.fourof.fx

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScans
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@PropertySource("classpath:application.yaml")
@ComponentScans(ComponentScan("ch.tkoc.fourof.fx"))
class FxAppConfiguration

package ch.tkoc.fourof.fx

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScans
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.scheduling.annotation.EnableAsync

@Configuration
@EnableAsync
@PropertySource("classpath:application.properties")
@ComponentScans(ComponentScan("ch.tkoc.fourof.fx"))
class FxAppConfiguration

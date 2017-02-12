package ch.tkoc.fourof.fx.view

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope("prototype")
annotation class FxView(val initial: Boolean = false)
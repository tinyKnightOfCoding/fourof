package ch.tkoc.fx.view

import javafx.scene.Node
import kotlin.reflect.KProperty

interface ViewProperty<out T : Node> {
    operator fun getValue(view: View, property: KProperty<*>): T
}
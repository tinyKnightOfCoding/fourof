package ch.tkoc.fx

import ch.tkoc.fx.View
import javafx.scene.Node
import javafx.scene.control.ListView
import javafx.stage.Stage

class TestViewWrongType : View() {
    val root: Node by fxml()
    val element: ListView<Any> by fxid()

    override fun show(primaryStage: Stage) {
    }
}
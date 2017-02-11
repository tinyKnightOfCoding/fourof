package ch.tkoc.fourof.fx.view

import javafx.scene.Node
import javafx.scene.image.ImageView
import javafx.stage.Stage

class TestViewWithController : View() {

    val root: Node by fxml(hasController = true)
    val element: ImageView by fxid()

    override fun show(primaryStage: Stage) {
    }
}
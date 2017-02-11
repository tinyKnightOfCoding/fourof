package ch.tkoc.fourof.fx.view

import javafx.scene.Node
import javafx.scene.image.ImageView
import javafx.stage.Stage

class TestViewWrongId: View() {

    val root: Node by fxml()
    val element2: ImageView by fxid()

    override fun show(primaryStage: Stage) {
    }
}

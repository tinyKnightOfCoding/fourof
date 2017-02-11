package ch.tkoc.fourof.fx.view

import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import javafx.stage.Stage

class TestViewWithoutRootConstruct : View() {

    val root: Pane by fxml()
    val element: ImageView by fxid()

    override fun show(primaryStage: Stage) {

    }
}
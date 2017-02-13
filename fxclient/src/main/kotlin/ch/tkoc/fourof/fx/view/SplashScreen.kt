package ch.tkoc.fourof.fx.view


import ch.tkoc.fx.FxView
import ch.tkoc.fx.View
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

@FxView
class SplashScreen : View() {

    val root: Pane by fxml()

    override fun show(primaryStage: Stage) {
        primaryStage.isResizable = false
        primaryStage.scene = Scene(root)
        primaryStage.show()
    }
}
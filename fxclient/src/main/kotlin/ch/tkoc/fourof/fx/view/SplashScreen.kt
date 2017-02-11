package ch.tkoc.fourof.fx.view


import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

class SplashScreen: View() {

    val root: Pane by fxml()

    override fun show(primaryStage: Stage) {
        primaryStage.isResizable = false
        primaryStage.scene = Scene(root)
        primaryStage.show()
    }
}
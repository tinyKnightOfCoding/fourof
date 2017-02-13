package ch.tkoc.fourof.fx.view


import ch.tkoc.fx.FxView
import ch.tkoc.fx.View
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import javafx.stage.Stage

@FxView
class SplashScreen : View() {

    val root: Pane by fxml()
    val element: ImageView by fxid()

    init {
        element.image = Image(this.javaClass.getResourceAsStream("splashScreen.png"))
    }

    override fun show(primaryStage: Stage) {
        primaryStage.apply {
            title = "FourOf Application :D"
            isResizable = false
            scene = Scene(root)
            show()
        }
    }
}
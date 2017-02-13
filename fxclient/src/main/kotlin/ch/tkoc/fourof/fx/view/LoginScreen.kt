package ch.tkoc.fourof.fx.view

import ch.tkoc.fx.annotation.FxView
import ch.tkoc.fx.view.View
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.scene.layout.Pane
import javafx.stage.Stage
import javax.annotation.PostConstruct

@FxView
class LoginScreen : View() {

    val root: GridPane by fxml()
    val username: TextField by fxid()
    val password: PasswordField by fxid()
    val submit: Button by fxid()

    @PostConstruct
    fun setUp() {
    }

    override fun show(primaryStage: Stage) {
        primaryStage.apply {
            isResizable = true
            scene = Scene(root)
        }
    }
}
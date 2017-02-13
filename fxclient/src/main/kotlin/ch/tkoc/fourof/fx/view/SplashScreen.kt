package ch.tkoc.fourof.fx.view


import ch.tkoc.fx.annotation.FxTransition
import ch.tkoc.fx.annotation.FxView
import ch.tkoc.fx.view.View
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import javafx.stage.Stage
import org.springframework.scheduling.annotation.Async
import javax.annotation.PostConstruct

@FxView
class SplashScreen : View() {

    val root: Pane by fxml()
    val element: ImageView by fxid()

    @PostConstruct
    fun setUp() {
        element.image = Image(this.javaClass.getResourceAsStream("splashScreen.png"))
    }

    @Async
    fun waitAndTransition() {
        Thread.sleep(5000)
        println(Thread.currentThread())
    }

    @FxTransition
    fun transitionToLogin():String {
        println("transitionToLogin called")
        return "loginScreen"
    }

    override fun show(primaryStage: Stage) {
        primaryStage.apply {
            title = "FourOf Application :D"
            isResizable = false
            scene = Scene(root)
            show()
        }
        waitAndTransition()
    }
}
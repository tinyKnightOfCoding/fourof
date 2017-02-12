package ch.tkoc.fx

import javafx.stage.Stage
import org.springframework.stereotype.Component

@Component
class SpringFxApp {

    private val primaryStage: Stage = SpringFxLauncher.primaryStage!!

    fun switchToView(view: View) {
        view.show(primaryStage)
    }
}

package ch.tkoc.fx

import javafx.stage.Stage
import javax.annotation.PostConstruct

class SpringFxApp(private val initialView: View) {

    private val primaryStage: Stage = ch.tkoc.fx.primaryStage!!

    @PostConstruct
    fun showInitialView() {
        transitionToView(initialView)
    }

    private fun transitionToView(view: View) {
        view.show(primaryStage)
    }
}

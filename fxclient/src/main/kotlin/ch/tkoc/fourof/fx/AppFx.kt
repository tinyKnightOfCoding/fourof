package ch.tkoc.fourof.fx

import ch.tkoc.fourof.fx.view.View
import javafx.application.Application
import javafx.stage.Stage

class AppFx(private val initialView: View) : Application() {

    override fun start(primaryStage: Stage) {
        initialView.show(primaryStage)
    }
}
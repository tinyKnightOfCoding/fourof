package ch.tkoc.fourof.fx

import javafx.application.Application
import javafx.stage.Stage

class AppFx : Application() {

    var primaryStage: Stage? = null

    override fun start(primaryStage: Stage) {
        this.primaryStage = primaryStage
    }

    fun createStage() : Stage {
        if(primaryStage == null) {
            Application.launch()
        }
        return primaryStage!!
    }
}
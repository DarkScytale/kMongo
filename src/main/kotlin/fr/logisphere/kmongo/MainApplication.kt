package fr.logisphere.kmongo

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import java.util.*

class HelloApplication : Application() {

    // Resources definitions.
    private val interfaceBundle = ResourceBundle.getBundle("interface")

    // Server connexion definition.
    private var isConnected = false

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("main-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = interfaceBundle.getString("main_title")
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}
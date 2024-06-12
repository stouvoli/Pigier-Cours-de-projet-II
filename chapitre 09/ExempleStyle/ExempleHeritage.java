package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExempleHeritage extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Texte hérité");

        VBox root = new VBox(label);
        root.setStyle("-fx-font-size: 18px; -fx-text-fill: darkblue;");

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Exemple d'Héritage");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

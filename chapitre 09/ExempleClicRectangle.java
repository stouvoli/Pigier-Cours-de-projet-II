package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExempleClicRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Rectangle rect = new Rectangle(50, 50, 100, 80);
        rect.setFill(Color.LIGHTBLUE);

        Text coordsText = new Text(); // Pour afficher les coordonnées

        rect.setOnMouseClicked(event -> {
            double x = event.getX();
            double y = event.getY();
            coordsText.setText("Clic en (" + x + ", " + y + ")");
            rect.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        });

        root.getChildren().addAll(rect, coordsText);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Exemple Clic Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


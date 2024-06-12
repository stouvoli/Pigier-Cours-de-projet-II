package com.jdojo.intro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CombinedLayoutExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        // --- Contenu de la section supérieure (HBox) ---
        Label titleLabel = new Label("Formulaire d'Inscription");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        HBox topBox = new HBox(titleLabel);
        topBox.setAlignment(Pos.CENTER);
        topBox.setPadding(new Insets(20));

        // --- Contenu de la section centrale (GridPane) ---
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        gridPane.add(new Label("Nom :"), 0, 0);
        gridPane.add(new TextField(), 1, 0);
        gridPane.add(new Label("Email :"), 0, 1);
        gridPane.add(new TextField(), 1, 1);
        gridPane.add(new Label("Mot de passe :"), 0, 2);
        gridPane.add(new PasswordField(), 1, 2);

        // --- Contenu de la section inférieure (HBox) ---
        Button submitButton = new Button("Soumettre");
        Button cancelButton = new Button("Annuler");

        HBox bottomBox = new HBox(10, submitButton, cancelButton);
        bottomBox.setAlignment(Pos.CENTER);
        bottomBox.setPadding(new Insets(20));

        // --- Combinaison des sections dans un VBox principal ---
        VBox root = new VBox(10, topBox, gridPane, bottomBox);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Exemple de disposition combinée");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


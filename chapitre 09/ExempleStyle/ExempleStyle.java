package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExempleStyle extends Application {

	@Override
	public void start(Stage stage) {
		Button bouton = new Button("Cliquez ici !");
		bouton.setStyle("-fx-background-color: lightblue; -fx-text-fill: orange;"); // Style en ligne

		VBox root = new VBox(bouton);
		root.setStyle("-fx-background-color: lightgreen;"); // Style du parent

		Scene scene = new Scene(root, 300, 200);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
//		scene.getStylesheets().add("style.css"); // Feuille de style externe (style.css doit exister)

		stage.setScene(scene);
		stage.setTitle("Exemple de Styles");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

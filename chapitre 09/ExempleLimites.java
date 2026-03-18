package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExempleLimites extends Application {
	@Override
	public void start(Stage stage) {
		Rectangle rect = new Rectangle(50, 50, 100, 80); // x, y, largeur, hauteur
		rect.setFill(Color.LIGHTBLUE);

		HBox root = new HBox(rect);
		Scene scene = new Scene(root, 300, 250);
		stage.setScene(scene);
		stage.setTitle("Exemple de nœud et limites");
		stage.show();

		// Affichage des limites
		System.out.println("layoutBounds: " + rect.getLayoutBounds());
		System.out.println("boundsInLocal: " + rect.getBoundsInLocal());
		System.out.println("boundsInParent: " + rect.getBoundsInParent());
	}

	public static void main(String[] args) {
		launch(args);
	}
}


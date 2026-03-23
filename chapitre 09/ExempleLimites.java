package ci.pigier;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExempleLimites extends Application {

    @Override
    public void start(Stage stage) {
        // 1. Création de la forme logique pure (100x100)
        Rectangle rect = new Rectangle(100, 150, Color.LIGHTBLUE);
        rect.relocate(100, 100);

        // 2. Ajout d'un effet visuel (Ombre portée de rayon 10)
        rect.setEffect(new DropShadow(10, Color.BLACK));

        // 3. Ajout d'une transformation géométrique (Rotation de 45 degrés)
        rect.setRotate(45);

        // Utilisation d'un Group pour éviter les redimensionnements automatiques
        Group root = new Group(rect);
        Scene scene = new Scene(root, 300, 300);

        stage.setTitle("Analyse des Bounds");
        stage.setScene(scene);
        stage.show();

        // Analyse des mesures une fois la fenêtre affichée
        System.out.println("--- Mesures du Rectangle ---");
        System.out.println("layoutBounds   (Base)        : " + rect.getLayoutBounds());
        System.out.println("boundsInLocal  (+ Ombre)     : " + rect.getBoundsInLocal());
        System.out.println("boundsInParent (+ Rotation)  : " + rect.getBoundsInParent());
    }

    public static void main(String[] args) {
        launch(args);
    }
}

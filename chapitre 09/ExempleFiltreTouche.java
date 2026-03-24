package ci.pigier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExempleFiltreTouche extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();

        // Filtre pour ne laisser passer que les chiffres
        textField.addEventFilter(KeyEvent.KEY_TYPED, event -> {
            String character = event.getCharacter();
            if (!character.matches("[0-9]")) {
                event.consume(); // Bloque les caractères non numériques
            }
        });

        VBox root = new VBox(textField);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Exemple Filtre Touche");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


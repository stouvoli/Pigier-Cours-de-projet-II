package ci.pigier;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFXApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label nameLabel = new Label("Enter your name:");
        TextField nameField = new TextField();
        Label message = new Label();
        message.setStyle("-fx-text-fill: blue;");
        // Create buttons
        Button sayHelloButton = new Button("Say Hello");
        Button exitButton = new Button("Exit");
        // Add the event handler for the Say Hello button
        sayHelloButton.setOnAction(e -> {
            String name = nameField.getText();
            if (!name.trim().isEmpty()) {
                message.setText("Hello " + name);
            } else {
                message.setText("Hello there");
            }
        });
        // Add the event handler for the Exit button
        exitButton.setOnAction(e -> Platform.exit());
        // Create the root node
        VBox root = new VBox();
        // Set the vertical spacing between children to 5px
        root.setSpacing(5);
        // Marge de 5 pixels sur tous les côtés
        root.setPadding(new Insets(10));
        // Add children to the root node
        root.getChildren().addAll(nameLabel, nameField, message,sayHelloButton, exitButton);
        Scene scene = new Scene(root, 350, 150);
        stage.setScene(scene);
        stage.setTitle("Improved Hello JavaFX Application");
        stage.show();
    }
}

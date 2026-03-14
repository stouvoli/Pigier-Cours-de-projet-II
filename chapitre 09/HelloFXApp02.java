package com.jdojo.intro;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloFXApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// Set a title for the stage
		 stage.setTitle("Hello JavaFX Application");
		 // Show the stage
		 stage.show();
	}
}

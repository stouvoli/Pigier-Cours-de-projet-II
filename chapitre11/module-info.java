module NoteTakingApp {
	requires transitive javafx.graphics;
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.controls;
	opens ci.pigier to javafx.fxml;
	opens ci.pigier.controllers.ui to javafx.fxml;
	opens ci.pigier.model to javafx.fxml;
	exports ci.pigier;
	exports ci.pigier.controllers.ui;
	exports ci.pigier.model;
}
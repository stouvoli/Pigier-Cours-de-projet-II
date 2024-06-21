module HelloFX {
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	opens com.jdojo.intro to javafx.fxml;
	exports com.jdojo.intro;
}
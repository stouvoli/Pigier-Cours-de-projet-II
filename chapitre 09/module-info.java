module ci.pigier {
    requires javafx.controls;
    requires javafx.fxml;
    opens ci.pigier to javafx.graphics, javafx.fxml;
    exports ci.pigier;
}

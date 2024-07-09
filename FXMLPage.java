package ci.pigier.ui;

import java.net.URL;

public enum FXMLPage {
    LIST("/ci/pigier/ui/fxml/ListNotesUI.fxml"),
    ADD("/ci/pigier/ui/fxml/AddEditUI.fxml");

    private final String location;

    FXMLPage(String location) {
        this.location = location;
    }

    public URL getPage() {
        return  getClass().getResource(location) ;
    }
}

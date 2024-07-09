package ci.pigier.controllers.ui;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import ci.pigier.controllers.BaseController;
import ci.pigier.model.Note;
import ci.pigier.ui.FXMLPage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class AddEditUIController extends BaseController implements Initializable {

    @FXML
    private TextArea descriptionTxtArea;

    @FXML
    private Button saveBtn;

    @FXML
    private TextField titleTxtFld;

    @FXML
    void doBack(ActionEvent event) throws IOException {
    	navigate(event, FXMLPage.LIST.getPage());
    }

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doSave(ActionEvent event) throws IOException {
        if (Objects.nonNull(editNote)) 
            data.remove(editNote);
        
        if (titleTxtFld.getText().trim().equals("")
                || descriptionTxtArea.getText().trim().equals("")) {
        	alert = new Alert(AlertType.WARNING);
            alert.setTitle("Warning Dialog");
            alert.setHeaderText("Invalid data to save or update!");
            alert.setContentText("Note title or description can not be empty!");
            alert.showAndWait();
            return;
        }

        data.add(new Note(titleTxtFld.getText(), descriptionTxtArea.getText()));
        navigate(event, FXMLPage.LIST.getPage());
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    if (Objects.nonNull(editNote)) {
	        titleTxtFld.setText(editNote.getTitle());
	        descriptionTxtArea.setText(editNote.getDescription());
	        saveBtn.setText("Mettre à jour");
	    }
	}

}

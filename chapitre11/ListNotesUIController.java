package ci.pigier.controllers.ui;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import ci.pigier.controllers.BaseController;
import ci.pigier.model.Note;
import ci.pigier.ui.FXMLPage;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListNotesUIController extends BaseController implements Initializable {

	@FXML
	private TableColumn<?, ?> descriptionTc;

	@FXML
	private Label notesCount;

	@FXML
	private TableView<Note> notesListTable;

	@FXML
	private TextField searchNotes;

	@FXML
	private TableColumn<?, ?> titleTc;

	@FXML
	void doDelete(ActionEvent event) {

	}

	@FXML
	void doEdit(ActionEvent event) throws IOException {
		editNote = null;
		editNote = getItem();
		if (Objects.nonNull(editNote)) {
			navigate(event, FXMLPage.ADD.getPage());
		}
	}

	@FXML
	void newNote(ActionEvent event) throws IOException {
		editNote = null;
		navigate(event, FXMLPage.ADD.getPage());
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		FilteredList<Note> filteredData = new FilteredList<>(data, n -> true);
		searchNotes.setOnKeyReleased(e -> {
			filteredData.setPredicate(n -> {
				if (searchNotes.getText() == null || searchNotes.getText().isEmpty())
					return true;
				return n.getTitle().contains(searchNotes.getText())
						|| n.getDescription().contains(searchNotes.getText());
			});
		});
		notesListTable.setItems(filteredData);
		titleTc.setCellValueFactory(new PropertyValueFactory<>("title"));
		descriptionTc.setCellValueFactory(new PropertyValueFactory<>("description"));
	}

	private Note getItem() {
		return Note.class.cast(notesListTable.getSelectionModel().getSelectedItem());
	}

}

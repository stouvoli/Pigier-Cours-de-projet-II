package ci.pigier.controllers;

import java.io.IOException;
import java.net.URL;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BaseController {
		protected Alert alert;
	protected static Note editNote = null;
	
	protected static ObservableList<Note> data =
			 FXCollections.<Note>observableArrayList(
			 new Note("Note 1", "Description of note 41"),
			 new Note("Note 2", "Description of note 32"),
			 new Note("Note 3", "Description of note 23"),
			 new Note("Note 4", "Description of note 23"),
			 new Note("Note 5", "Description of note 23"),
			 new Note("Note 6", "Description of note 23"),
			 new Note("Note 7", "Description of note 23"),
			 new Note("Note 8", "Description of note 23"),
			 new Note("Note 9", "Description of note 23"),
			 new Note("Note 10", "Description of note 23"),
			 new Note("Note 11", "Description of note 23"),
			 new Note("Note 12", "Description of note 23"),
			 new Note("Note 13", "Description of note 23"),
			 new Note("Note 14", "Description of note 23"),
			 new Note("Note 15", "Description of note 23"),
			 new Note("Note 16", "Description of note 23"),
			 new Note("Note 17", "Description of note 23"),
			 new Note("Note 18", "Description of note 14"));
			 
	protected void navigate(Event event, URL fxmlDocName) throws IOException {
		// Chargement du nouveau document FXML de l'interface utilisateur
		Parent pageParent = FXMLLoader.load(fxmlDocName);
		// Création d'une nouvelle scène
		Scene scene = new Scene(pageParent);
		// Obtention de la scène actuelle
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		// Masquage de l'ancienne scène (facultatif)
		appStage.hide(); // facultatif
		// Définition de la nouvelle scène pour la scène
		appStage.setScene(scene);
		// Affichage de la scène
		appStage.show();
	}
}

package it.polito.tdp.libretto;
	
import it.polito.tdp.libretto.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Libretto.fxml"));// Creazione del oggetto loader
			BorderPane root = (BorderPane)loader.load();// Caricamento della vista
			// Il metodo FXMLLoader � un metodo statico che chiama un oggetto senza l'aver creato
			
			LibrettoController controller = loader.getController();
			Model model = new Model();
			controller.setModel(model);// Su qual model deve lavorare
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

// Desarrollado por PacMan Company

package application;	
//import audio.libreriaAudio;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Inicio.fxml"));
			
			ControladorIni control = new ControladorIni();
			
			loader.setController(control);
			
			Parent root = loader.load();
			
			primaryStage.setScene(new Scene(root));
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	
	     //  libreriaAudio audio = new libreriaAudio();
	    //  audio.musica();
		
		
	}
}
// 
//desarrollado por PACMAN company
//

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControladorIni {
	libreriaAudio reproduce1 = new libreriaAudio();
    
    @FXML
    private Label TextCatMan;
    
    @FXML
    private Label TextEquipo;

    @FXML
    private Label textSofia;

    @FXML
    private Label TextFred;

    @FXML
    private Label TextJose;

    @FXML
    private Label TextJohnny;
    
    @FXML
    private TextField TextJugador;
    
    @FXML
    private Button BotonJugar;
       @FXML
    // void EventoSiguiente(ActionEvent event) {
    // 	@SuppressWarnings("unused")
	// 	String texto = TextJugador.getText();	
    // 	reproduce1.SonidoJugar();

	// 	try {
	// 		FXMLLoader loader = new FXMLLoader(getClass().getResource("ranking.fxml"));
	// 		Parent root = loader.load();
	// 		Stage stage = new Stage();
	// 		stage.setTitle("CatMan");
	// 		Controller controller = loader.getController();
	// 		root.setOnKeyPressed(controller);
	// 		double sceneWidth = controller.getBoardWidth() + 20.0;
	// 		double sceneHeight = controller.getBoardHeight() + 100.0;
	// 		stage.setScene(new Scene(root, sceneWidth, sceneHeight));
	// 		stage.initModality( Modality.WINDOW_MODAL);
	// 		stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
	// 		stage.show();
	// 		root.requestFocus();
			
			
	// 	} catch(Exception e) {
	// 		e.printStackTrace();
	// 	}

	// }
    
	// void EventoJugar(ActionEvent event){
    // 		try {
    // 			FXMLLoader loader = new FXMLLoader(getClass().getResource("pacman.fxml"));
    // 	        Parent root = loader.load();
    // 	        Stage stage = new Stage();
	// 			stage.setTitle("CatMan");
    // 	        Controller controller = loader.getController();
    // 	        root.setOnKeyPressed(controller);
    // 	        double sceneWidth = controller.getBoardWidth() + 20.0;
    // 	        double sceneHeight = controller.getBoardHeight() + 100.0;
    // 	        stage.setScene(new Scene(root, sceneWidth, sceneHeight));
    // 	        stage.initModality( Modality.WINDOW_MODAL);
    // 	        stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
    // 	        stage.show();
    // 	        root.requestFocus();
    	        
    			
    // 		} catch(Exception e) {
    // 			e.printStackTrace();
    // 		}

    // }

	void EventoJugar(ActionEvent event) {
    	@SuppressWarnings("unused")
		String texto = TextJugador.getText();	
    	reproduce1.SonidoJugar();
    	
    		try {
    			FXMLLoader loader = new FXMLLoader(getClass().getResource("pacman.fxml"));
    	        Parent root = loader.load();
    	        Stage stage = new Stage();
				stage.setTitle("CatMan");
    	        Controller controller = loader.getController();
    	        root.setOnKeyPressed(controller);
    	        double sceneWidth = controller.getBoardWidth() + 20.0;
    	        double sceneHeight = controller.getBoardHeight() + 100.0;
    	        stage.setScene(new Scene(root, sceneWidth, sceneHeight));
    	        stage.initModality( Modality.WINDOW_MODAL);
    	        stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
    	        stage.show();
    	        root.requestFocus();
    	        
    			
    		} catch(Exception e) {
    			e.printStackTrace();
    		}

    }
    

}

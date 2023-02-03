//desarrollado por PACMAN company

package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class ControlRanking {
	RankingDoc rankingdoc2 = new RankingDoc();
	
	@FXML
    private Label Titulo;

    @FXML
    private Label TextTituloTresPrimeros;

    @FXML
    private TextArea ListaRankig;
    
    public void startRank () {  
     	ListaRankig.setText(rankingdoc2.leerRanking());

    }
   
    
    @FXML
    private Button Cerrar;

    @FXML
    void EventCerrarVentana() {
    //	ActionEvent e = null;
	//	cerrarVentana();
    }
   
  //  public static void cerrarVentana() {
    
  //  	try {
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("RankingScreen.fxml"));
	//        Parent root = loader.load();
	 //       Stage stage = new Stage();
	//		Controller controller = loader.getController();
	 //       stage.close();
	        
			
	//	} catch(Exception e) {
	//		e.printStackTrace();
	//	}
    		
    		
    
      
}

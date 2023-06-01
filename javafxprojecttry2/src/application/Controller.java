package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	//this controller is contain scene switches// except cartemenu & chkout
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void comboMenu(ActionEvent event) throws IOException {//go to combo menu from general menu
		//navigate to combo menu scene
		//System.out.println("comboMenu"); // check
		Parent root = FXMLLoader.load(getClass().getResource("Scn2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Combo Menu");
		stage.show();
	}
	
	public void carteMenu(ActionEvent event) throws IOException {// go to a la carte menu from general menu
		//navigate to carte menu scene
		//System.out.println("carteMenu"); // check
		Parent root = FXMLLoader.load(getClass().getResource("CarteMenu.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("A La Carte Menu");
		stage.show();
	}
	
//	public void checkout(ActionEvent event) throws IOException {// go to checkout from a la carte
//		Parent root = FXMLLoader.load(getClass().getResource("chkout.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.setTitle("Check Out");
//		stage.show();
//	}
	
//	public void confirm(ActionEvent event) throws IOException {// go to thank you from checkout
//		Parent root = FXMLLoader.load(getClass().getResource("Thank_You.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.setTitle("Thank You");
//		stage.show();
//	}
	
}

package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CheckOutController implements Initializable{

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	Label ChickenLabel;
	@FXML
	Label HamburgerLabel;
	@FXML
	Label CheeseBurgerLabel;
	@FXML
	Label FriesLabel;
	@FXML
	Label SoftDrinkLabel;
	
	
	
	public void displayOrder(int no_chicken, int no_hamburger, int no_cheeseburger, int no_fries, int no_softdrink) {
		ChickenLabel.setText(Integer.toString(no_chicken));
		HamburgerLabel.setText(Integer.toString(no_hamburger));
		CheeseBurgerLabel.setText(Integer.toString(no_cheeseburger));
		FriesLabel.setText(Integer.toString(no_fries));
		SoftDrinkLabel.setText(Integer.toString(no_softdrink));
		
	}		
	
	
	public void confirm(ActionEvent event) throws IOException {// go to thank you from checkout
		
		
		Parent root = FXMLLoader.load(getClass().getResource("Thank_You.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Thank You");
		stage.show();
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//make password shown as symbol
		
		
	}



	

}

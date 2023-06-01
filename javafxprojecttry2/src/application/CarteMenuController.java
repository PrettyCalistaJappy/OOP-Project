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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

public class CarteMenuController implements Initializable{//this include controller from carte menu
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private Spinner<Integer> Chicken;
	@FXML
	private Spinner<Integer> Hamburger;
	@FXML
	private Spinner<Integer> CheeseBurger;
	@FXML
	private Spinner<Integer> Fries;
	@FXML
	private Spinner<Integer> SoftDrink;
	
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
	
	int no_chicken;
	int no_hamburger;
	int no_cheeseburger;
	int no_fries;
	int no_softdrink;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		SpinnerValueFactory<Integer> chicken_val = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
		SpinnerValueFactory<Integer> hamburger_val = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
		SpinnerValueFactory<Integer> cheeseburger_val = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
		SpinnerValueFactory<Integer> fries_val = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
		SpinnerValueFactory<Integer> softdrink_val = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
	
		chicken_val.setValue(0);
		hamburger_val.setValue(0);
		cheeseburger_val.setValue(0);
		fries_val.setValue(0);
		softdrink_val.setValue(0);
		
		Chicken.setValueFactory(chicken_val);
		Hamburger.setValueFactory(hamburger_val);
		CheeseBurger.setValueFactory(cheeseburger_val);
		Fries.setValueFactory(fries_val);
		SoftDrink.setValueFactory(softdrink_val);
		

	}
	
	@FXML
	public void checkout(ActionEvent event) throws IOException {// go to checkout from a la carte
		
		//get the final spinner value
		no_chicken = Chicken.getValue();
		no_hamburger = Hamburger.getValue();
		no_cheeseburger = CheeseBurger.getValue();
		no_fries = Fries.getValue();
		no_softdrink = SoftDrink.getValue();
		
		//		System.out.println(no_chicken + no_hamburger + no_cheeseburger + no_fries + no_softdrink);		
		

		//move
		FXMLLoader loader = new FXMLLoader(getClass().getResource("chkout.fxml"));
		root = loader.load();
		CheckOutController CheckOutController = loader.getController();
		CheckOutController.displayOrder(no_chicken, no_hamburger, no_cheeseburger, no_fries, no_softdrink);
		
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Check Out");
		stage.show();
	}
		
	
		
}

package events;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private TextField nameField;
	@FXML
	private Button helloButton;
	@FXML
	private Button byeButton;
	@FXML
	private CheckBox myCheckBox;
	
	@FXML
	public void initialize() {
		helloButton.setDisable(true);
		byeButton.setDisable(true);
	}
	
	@FXML
	public void onButtonClicked(ActionEvent e) {
		if(e.getSource().equals(helloButton)) {
			System.out.println("Hello, " + nameField.getText() + "!");
		} else if (e.getSource().equals(byeButton)) {
			System.out.println("Bye, " + nameField.getText() + "!");
		}
		
		if(myCheckBox.isSelected()) {
			nameField.clear();
			
			helloButton.setDisable(true);
			byeButton.setDisable(true);
		}
	}
	
	@FXML
	public void handleKeyReleased() {
		String text = nameField.getText();
		boolean buttonDisabled = text.isEmpty() || text.trim().isEmpty();
		
		helloButton.setDisable(buttonDisabled);
		byeButton.setDisable(buttonDisabled);
	}
	
	@FXML
	public void handleCheckBoxStateChanged() {
		System.out.println("The checkbox is " + (myCheckBox.isSelected() ? "checked." : "not checked."));
	}
	
}

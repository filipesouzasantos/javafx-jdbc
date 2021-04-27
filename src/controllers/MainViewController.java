package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemEmployee;
	
	@FXML
	private MenuItem menuItemDepartament;
	
	@FXML
	private MenuItem menuItemAbout;
	
	
	@FXML
	public void onMenuItemEmployeeAction() {
		System.out.println("menuItemEmployee");
	}
	
	@FXML
	public void onMenuItemDepartamentAction() {
		System.out.println("menuItemDepartament");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("menuItemAbout");
	}

	@Override
	public void initialize(URL url, ResourceBundle srcb) {
		
		
	}

}

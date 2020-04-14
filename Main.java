package application;
	
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	public static String green_wrestler;
	public static String red_wrestler;

	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			//imports fxml file with the user interface
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("GUI.fxml"));
			//defines the scene size
			Scene scene = new Scene(root,640,400);
			//applies styling to the program NONE YET
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//Displays the scene
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter Red Wrestler:");//asks for the 
    	red_wrestler = scan.nextLine();
    	System.out.println("Enter Green Wrestler:");
    	green_wrestler = scan.nextLine();

		launch(args);
	}
	//returns the name of the red wrestler
	public String getRed() {
		return red_wrestler;
	}
	//returns the name of the green wrestler
	public String getGreen() {
		return green_wrestler;
	}
}

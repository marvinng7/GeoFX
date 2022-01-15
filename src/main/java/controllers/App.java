package controllers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Stage primaryStage;	
	
	
	
	private Controller vi;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		vi = new Controller();
		
		App.primaryStage = primaryStage;
		Scene scene = new Scene(vi.getView());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
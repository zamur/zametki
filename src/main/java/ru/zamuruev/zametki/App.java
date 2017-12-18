package ru.zamuruev.zametki;

import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Hello world!
 *
 */
public class App extends javafx.application.Application {
    public static void main( String[] args )
    {
        App.launch(args);
        
        
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Notes");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ClassLoader.getSystemResource("Layout.fxml"));
		Parent rootLayout = loader.load();
		
		Scene scene = new Scene(rootLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
}

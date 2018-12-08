package app;

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//change the name to MainPage
public class MainPage extends Application{

	private Stage primaryStage;
    private BorderPane rootLayout;
		@Override
	    public void start(Stage primaryStage) {
	        this.primaryStage = primaryStage;
	      //Change title to All the Feels
	        this.primaryStage.setTitle("All the Feels");

		initRootLayout();
		showMainPage();

		
	}
	
		  /**
	     * Initializes the root layout.
	     */
	    public void initRootLayout() {
	        try {
	            // Load root layout from fxml file.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainPage.class.getResource("RootLayout.fxml"));
	            rootLayout = (BorderPane) loader.load();
	            
	            // Show the scene containing the root layout.
	            Scene scene = new Scene(rootLayout);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }


    public void showMainPage() {
        try {
            // Load main page.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainPage.class.getResource("MainPage.fxml"));
            BorderPane MainPage = (BorderPane) loader.load();
            
            // Set main page into the centre of root layout.
            rootLayout.setCenter(MainPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//    /**
//     * Returns the mood file preference, i.e. the file that was last opened.
//     * The preference is read from the OS specific registry. If no such
//     * preference can be found, null is returned.
//     * 
//     * @return
//     */
//    public File getPersonFilePath() {
//        Preferences prefs = Preferences.userNodeForPackage(MainPage.class);
//        String filePath = prefs.get("filePath", null);
//        if (filePath != null) {
//            return new File(filePath);
//        } else {
//            return null;
//        }
//    }
//
//    /**
//     * Sets the file path of the currently loaded file. The path is persisted in
//     * the OS specific registry.
//     * 
//     * @param file the file or null to remove the path
//     */
//    public void setMoodFilePath(File file) {
//        Preferences prefs = Preferences.userNodeForPackage(MainPage.class);
//        if (file != null) {
//            prefs.put("filePath", file.getPath());
//
//            // Update the stage title.
//            primaryStage.setTitle("MoodApp - " + file.getName());
//        } else {
//            prefs.remove("filePath");
//
//            // Update the stage title.
//            primaryStage.setTitle("All the Feels");
//        }
//    }
//    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
	public static void main(String[] args) {
		launch(args);
	}

}

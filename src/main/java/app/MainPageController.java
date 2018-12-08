package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button Settings_Btn;

    @FXML
    private Button Stats_Btn;

    @FXML
    private Button addMood_Btn;

    public void pressAddButton(ActionEvent event) throws Exception {               
        try {
       Pane addPane = (Pane)FXMLLoader.load(getClass().getResource("add_mood_log.fxml"));
       Stage stage = new Stage();
       stage.setScene(new Scene(addPane));  
       stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
}
    public void pressStatsButton(ActionEvent event) throws Exception {               
        try {
       Pane addPane = (Pane)FXMLLoader.load(getClass().getResource("StatsPage.fxml"));
       Stage stage = new Stage();
       stage.setScene(new Scene(addPane));  
       stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
}

    public void pressSettingsButton(ActionEvent event) throws Exception {               
        try {
       Pane addPane = (Pane)FXMLLoader.load(getClass().getResource("SettingsPage.fxml"));
       Stage stage = new Stage();
       stage.setScene(new Scene(addPane));  
       stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
}
}

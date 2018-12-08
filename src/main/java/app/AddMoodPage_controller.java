package app;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import app.model.Mood;
import app.model.Saving;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AddMoodPage_controller implements Initializable{
	
	private String note;
	private String timeOfDay;
	private Date dateTime;
	private String chosenMood;
    
	@FXML
	private TextArea text;
	
	@FXML
    private Button UploadPicture_Btn;
	
	@FXML
    private Button Submit_Btn;
	
    @FXML
    private ComboBox<String> mood;
	
    @FXML
    private ImageView image1;

	@FXML
	void SUBMIT(ActionEvent event) {
		//getting the note
		note=text.getText();
		//finding the time frame
		dateTime = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("HH");
		String hour = (ft.format(dateTime)).toString();
		int theHour = Integer.parseInt(hour);
		if((theHour<=11) && (theHour>=6)) {timeOfDay="Morning";}
		else if ((theHour<=17) && (theHour>=12)) {timeOfDay="Afternoon";}
		else if ((theHour<=23) && (theHour>=18)) {timeOfDay="Evening";}
		else if ((theHour<=5) && (theHour>=0)) {timeOfDay="Night";}
		//getting mood string
		chosenMood = mood.getSelectionModel().getSelectedItem().toString();
		//creating the mood object to be saved
		Mood theMoodObj = new Mood();
		theMoodObj.setMood(chosenMood);
		theMoodObj.setNote(note);
		theMoodObj.setTimeFrame(timeOfDay);
		String s = Integer.toString(theMoodObj.getId());
		Saving.WriteObjectToFile(theMoodObj, "moodStoring\\"+s+".ser");
	}

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		mood.getItems().addAll("Amazing","Good","Okay","Bad","Terrible");
	}
		   
	@FXML
	void SubmitPhoto(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
              
        //Show open file dialog
        File file = fileChooser.showOpenDialog(null);
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            Image image = SwingFXUtils.toFXImage(bufferedImage, null);
            image1.setImage(image);
         
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
}



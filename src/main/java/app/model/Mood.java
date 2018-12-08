package app.model;

import java.awt.image.BufferedImage;
import java.io.Serializable;

public class Mood implements Serializable {
private static final long serialVersionUID = 1L;
private int id;
private String mood;
private String note;
private String timeFrame;
private BufferedImage image;

public Mood() {}

public int getId() {
	return this.id;
}

public void setId(int i) {
	this.id = i;
}

public String getMood() {
	return this.mood;
}

public void setMood(String s) {
	this.mood = s;
}

public String getNote() {
	return this.note;
}

public void setNote(String s) {
	this.note = s;
}

public String getTimeFrame() {
	return timeFrame;
}

public void setTimeFrame(String timeFrame) {
	this.timeFrame = timeFrame;
}

public BufferedImage getImage() {
	return image;
}

public void setImage(BufferedImage image) {
	this.image = image;
}


}

package app.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Saving {
	//static Class<?> c = Saving.class;
	//static String path = c.getResource(c.getSimpleName() + ".class").getPath().replace(c.getSimpleName() + ".class", "");
	
	/*
	*!!! String path needs to be modified to the actual path you have the model package on your computer
	*(at least until I figure out how to do it automatically)
	*/
		
	static String path = "s_home//kk328//co2012-1819-cw2-group-12//src//main//java//app//model//";
	public static void WriteObjectToFile(Mood moodObj, String filepath) {
		 try { 
		 FileOutputStream fileOut = new FileOutputStream(path + filepath);
		 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		 objectOut.writeObject(moodObj);
		 objectOut.close();
		 } catch (Exception ex) {
		ex.printStackTrace();
		}
	}
//	public static Mood ReadObjectFromFile() {
//		
//	try {
//	// read object from file
//	FileInputStream fis = new FileInputStream(filepath);
//	ObjectInputStream ois = new ObjectInputStream(fis);
//	Mood result = (Mood) ois.readObject();
//	ois.close();
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	} catch (ClassNotFoundException e) {
//		e.printStackTrace();}
//	return result;
//}
	}

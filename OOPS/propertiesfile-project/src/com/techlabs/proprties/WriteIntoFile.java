package com.techlabs.proprties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteIntoFile {

	public static void main(String args[]) throws IOException
	{
		Properties props = new Properties();
        FileOutputStream fos = new FileOutputStream("state.properties");
      
        props.setProperty("Maharashtra", "Mumbai");
        props.setProperty("Goa", "Panaji");
        props.setProperty("Gujarat", "Vadodara");
        props.setProperty("Madya Pradesh", "Bhopal");
        props.setProperty("Andhra Pradesh","Hyderabad");
        props.setProperty("Arunachal Pradesh","Itanagar");
        props.setProperty("Assam","Dispur");
        props.setProperty("Bihar","Patna");
        props.setProperty("Chhattisgarh","Raipur");
        props.setProperty("Gujarat","Gandhinagar");
        props.setProperty("Haryana","Chandigarh");
        props.setProperty("Himachal Pradesh","Shimla");
        props.setProperty("Jammu and Kashmir","Srinagar");
        props.setProperty("Jharkhand","Ranchi");
        props.setProperty("Karnataka","Bengaluru");
      
       
        props.store(fos, "Properties file generated from Java program");
      
        fos.close();
	}
}

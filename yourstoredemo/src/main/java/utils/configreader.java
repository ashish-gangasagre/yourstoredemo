package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configreader {

public static Properties intializeProperties() {
	
	Properties prop= new Properties();
	File profile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
	
	try {
		FileInputStream fis = new FileInputStream(profile);
	    prop.load(fis);
	
	}catch(Throwable e) {
		e.printStackTrace();
	
	}


   return prop;

}



}
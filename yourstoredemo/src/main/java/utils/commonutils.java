package utils;

import java.util.Date;

public class commonutils { 
	
public static String getEmailwithTimeStamp() {
		
		Date date=new Date();
		return "ashishgangasagre"+date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
	}

}

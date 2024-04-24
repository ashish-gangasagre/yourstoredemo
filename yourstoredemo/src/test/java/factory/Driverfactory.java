package factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utils.configreader;

public class Driverfactory {
	
	static WebDriver driver = null;
	
	public static WebDriver initializeBrowser(String BrowserName) {
	
		
		
		if(BrowserName.equals("Chrome")) {
			
			driver=new ChromeDriver();
			
		}else if(BrowserName.equals("firefox")) {
			
		    driver=new FirefoxDriver();
			
		}else if(BrowserName.equals("edge")) {
			
		    driver= new EdgeDriver();
			
		}else if(BrowserName.equals("safari")) {
			
			 driver= new SafariDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		
	}
	
	public static WebDriver getdriver() {
		
		return driver;
		
	}

}

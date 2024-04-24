package Hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.configreader;

public class MyHooks {
	
	
	WebDriver driver;
	
	@Before
	public void Setup() {
		
		Properties prop =configreader.intializeProperties();
		
		driver=Driverfactory.initializeBrowser(prop.getProperty("browser"));
	
		driver.get(prop.getProperty("url"));
		
		
		
	}
	@After
	public void teardown() {
		driver.quit();
		
	}

}

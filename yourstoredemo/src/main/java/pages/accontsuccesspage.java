package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accontsuccesspage {
	
	WebDriver driver;
	
	public accontsuccesspage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement pageheading;
	
	
	public String getpageheading() {
		return pageheading.getText();
	}
	//*[id='content']/foolowing-sibling::h1
	
	//div[contains(@class,'alert-danger')]
	
	
	
	
}

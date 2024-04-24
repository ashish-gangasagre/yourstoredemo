package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage {
	
	WebDriver driver;
	
	public searchpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="HP LP3065")
	private WebElement validhpproduct;
	
	@FindBy(xpath="//*[@id='button-search']/following-sibling::p")
	private WebElement messagetext; 
	
	
	
	public boolean displaystatusofvalidproduct() {
		return validhpproduct.isDisplayed();
	}
	
	public String getmessagetext() {
		return messagetext.getText();
	}

}

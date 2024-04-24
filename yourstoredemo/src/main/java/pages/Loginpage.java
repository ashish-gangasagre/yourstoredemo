package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="input-email")
	private WebElement emailfield;
	
	@FindBy(id="input-password")
	private WebElement inpassword;
	
	@FindBy(xpath="//*[@type='submit']")
		private WebElement submit;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement warningmessage;
	
	
	
	public void enteremail(String emailtext) {
		emailfield.sendKeys(emailtext);
		
	}
	public void enterpassword(String passwordtext) {
		
		inpassword.sendKeys(passwordtext);
	}
	public Accountpage clickonsubmit() {
		
		submit.click();
		return new Accountpage(driver);
	}
	public String getwarningmessagetext() {
		
		return warningmessage.getText();
	}
	
	
	
}

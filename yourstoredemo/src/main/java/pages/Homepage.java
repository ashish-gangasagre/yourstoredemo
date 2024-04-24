package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
public Homepage(WebDriver driver) {
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}	

@FindBy(xpath="(//*[text()='My Account'])[1]")
 private WebElement myaccountdropmenu;

@FindBy(linkText="Login")
private WebElement loginoption;	

@FindBy(linkText="Register")
private WebElement Register;

@FindBy(name="search")
private WebElement searchfield;

@FindBy(xpath="(//*[contains(@class,'btn-default')])[1]")
private WebElement searchclick;



public void clickonmyaccount() {
	myaccountdropmenu.click();
}
public Loginpage selectloginoption() {
	loginoption.click();
	
	return new Loginpage(driver);
}
public registerpage clickonregister() {
	Register.click();
	return new registerpage(driver);
}
public void entertextintosearchbox(String producttext) {
	searchfield.sendKeys(producttext);
}
public searchpage clickonsearch() {
	searchclick.click();
	return new searchpage(driver);
}


}

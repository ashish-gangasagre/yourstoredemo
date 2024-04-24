package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {

	WebDriver driver;
	
public registerpage(WebDriver driver) {
	
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	
}	
	
@FindBy(id="input-firstname")
private WebElement firstname;

@FindBy(id="input-lastname")
private WebElement lastname;

@FindBy(id="input-email")
private WebElement emailfield;

@FindBy(id="input-telephone")
private WebElement telephone;

@FindBy(id="input-password")
private WebElement passwordfield;

@FindBy(id="input-confirm")
private WebElement confrmpassfield;

@FindBy(name="agree")
private WebElement iagree;

@FindBy(xpath="//*[@value='Continue']")
private WebElement continuebttn;

@FindBy(xpath="(//*[@name='newsletter'])[1]")
private WebElement yesnewsletteroption;

@FindBy(xpath="//div[contains(@class,'alert-danger')]")
private WebElement duplicatewarning;

@FindBy(xpath="//*[contains(@class,'alert-dismissible')]")
private WebElement alert;

@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
private WebElement firstnanewarng;

@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
private WebElement lastnamewarng;

@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
private WebElement emailwarng;

@FindBy(xpath="//*[@id='input-telephone']/following-sibling::div")
private WebElement telephonewarng;

@FindBy(xpath="//*[@id='input-password']/following-sibling::div")
private WebElement passwarng;




public void enterfirstname(String firstnametext) {
	firstname.sendKeys(firstnametext);
}
public void enterlastname(String lastnametext) {
	lastname.sendKeys(lastnametext);
}
public void enteremail(String emailtext) {
	emailfield.sendKeys(emailtext);
}
public void entertelphone(String telephonetext) {
	telephone.sendKeys(telephonetext);
}	
public void enterpassword(String passwordtext) {
	passwordfield.sendKeys(passwordtext);
}	
public void enterconfrmpass(String confrmpasstext){
	confrmpassfield.sendKeys(confrmpasstext);
}
public void clickoniagree() {
	iagree.click();
}
public accontsuccesspage clickoncontinue() {
	continuebttn.click();
	return new accontsuccesspage(driver);
}
public void clickonyesnewsletter() {
	yesnewsletteroption.click();
}
public String getproperwrnung() {
	return duplicatewarning.getText();
}
public String getallert() {
	return alert.getText();
}
public String getfirstnamewarng() {
	return firstnanewarng.getText();
}
public String getlastnamewarng() {
	return lastnamewarng.getText();
}
public String getemailwarng() {
	return emailwarng.getText();
}
public String gettelephonewarng() {
	return telephonewarng.getText();
}
public String getpasswarng() {
	return passwarng.getText();
}
 

}

package stepdefinations;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.Accountpage;
import pages.Homepage;
import pages.Loginpage;
import utils.commonutils;

public class Login {
	  WebDriver driver;
	 private Loginpage Loginp;
	 private Accountpage accpage;
	  
	
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() {
		
	    driver=Driverfactory.getdriver();
	    
	    Homepage homepage = new Homepage(driver);
	   
	    homepage.clickonmyaccount();
	    Loginp=homepage.selectloginoption();
		
	    
	}
	
	

	@When("User has entered valid email address {string} into email field")
	public void user_has_entered_valid_email_address_into_email_field(String emailtext) {
		 Loginp = new Loginpage(driver);
		Loginp.enteremail(emailtext);
		
	}

	@And("User entered valid password {string} into password field")
	public void user_entered_valid_password_into_password_field(String passwordtext) {
		Loginp.enterpassword(passwordtext);
	}

	@And("User should click on login button")
	public void user_should_click_on_login_button() {
		accpage = Loginp.clickonsubmit();
	   
	}

	@Then("User should succefully login")
	public void user_should_succefully_login() {
		
		
	    Assert.assertTrue(accpage.verifylogin());
	  
	}

	@When("User has entered invalid email address into email field")
	public void user_has_entered_invalid_email_address_into_email_field() {
		
		Loginp.enteremail(commonutils.getEmailwithTimeStamp());
		
	}

	@When("User entered invalid password {string} into password field")
	public void user_entered_invalid_password_into_password_field(String invalidpasswordtext) {
		Loginp.enterpassword(invalidpasswordtext);
		
	}

	
	@Then("User should get aproper error message about credentials mismatch")
	public void user_should_get_aproper_error_message_about_credentials_mismatch() {
		
	    Assert.assertTrue(Loginp.getwarningmessagetext().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	@When("User dont entered email into email field")
	public void user_dont_entered_email_into_email_field() {
		
		Loginp.enteremail("");
	    
	}

	@When("User dont entered password into password field")
	public void user_dont_entered_password_into_password_field() {
	   Loginp.enterpassword("");
		
	}

}

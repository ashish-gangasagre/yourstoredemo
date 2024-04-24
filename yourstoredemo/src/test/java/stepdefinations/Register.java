package stepdefinations;

import java.util.Date;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.accontsuccesspage;
import pages.registerpage;
import utils.commonutils;


public class Register {
	 
	WebDriver driver;
	
	private registerpage registp;
	
	private accontsuccesspage acountsuccessp;
	
	@Given("User navigate to Register Account Page")
	public void user_navigate_to_register_account_page() {		

		driver=Driverfactory.getdriver();
		Homepage homepge= new Homepage(driver);
		
		homepge.clickonmyaccount();
		registp = homepge.clickonregister();
		
		
	   
	}

	@When("User enters the details into the below fields")
	public void user_enters_the_details_into_the_below_fields(io.cucumber.datatable.DataTable dataTable) {
		
	   Map<String,String> datamap = dataTable.asMap(String.class,String.class);
	   
	   
	   registp.enterfirstname(datamap.get("firstname"));
	   registp.enterlastname(datamap.get("lastname"));
	   registp.enteremail(commonutils.getEmailwithTimeStamp());
	   registp.entertelphone(datamap.get("telephone"));
	   registp.enterpassword(datamap.get("password"));
	   registp.enterconfrmpass(datamap.get("confrmpass"));
	  
	}

	@When("User enters the details into the below fields with duplicate email")
	public void user_enters_the_details_into_the_below_fields_with_duplicate_email(io.cucumber.datatable.DataTable dataTable) {
		
		   Map<String,String> datamap = dataTable.asMap(String.class,String.class);
		   
		   registp.enterfirstname(datamap.get("firstname"));
		   registp.enterlastname(datamap.get("lastname"));
		   registp.enteremail(datamap.get("email"));
		   registp.entertelphone(datamap.get("telephone"));
		   registp.enterpassword(datamap.get("password"));
		  // registp.enterconfrmpass(datamap.get("confrmpass"));
	}

	
	
	
	@When("User selects privacy policy")
	public void user_selects_privacy_policy() {
		registp.clickoniagree();
	   
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		acountsuccessp=registp.clickoncontinue();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		
	   Assert.assertEquals("Your Account Has Been Created!", acountsuccessp.getpageheading());
	}

	@When("User selects yes for newsletter")
	public void user_selects_yes_for_newsletter() {
		
		registp.clickonyesnewsletter();
		
	  	}

	@Then("User should get a proper worninig about duplicate email")
	public void user_should_get_a_proper_worninig_about_duplicate_email() {
		
		registp.getproperwrnung();
		Assert.assertTrue(registp.getproperwrnung().contains("Warning: E-Mail Address is already registered!"));
	    
	}

	@When("User dont enters any details into fields")
	public void user_dont_enters_any_details_into_fields() {
		
	   //intentionaly kept blank
	}

	@Then("User should get a proper worninig messages for every madatory field")
	public void user_should_get_a_proper_worninig_messages_for_every_madatory_field() {
	   Assert.assertTrue(registp.getallert().contains("Warning: You must agree to the Privacy Policy!"));
	   Assert.assertEquals("First Name must be between 1 and 32 characters!", registp.getfirstnamewarng());	
	   Assert.assertEquals("Last Name must be between 1 and 32 characters!", registp.getlastnamewarng());
	   Assert.assertEquals("E-Mail Address does not appear to be valid!", registp.getemailwarng());
	   Assert.assertEquals("Telephone must be between 3 and 32 characters!", registp.gettelephonewarng());
	   Assert.assertEquals("Password must be between 4 and 20 characters!", registp.getpasswarng());
	}

	
	

}

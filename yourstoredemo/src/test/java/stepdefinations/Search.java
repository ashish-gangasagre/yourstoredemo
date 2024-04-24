package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.java.en.*;
import pages.Homepage;
import pages.searchpage;

public class Search {
	
	WebDriver driver;
	
	Homepage homep;
	
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		driver = Driverfactory.getdriver();
	    
	}

	@When("User enters valid product {string} into search box fields")
	public void user_enters_valid_product_into_search_box_fields(String validproducttext) {
	    homep=new Homepage(driver);
	    homep.entertextintosearchbox(validproducttext);
	    homep.clickonsearch();
	}

	@When("User should get valid product displayed in search result")
	public void user_should_get_valid_product_displayed_in_search_result() {
		searchpage search=new searchpage(driver);
	    Assert.assertTrue(search.displaystatusofvalidproduct());
	}

	@When("User enters invalid product {string} into search box field")
	public void user_enters_invalid_product_into_search_box_field(String invalidproducttext) {
		homep=new Homepage(driver);
		homep.entertextintosearchbox(invalidproducttext);
	   
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		homep.clickonsearch();
	}

	@Then("User should get a meessage about no product matching")
	public void user_should_get_a_meessage_about_no_product_matching() {
		searchpage search=new searchpage(driver);
		Assert.assertEquals("There is no product that matches the search criteria." , search.getmessagetext());
	   
	}

	@When("User dont enters any product into search box field")
	public void user_dont_enters_any_product_into_search_box_field() {
		homep=new Homepage(driver);
		//intentionaly kept blank
	   
	}


}

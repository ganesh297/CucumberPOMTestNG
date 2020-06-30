package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginPageActions;
import utils.SeleniumDriver;


public class LoginSteps {
	
	
	LoginPageActions loginPageActions = new LoginPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of MercuryTours Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	

	@When("^User enter username$")
	public void enterUsername() throws InterruptedException  {
	    //SeleniumDriver.waitForPageToLoad();
		
		loginPageActions.clickOnLogin();
	//	loginPageActions.enterTextOnUsername();
	}

	

	@And("^User enter password$")
	public void enterPassword() throws InterruptedException  {
	    //SeleniumDriver.waitForPageToLoad();
		loginPageActions.enterTextOnPassword();
	}

	@And("^click Login$")
	public void clickLogin() throws InterruptedException  {
	    
		loginPageActions.clickOnLogin();
	}	

	@Then("^Verify Home Page$")
	public void verifyText() throws InterruptedException  {
	    
		loginPageActions.textVerify();
	}	



}

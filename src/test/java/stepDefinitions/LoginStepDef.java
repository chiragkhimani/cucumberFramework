package stepDefinitions;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef{
	
	LoginPage login = new LoginPage(DriverUtils.getDriver());
	
	HomePage home = new HomePage(DriverUtils.getDriver());


	@When("the user enters invalid credentials and clicks on login button")
	public void the_user_enters_invalid_credentials_and_clicks_on_login_button() {
	    login.doLogin("test", "test123");
	}

	@Then("verify if error message is displayed")
	public void verify_if_error_message_is_displayed() {
		login.verifyInvalidCred();
	   
	}
	
	@When("the user enters blank credentials and clicks on login button")
	public void the_user_enters_blank_credentials_and_clicks_on_login_button() {
	    login.doLoginWithBlankCred();
	}
	
	@Given("the user is opening website")
	public void the_user_is_opening_website() {
		login.openWebsite();
	}
	
	@Then("verify if the user is on home page")
	public void verify_if_the_user_is_on_home_page() {
		 home.verifyHomePageAfterLogin();
	}

	@When("the user enters username as {string} and passowrd as {string} and clicks on login button")
	public void the_user_enters_username_as_and_passowrd_as_and_clicks_on_login_button(String username, String password) {
	    login.doLogin(username, password);
	}
	
	@When("the user enters {string} and {string} and clicks on login button")
	public void the_user_enters_and_and_clicks_on_login_button(String invalidUsername, String invalidPassword) {
	    login.doLogin(invalidUsername, invalidPassword);
	}



}

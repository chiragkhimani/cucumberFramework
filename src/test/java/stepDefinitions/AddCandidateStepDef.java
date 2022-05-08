package stepDefinitions;

import com.automation.pages.AddCandidatePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCandidateStepDef {

	AddCandidatePage addCandidatePage = new AddCandidatePage(DriverUtils.getDriver());
	
	@Then("the user is Add candidate page")
	public void the_user_is_add_candidate_page() {
	   
	    addCandidatePage.verifyUserIsOnAddCandidatePage();
	}

	@When("the user enters {string}, {string}, {string} and click on save button on Add candidate page")
	public void the_user_enters_and_click_on_save_button_on_add_candidate_page(String firstname, String lastname, String email) {
	   addCandidatePage.enterDetailsAndSave(firstname, lastname, email);
	}

	@Then("verify if the candidate {string}, {string}, {string} has been added")
	public void verify_if_the_candidate_has_been_added(String firstname, String lastname, String email) {
	    addCandidatePage.verifyCandidateIsAdded(firstname, lastname, email);
	}
}

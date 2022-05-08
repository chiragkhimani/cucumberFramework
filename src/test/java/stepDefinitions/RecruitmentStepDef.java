package stepDefinitions;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.automation.pages.RecruitmentPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecruitmentStepDef {
	
	RecruitmentPage recruitment = new RecruitmentPage(DriverUtils.getDriver());
	
	@When("The user hovers on Recruitment and clicks on Candidate tab")
	public void the_user_hovers_on_recruitment_and_clicks_on_candidate_tab() {
	    
	   recruitment.clickOnCandidateTabUnderRecruitment();
	}

	@Then("the user is on Candidate page")
	public void the_user_is_on_candidate_page() {
	   
	  recruitment.verifyUserIsOnCandidatePage();
	}

	@When("the user clicks on add button on Candidate page")
	public void the_user_clicks_on_add_button_on_candidate_page() {
	   
	    recruitment.clickOnAddCandidate();
	}

	


}

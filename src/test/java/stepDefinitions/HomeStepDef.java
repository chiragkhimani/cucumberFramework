package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.automation.pages.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef {
	
	HomePage home = new HomePage(DriverUtils.getDriver());
	
	@When("The user hovers on Admin and hovers over Job tab")
	public void the_user_hovers_on_admin_and_hovers_over_job_tab() {
	  home.hoverOverAdminAndJobs();
	}
	
	@Then("the user can see following items")
	public void the_user_can_see_following_items(DataTable dataTable) {
		
		List<String> listOfData = dataTable.asList();
		home.verifyJobItems(listOfData);
	}

}

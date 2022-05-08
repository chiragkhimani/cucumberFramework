package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.automation.pages.LocationPage;
import com.automation.utils.DriverUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocationStepDef {
	
	LocationPage location = new LocationPage(DriverUtils.getDriver());
	
	@When("The user hovers on Admin and hovers over Oraganization and click on Locations")
	public void the_user_hovers_on_admin_and_hovers_over_oraganization_and_click_on_locations() {
	   location.hoverOverAdminAndOrganizationAndClickOnLocation();
	}
	@Then("Verify data for locations")
	public void verify_data_for_locations(DataTable dataTable) {
	   List<List<String>> listOfdata = dataTable.asLists();
	   
	   location.verifyLocationData(listOfdata);
	   
	}


	@Then("print data for locations")
	public void print_data_for_locations(DataTable dataTable) {
	   List<Map<String, String>> locationMap = dataTable.asMaps();
	   for(Map<String, String> m:locationMap) {
		   System.out.println(m.get("Country"));
	   }
	   
	}




}

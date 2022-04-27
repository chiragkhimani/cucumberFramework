package stepDefinitions;


import com.automation.utils.DriverUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		DriverUtils.createDriver();
		
	}
	
	@After
	public void clean() {
		DriverUtils.getDriver().quit();
	}

	

}

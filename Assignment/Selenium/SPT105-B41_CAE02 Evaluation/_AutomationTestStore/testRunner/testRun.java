package _AutomationTestStore;

import io.cucumber.junit.CucumberOptions;

public class testRun {
	@TestRun
	@CucumberOption(
			
			dryRun = true,
			
			)
	void testRun() {
		
	}
}

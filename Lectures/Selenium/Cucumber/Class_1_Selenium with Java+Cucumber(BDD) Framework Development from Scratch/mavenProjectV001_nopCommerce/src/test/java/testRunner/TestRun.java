package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

/*dryRun is to cross check before actual execution that creates reports
monochrome = true, -> removes unnecessary characters in console window

Output when dry run is true:
Scenario: Successful Login with Valid Credentials                        # Features/Login.feature:3
  Given User Launch Chrome browser                                       # stepDefinitions.Steps.user_launch_chrome_browser()
  When User opens URL "http://admin-demo.nopcommerce.com/login"          # stepDefinitions.Steps.user_opens_url(java.lang.String)
  And User enters Email as "admin@yourstore.com" and Password as "admin" # stepDefinitions.Steps.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)
  And Click on Login                                                     # stepDefinitions.Steps.click_on_login()
  Then Page Title should be "Dashboard / nopCommerce administration"     # stepDefinitions.Steps.page_title_should_be(java.lang.String)
  When User click on Log out link                                        # stepDefinitions.Steps.user_click_on_log_out_link()
  Then Page Title should be "Your store. Login"                          # stepDefinitions.Steps.page_title_should_be(java.lang.String)
  And close browser  
*/
@RunWith(Cucumber.class)
@CucumberOptions(
			features = ".//Features/Login.feature",
			glue = "stepDefinitions",
			dryRun = false,
			monochrome = true,
			plugin = {"pretty",
					"html:target/htmlreport.html", "json:target/cucumber.json"}
		)
public class TestRun {
	
}

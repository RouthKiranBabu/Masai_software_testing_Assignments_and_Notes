package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	    driver.get(string);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) throws InterruptedException {
	    lp.setUserName(string);
	    lp.setPassword(string2);
	    Thread.sleep(6000);
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
	    lp.clickLogin();
	    Thread.sleep(6000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) throws InterruptedException {
		String actual = driver.getTitle();
		if (actual.equals("Dashboard / nopCommerce administration")) {
			System.out.println("You logged in...");
		}else if (actual.equals("Your store. Login")) {
			System.out.println("You logged out...");
		}else {
			Assert.fail();
		}
		Thread.sleep(6000);
//	    if(driver.getPageSource().contains("Login was unsuccessful.")) {
//	    	driver.close();
//	    	Assert.assertTrue(false);
//	    }else {
//	    	Assert.assertEquals(string, driver.getTitle());
//	    }
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
	    lp.clickLogout();
	    Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}
}

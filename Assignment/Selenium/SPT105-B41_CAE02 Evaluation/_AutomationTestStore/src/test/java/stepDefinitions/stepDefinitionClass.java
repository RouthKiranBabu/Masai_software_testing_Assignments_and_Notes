package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class stepDefinitionClass {
	public WebDriver driver;
	@Given("Chooses the {string}")
	public void chooses_the(String string) {
		String strings = string.toLowerCase();
	    if (strings.equals("chrome")) {
	    	// .setProperty("web.chrome.driver", driver.getProperty("user.dir") + "//Drivers/chromedriver.exe");
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    }
	}

	@Then("Opens the {string}")
	public void opens_the(String string) {
	    driver.get(string);
	}

	@Then("Checks the {string} title")
	public void checks_the_title(String string) {
	    String act_title = driver.getTitle();
	    if(act_title.equals(string)) {
	    	System.out.println("Yes, title: " + string);
	    }else Assert.fail();
	}

	@Then("Clicks on {string}")
	public void clicks_on(String string) {
	    driver.findElement(By.xpath(string)).click();
	}

	@Then("Clicks on Sort by {string}")
	public void clicks_on_sort_by(String string) {
	    List<WebElement> sortlist = driver.findElements(By.xpath("//select[@name='sort']/option"));
	    for (int i = 0; i < sortlist.size(); i++) {
	    	WebElement ele = sortlist.get(i);
	    	if (ele.getText().equals(string)) {
	    		ele.click();
	    		break;
	    	}
	    }
	}
}

package pack_3_dependsOn_Priority;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_1 {
	WebDriver driver;
	String title;
	String url;
	@Test(priority = 1)
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2, dependsOnMethods = {"setup"})
	void open() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test(priority = 3, dependsOnMethods = {"setup", "open"})
	void getTitle() {
		title = driver.getTitle();
		System.out.println("Title: " + title);
	}
	
	@Test(priority = 4, dependsOnMethods = {"setup", "open"})
	void getURL() {
		url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
	}
	
	@Test(priority = 5)
	void tearDown() {
		driver.close();
	}
}
/*Output
 * [RemoteTestNG] detected TestNG version 7.4.0
Title: Practice Page
URL: https://rahulshettyacademy.com/AutomationPractice/
PASSED: getTitle
PASSED: tearDown
PASSED: setup
PASSED: open
PASSED: getURL

===============================================
    Default test
    Tests run: 5, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 5, Passes: 5, Failures: 0, Skips: 0
===============================================

*/
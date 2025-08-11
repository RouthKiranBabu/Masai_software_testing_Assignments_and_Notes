package java_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class groups_priority {
	WebDriver driver;
	
	@Test(priority = 1, groups = "env_setup")
	void get_up() {
//		If this method fails then other methods which depends on it get skipped in the reports or skip running the test
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 2, groups = "automate", dependsOnMethods = {"get_up"})
	void checkbox() throws InterruptedException {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkbox-example']//input"));
		for (WebElement box: checkboxes) {
			box.click();
			Thread.sleep(500);
		}
	}
	
	@Test(priority = 3, groups = "automate", dependsOnMethods = {"get_up"})
	void radiobtn() throws InterruptedException{
		List<WebElement> radiobtns = driver.findElements(By.xpath("//div[@id='radio-btn-example']//input"));
		for (WebElement btn: radiobtns) {
			btn.click();
			Thread.sleep(500);
		}
	}
	
	@Test(priority = 4, groups = "env_setup", dependsOnMethods = {"get_up"})
	void close_up() throws InterruptedException {
		Thread.sleep(500);
		driver.quit();
	}
}

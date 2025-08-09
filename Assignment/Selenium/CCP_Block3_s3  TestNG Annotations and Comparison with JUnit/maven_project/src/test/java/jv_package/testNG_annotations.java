package jv_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG_annotations {
	WebDriver driver;
	
	@Test(priority = 1)
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 2, dependsOnMethods = {"setup"})
	void check_box() throws InterruptedException {
		List<WebElement> check_boxes = driver.findElements(By.xpath("//div[@id = 'checkbox-example']//input"));
		for (WebElement ele: check_boxes) {
			ele.click();
			Thread.sleep(1000);
		}
		check_boxes.get(0).click();Thread.sleep(1000);
	}
	
	@Test(priority = 3, dependsOnMethods = {"setup"})
	void radio_button() throws InterruptedException {
		List<WebElement> radio_buttons = driver.findElements(By.xpath("//div[@id = 'radio-btn-example']//input"));
		for (WebElement ele: radio_buttons) {
			ele.click();
			Thread.sleep(1000);
		}
		radio_buttons.get(1).click();Thread.sleep(1000);
	}
}

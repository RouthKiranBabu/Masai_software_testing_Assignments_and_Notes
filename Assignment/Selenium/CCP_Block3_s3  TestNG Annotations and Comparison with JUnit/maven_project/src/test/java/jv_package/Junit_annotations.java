package jv_package;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// assertEquals(5, sum, "Sum should be 5");

public class Junit_annotations {
	WebDriver driver;
	
	@BeforeEach
    void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	
	@Test
	@Order(1)
	void check_box() throws InterruptedException {
		List<WebElement> check_boxes = driver.findElements(By.xpath("//div[@id = 'checkbox-example']//input"));
		for (WebElement ele: check_boxes) {
			ele.click();
			Thread.sleep(1000);
		}
		check_boxes.get(0).click();Thread.sleep(1000);
	}
	
	@Test
	@Order(2)
	void radio_button() throws InterruptedException {
		List<WebElement> radio_buttons = driver.findElements(By.xpath("//div[@id = 'radio-btn-example']//input"));
		for (WebElement ele: radio_buttons) {
			ele.click();
			Thread.sleep(1000);
		}
		radio_buttons.get(1).click();Thread.sleep(1000);
	}
	
	@AfterEach
    void endup() {
		driver.quit();
    }
}

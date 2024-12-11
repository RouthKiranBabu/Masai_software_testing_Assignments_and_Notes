package pack_4_groups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_1 {
	WebDriver driver;
	String title;
	String url;
	@Test(priority = 1, groups = "begin")
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority = 2, groups = {"get", "show"})
	void getTitle() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		title = driver.getTitle();
	}
	
	@Test(priority = 3, groups = {"get", "show"})
	void getURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		url = driver.getCurrentUrl();
	}
	
	@Test(priority = 4, groups = {"show"})
	void printTitle_URL() {
		System.out.println("URL: " + url + "\nTitle: " + title);
		driver.close();
	}
}

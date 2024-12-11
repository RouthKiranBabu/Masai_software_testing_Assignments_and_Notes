package pack_2_Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Class_1 {
	WebDriver driver;
	@BeforeSuite
	void setup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
	}
	
	@AfterSuite
	void as() {
		driver.quit();
	}
	String title;
	@BeforeTest
	void bt() {
		title = driver.getTitle();
		Assert.assertEquals(title, "Practice Page");
	}
	
	@AfterTest
	void at() {
		System.out.println("Title: " + title);
	}
	String url;
	@BeforeClass
	void bc() {
		url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@AfterClass
	void ac() {
		System.out.println("URL: " + url);
	}
	boolean islogo;
	@BeforeMethod
	void be() {
		islogo = driver.findElement(By.xpath("")).isDisplayed();
		if (!islogo) Assert.fail();
	}
	
	@AfterMethod
	void ae() {
		System.out.println("Logo status: " + islogo);
	}
	
	@Test(priority = 2)
	void Test2() {
		System.out.println("This is Test priority 2...");
	}
	
	@Test(priority = 1)
	void Test1() {
		System.out.println("This is Test priority 1...");
	}
}

package pack_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class_2 {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider = "dp")
	void testLogin(String username, String password) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@Placeholder = 'Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@Placeholder = 'Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		boolean banner = driver.findElement(By.xpath("//img[@alt = 'client brand banner']")).isDisplayed();
		if (!banner) {
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name = "dp")
	Object[][] loginData() {
		// String data[][] = {
		// Object can have any kind of data
		Object data[][] = {
				{"abc@gmail.com", "test123"},
				{"Admin", "admin123"},
				{"newAdmin", "pass34"},
				{"asdf","1234"},
				{"efgh","5678"}
		};
		return data;
	}
}
/*[RemoteTestNG] detected TestNG version 7.4.0
PASSED: testLogin("Admin", "admin123")
FAILED: testLogin("asdf", "1234")
org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//input[@Placeholder = 'Username']"}
  (Session info: chrome=131.0.6778.109)
  
  FAILED: testLogin("efgh", "5678")
org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//input[@Placeholder = 'Username']"}
  (Session info: chrome=131.0.6778.109)
  
  FAILED: testLogin("abc@gmail.com", "test123")
org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//img[@alt = 'client brand banner']"}
  (Session info: chrome=131.0.6778.109)
  
  FAILED: testLogin("newAdmin", "pass34")
org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//input[@Placeholder = 'Username']"}
  (Session info: chrome=131.0.6778.109)
  
  
===============================================
    Default test
    Tests run: 1, Failures: 4, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 5, Passes: 1, Failures: 4, Skips: 0
===============================================


  */

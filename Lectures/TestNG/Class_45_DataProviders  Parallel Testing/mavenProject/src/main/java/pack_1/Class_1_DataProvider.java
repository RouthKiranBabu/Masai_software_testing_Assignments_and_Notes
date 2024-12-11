package pack_1;

/*Parameterization
 * 1. @DataProvider: data driven testing
 * 2. using xml file: parallel testing*/

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class Class_1_DataProvider {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void testLogin() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@Placeholder = 'Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@Placeholder = 'Password']")).sendKeys("admin123");
		
		boolean status = driver.findElement(By.xpath("//img[@alt= 'company-branding']")).isEnabled();
		if(status == true) {
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			Assert.assertTrue(true);
		}else {
			System.out.println("failed statement...");
			Assert.fail();
		}
		Set<String> windid = driver.getWindowHandles();
		List<String> winid = new ArrayList(windid);
		String parentid = winid.get(0);
		String childid = winid.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(parentid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		driver.close();Thread.sleep(2000);
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}

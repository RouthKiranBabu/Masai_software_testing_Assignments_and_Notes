	package pack_3;
/*Search Extent Reports -> docs -> Version5 -> Java
 * https://extentreports.com/docs/versions/5/java/index.html
 * 
 * Search in mvnrepository -> ExtentReports
 * https://mvnrepository.com/artifact/com.aventstack/extentreports/5.1.2
 * Copy the dependency and paste in pom.xml file
 * 
 * Right click on the Maven Project -> Create Folder -> name it as 'reports'
 * run the testng.xml and refresh the reports*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack_2.Class_2_Listener.class)
public class Class_1 {
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2)
	void testAppUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 3, dependsOnMethods = {"testAppUrl"})
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
/*Output
[RemoteTestNG] detected TestNG version 7.4.0
PASSED: testAppUrl
PASSED: testLogo
PASSED: testHomePageTitle

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================

*/
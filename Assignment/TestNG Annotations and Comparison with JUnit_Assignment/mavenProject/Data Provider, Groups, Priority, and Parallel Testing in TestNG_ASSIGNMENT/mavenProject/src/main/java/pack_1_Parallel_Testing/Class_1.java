package pack_1_Parallel_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Class_1 {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "url"})
	void setup(String bs, String ul) throws InterruptedException {
		switch(bs.toLowerCase()) {
			case "chrome": driver = new ChromeDriver(); break;
			case "edge": driver = new EdgeDriver(); break;
			default: System.out.println("Invalid browser."); break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(ul);
		Thread.sleep(2000);
	}
	
	@Test(priority = 1, groups = {"img", "functional"})
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@class='logoClass']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2, groups = {"text", "functional"})
	void testTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Practice Page");
	}
	
	@Test(priority = 3, groups = {"text", "functional"})
	@Parameters({"url"})
	void testURL(String url) {
		String ul = driver.getCurrentUrl();
		Assert.assertEquals(ul, url);
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}

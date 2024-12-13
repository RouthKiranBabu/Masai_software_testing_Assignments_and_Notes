package packOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class class_1 {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "link"})
	void setup(String br, String link) throws InterruptedException {
		switch(br) {
		case "chrome": driver = new ChromeDriver(); break;
		default: System.out.println("Invalid Browser!"); break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(link);
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	@Parameters({"title"})
	void checkTitle(String title) {
		String tle = driver.getTitle();
		if (tle.equals(title)) {
			System.out.println("Yes, title is " + title);
		}else System.out.println("No, actual title is " + title);
	}
	
	@Test(priority = 2, dependsOnMethods = {"checkTitle"})
	@Parameters({"user1", "pass1"})
	void tryLoginFail(String user, String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 3, dependsOnMethods = {"checkTitle", "tryLoginFail"})
	void isLoggedFail() {
		String res = driver.findElement(By.xpath("//div[@id = 'action-confirmation")).getText();
		if (res.equals("Invalid Credentials")) Assert.fail();
		else if (res.equals("Welcome Back, admin")) System.out.println("You Logged in Successfully!");
	}
	
	@Test(priority = 4, dependsOnMethods = {"checkTitle"})
	@Parameters({"user2", "pass2"})
	void tryLoginPass(String user, String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 5, dependsOnMethods = {"checkTitle", "tryLoginPass"})
	void isLoggedPass() {
		String res = driver.findElement(By.xpath("//div[@id = 'action-confirmation")).getText();
		if (res.equals("Invalid Credentials")) Assert.fail();
		else if (res.equals("Welcome Back, admin")) System.out.println("You Logged in Successfully!");
	}
	
	@AfterClass
	void onFinish() {
		driver.quit();
	}
	
}

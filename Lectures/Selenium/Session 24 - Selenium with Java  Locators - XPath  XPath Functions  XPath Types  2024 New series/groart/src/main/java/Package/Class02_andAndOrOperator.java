package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02_andAndOrOperator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/index.html");
		
		driver.findElement(By.xpath("//a[@class='nav-link' and contains(text(), 'Contact')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='recipient-email' and @class='form-control']")).sendKeys("Username Value");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='recipient-name' or @class='control']")).sendKeys("Contact Value");
		Thread.sleep(2000);
		String txt = driver.findElement(By.xpath("//h5[text()='New message']")).getText();
		boolean isdisplayed = driver.findElement(By.xpath("//h5[text()='New message']")).isDisplayed();
		System.out.println("Got text: " + txt + " and Status of Displayed is " + isdisplayed + "."); // Got text: New message and Status of Displayed is true.
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@aria-hidden = 'true'])[1]")).click();
//		Thread.sleep(4000);
		driver.quit();
		
		WebDriver newdriver = new ChromeDriver();
		Thread.sleep(2000);
		newdriver.manage().window().maximize();
		newdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		newdriver.findElement(By.xpath("//input[contains(@placeholder, 'User')]")).sendKeys("Admin");
		Thread.sleep(2000);
		newdriver.findElement(By.xpath("//input[starts-with(@placeholder, 'Pass')]")).sendKeys("admin123");
		Thread.sleep(2000);
		boolean islogodisplayed = newdriver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img")).isDisplayed();
		System.out.println("Status of displaying Logo: " + islogodisplayed);
		
		newdriver.quit(); // 1:17:56
	}

}

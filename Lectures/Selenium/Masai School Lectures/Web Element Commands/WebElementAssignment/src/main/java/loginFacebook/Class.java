package loginFacebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@aria-label='First name']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//*[@aria-label='Surname']")).sendKeys("SecondName");
		
		Actions actions = new Actions(driver);
		if (driver.findElement(By.xpath("//select[@title = \"Day\"]")).isEnabled()) {
			WebElement dy = driver.findElement(By.xpath("//select[@id='day']"));
			actions.moveToElement(dy).click();
		}
		if (driver.findElement(By.xpath("//option[normalize-space()='4']")).isEnabled()) {
			driver.findElement(By.xpath("//option[normalize-space()='4']")).click();
		}
		driver.findElement(By.xpath("//option[contains(text(), 'Sep')]")).click();
		driver.findElement(By.xpath("//select[@title='Year']")).click();
		driver.findElement(By.xpath("//option[contains(text(), 1998)]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//*[@aria-label = 'Mobile number or email address']")).sendKeys("7077654345");
		driver.findElement(By.xpath("//*[@autocomplete = 'new-password']")).sendKeys("newPassword1234wqwe");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String msg = driver.findElement(By.cssSelector("#reg_error_inner")).getText();
		System.out.println(msg);
		driver.close();
	}

}

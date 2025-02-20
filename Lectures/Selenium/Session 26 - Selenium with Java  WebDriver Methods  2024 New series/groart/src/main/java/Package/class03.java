package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // This will opens new browser window
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // opens the third tab in the browser
		driver.close(); // First browser will be closed and the second and third tab remains in browser
		Thread.sleep(3000);
		driver.quit(); // closes second and third tab in the browser
	}

}

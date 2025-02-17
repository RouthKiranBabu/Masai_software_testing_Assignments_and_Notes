package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02_locatingById {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayStatus); // true
		Thread.sleep(3000);
		driver.quit();
	}

}

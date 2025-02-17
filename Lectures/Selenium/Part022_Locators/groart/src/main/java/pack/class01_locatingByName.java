package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class01_locatingByName {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		ctrl + shift + o -> imports module
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
//		Locating by Name
		driver.findElement(By.name("search")).sendKeys("Mac");
		Thread.sleep(3000);
		driver.quit();
	}

}

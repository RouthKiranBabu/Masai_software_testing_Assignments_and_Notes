package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class04_tagClassAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-Shirts");
		Thread.sleep(2000);
		
		driver.quit();
	}

}

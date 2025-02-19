package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class00_usingSingleAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-Shirts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Search']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("New T-Shirts");
		Thread.sleep(2000);
		
		driver.quit();
	}

}

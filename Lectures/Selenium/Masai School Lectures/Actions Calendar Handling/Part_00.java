package Actions_CalendarHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_00 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		/*At the SelectorHub You have the option to select
		 * Click to generate Locators page and multiple selectors.
		 * then click using arrow on the element to get the 
		 * xpath and cssselector*/
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Thread.sleep(2000);
//		Tohover
//		actions.moveToElement(desktop).build().perform();
//		Mouse arrow move to desktop then mac element
		actions.moveToElement(desktop).moveToElement(mac).click().build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}

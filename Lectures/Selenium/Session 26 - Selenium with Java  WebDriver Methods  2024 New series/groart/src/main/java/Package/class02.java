package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display Status of Logo: " + logo.isDisplayed());
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Direct status: " + status);
//		isEnabled() - is the element is operational or not
		status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enabled Status: " + status);
//		After providing values if the submit button is not enabled then it is a bug.
		boolean issltmale = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println("Is male selected: " + issltmale);
		if(!issltmale) {
			WebElement male_opt = driver.findElement(By.xpath("//input[@id='gender-male']"));
			male_opt.click();
		}
		issltmale = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println("Is male selected: " + issltmale);
		boolean newsletstatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News letter checkbox status: " + newsletstatus);
	}

}
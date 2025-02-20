# Code 1
```javascript
package Package;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class class01 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		System.out.println("Page Source: " + driver.getPageSource());
//		getWindowHandle() - returns ID of the single Browser window which changes
		System.out.println("Window ID: " + driver.getWindowHandle()); // Window ID: D1EA61FA9F8C43EB2BA946435D5B81C5
//		getWindowHandles() - returns ID's of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids); // [D1EA61FA9F8C43EB2BA946435D5B81C5, FA0006AA7E816179C8DA15B5BF0F71A2]
//		close() - closes only one window, quit() - closes multiple window
	}
}
```

# Code 2
```javascript
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
```

# Code 3
```javascript
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
```

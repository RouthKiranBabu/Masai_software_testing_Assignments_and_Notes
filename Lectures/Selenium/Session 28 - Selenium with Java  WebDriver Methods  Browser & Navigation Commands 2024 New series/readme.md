# Code 1
```javascript
package PackOne;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Class_1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://demo.nocommerce.com/");
//		URL url = new URL("https://demo.nopcommerce.com/");
//		driver.navigate().to(url); // Takes url object
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh(); // To refresh a page
	}

}
```
# Code 2
```javascript
package PackOne;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Class_2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> windowList = new ArrayList(windowIDs);
		String parentid = windowList.get(0);
		String childid = windowList.get(1);
//		Switch to child Window
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle()); // Human Resources Management Software | OrangeHRM
//		Switch to parent window
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle()); // OrangeHRM
	}
}
```
# Code 3
```javascript
package PackOne;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		for(String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl()); // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
			}
		}
		for(String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println("Title: " + title);
//			Title: OrangeHRM
//			Title: Human Resources Management Software | OrangeHRM
		}
		for(String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println("Title: " + title);
			if (title.equals("Human Resources Management Software | OrangeHRM")) {
				driver.close(); // Closes the tab which has the title 
			}
		}
	}

}
```

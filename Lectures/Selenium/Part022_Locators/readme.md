# Pre-requisites
<details>
  <summary>Creating Maven Project</summary>

  <img alt="Image" src="./imgvid/Prerequisites.gif"> </img>
</details>

# Code Section
## Code to Send Values to the Search Box
```javascript
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
```
## Result
<details>
  <summary>Show</summary>

  <img alt="Image" src="./imgvid/sendvalue.gif"> </img>
</details>

## Code: Locating By ID
```javascript
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
```

## Code: Locating By linked text and Partial Linked Text
```javascript
package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03_linkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
//		For exact text of link tag or a tag. Text must be exact.
		driver.findElement(By.linkText("Tablets")).click();
		Thread.sleep(8000);
//		Partial text of the link text. Where this may find duplicates.
		driver.findElement(By.partialLinkText("Table")).click();
		Thread.sleep(8000);
		driver.quit();
	}
}
```
## Result
<details>
  <summary>Show</summary>

  <img alt="Image" src="./imgvid/_Linktext Partiallinktext.gif"> </img>
</details>

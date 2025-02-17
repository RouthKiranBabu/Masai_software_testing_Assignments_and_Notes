# Pre-requisites
<details>
  <summary>Creating Maven Project</summary>

  <img alt="Image" src="https://github.com/RouthKiranBabu/Masai-School-Journey/blob/main/Lectures/Selenium/Part022_Locators/imgvid/Prerequisites.gif"> </img>
</details>

# CSS Selector

<div align = center>
  
|From|To|
|--:|:--|
|`tag id`|tag#id|
|`tag class`|tag.classname|
|`tag attribute`|tag[attribute="value"]|
|`tag class attribute`|tag.classname[attribute="value"]|
</div>

>[!NOTE]
>Tag is Optional. You may or may not Provide the tag.😊
>```javascript
>driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
>driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("New T-Shirts");
>```

## Code for Tag id
```javascript
package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01_tagId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#small-searchterms")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("New T-Shirts");
		Thread.sleep(2000);
		driver.quit();
	}
}
```
## Result

<details>
  <summary>Automation</summary>

  <img alt="Image" src="./imgvid/tagid.gif" width = 100%> </img>
</details>

>[!NOTE]
>`class="search-box-text ui-autocomplete-input"` Means Class has two parts `search-box-text` and `ui-autocomplete-input`.
><details>
>  <summary>CSS Selector</summary>
>
>  <img alt="Image" src="./imgvid/inputsearchterms.png"> </img>
></details>

## Code for Tag class
```javascript
package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02_tagClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.search-box-text")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("New T-Shirts");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
```
## Result

<details>
  <summary>Automation</summary>

  <img alt="Image" src="./imgvid/tagclass.gif" width = 100%> </img>
</details>

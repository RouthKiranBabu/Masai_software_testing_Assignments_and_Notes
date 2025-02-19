# Pre-requisites
<details>
  <summary>Creating Maven Project</summary>

  <img alt="Image" src="https://github.com/RouthKiranBabu/Masai-School-Journey/blob/main/Lectures/Selenium/Part022_Locators/imgvid/Prerequisites.gif"> </img>
</details>

# Coding Section
## Code for XPath
```javascript
package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class00_ {

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
```
## Result

<details>
  <summary>XPath Location</summary>

  <img alt="Image" src="./imgvid/xpath.png" width = 100%> </img>
</details>

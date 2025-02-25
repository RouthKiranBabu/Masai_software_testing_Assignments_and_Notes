# Pre-requisites
## Website Used
 - [Website1](https://rahulshettyacademy.com/AutomationPractice/)
 - [Website2](https://the-internet.herokuapp.com/javascript_alerts)
## Locator Used
<details>
  <summary>(//div[starts-with(@id, 'check')]/descendant::input)[1]</summary>

  <img alt = "Image" src= "https://github.com/RouthKiranBabu/Masai-School-Journey/blob/main/Lectures/PlayWright/Part10_Playwright%20with%20Javascript%20%20How%20to%20handle%20Checkboxes/imgif/checkbox1.png"></img>
</details>
<details>
  <summary>(//div[starts-with(@id, 'check')]/descendant::input)[2]</summary>

  <img alt = "Image" src= "https://github.com/RouthKiranBabu/Masai-School-Journey/blob/main/Lectures/PlayWright/Part10_Playwright%20with%20Javascript%20%20How%20to%20handle%20Checkboxes/imgif/checkbox2.png"></img>
</details>
<details>
  <summary>Locators</summary>

  <img alt = "Image" src= "./imgif/_locators.gif"></img>
</details>

# Code
## Interaction with Check Boxes
```javascript
package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//div[starts-with(@id, 'check')]/descendant::input)[1]")).click();
		Thread.sleep(3000);
		
		List<WebElement> cblist = driver.findElements(By.xpath("//div[starts-with(@id, 'check')]/descendant::input"));
		for(int i = 0; i < cblist.size(); i++) {
			Thread.sleep(1000);
			if (cblist.get(i).isSelected()) {
				cblist.get(i).click();
			}
			cblist.get(i).click();
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
```
## Interaction With Basic Alert
```javascript
package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02_jsalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> btnlist = driver.findElements(By.xpath("//div[starts-with(@class,'exam')]/descendant::button"));
		WebElement btn = btnlist.get(0);
		Thread.sleep(2000);
		System.out.println("Button Text: " + btn.getText());
		btn.click();
		Thread.sleep(1000);
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		Thread.sleep(1000);
		String txt = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result: " + txt);
		Thread.sleep(3000);
		driver.quit();
	}
/*Output
Button Text: Click for JS Alert
I am a JS Alert
Result: You successfully clicked an alert*/
}
```
## Interaction With Comfirm Alert
```javascript
package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03_jsconfirm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> btnlist = driver.findElements(By.xpath("//div[starts-with(@class,'exam')]/descendant::button"));
		WebElement btn = btnlist.get(1);
		System.out.println("Button Clicked: " + btn.getText());
		btn.click();
		Thread.sleep(2000);
		Alert alrt = driver.switchTo().alert();
		System.out.println("Text on Alert: " + alrt.getText());
		Thread.sleep(2000);
		alrt.accept();
		String txt = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result: " + txt);
		Thread.sleep(3000);
		btn.click();
		Thread.sleep(2000);
		alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt.dismiss();
		txt = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result: " + txt);
		Thread.sleep(3000);
		driver.quit();
	}
/*Output
Button Clicked: Click for JS Confirm
Text on Alert: I am a JS Confirm
Result: You clicked: Ok
Result: You clicked: Cancel*/
}
```
## Interaction with Prompt Alert
```javascript
package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class04_jsprompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		https://the-internet.herokuapp.com/basic_auth
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		List<WebElement> btnlist = driver.findElements(By.xpath("//div[starts-with(@class,'exam')]/descendant::button"));
		WebElement btn = btnlist.get(2);
		System.out.println("Button Clicked: " + btn.getText());
		btn.click();
		Thread.sleep(2000);
//		Alert alrt = driver.switchTo().alert();
		Alert alrt = wdw.until(ExpectedConditions.alertIsPresent());
		System.out.println("Text on Alert: " + alrt.getText());
		Thread.sleep(2000);
		alrt.sendKeys("Routh");
		Thread.sleep(2000);
		alrt.accept();
		Thread.sleep(2000);
		String txt = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result: " + txt);
		Thread.sleep(2000);
		driver.quit();
	}
/*Output
Button Clicked: Click for JS Prompt
Text on Alert: I am a JS prompt
Result: You entered: Routh*/
}
```
# Automation
## Part1
<details>
  <summary>Open</summary>

  <img alt = "Image" src= "./imgif/_automation1.gif"></img>
</details>

## Part2
<details>
  <summary>Open</summary>

  <img alt = "Image" src= "./imgif/_automation2.gif"></img>
</details>

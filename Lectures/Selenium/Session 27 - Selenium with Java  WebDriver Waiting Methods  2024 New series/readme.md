# Code 1
```javascript
package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class class01 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement user = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		user.sendKeys("Admin");
		
		WebElement pwd = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		pwd.sendKeys("admin123");
		
		WebElement btn = wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		btn.click();
		
		Thread.sleep(3000);
		driver.close();
		
		/*Conditions
		 * alertIsPresent()
		 * elementSelectionStateToBe()
		 * elementToBeClickable()
		 * elementToBeSelected()
		 * frameToBeAvailableAndSwitchTolt()
		 * presenceOfAllElementsLocated()
		 * presenceOfElementLocated()
		 * textToBePresentInElement()
		 * textToBePresentInElementLocated()
		 * textToBePresentInElementValue()
		 * titleIs()
		 * titleContains()
		 * visibilityOf()
		 * visibilityOfAllElements()
		 * visibilityOfAllElementsLocatedBy()
		 * visibilityOfElementLocated()*/
	}

}
```

# Code 2
```javascript
package Package;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		driver.manage().window().maximize();
		
		WebElement txtusername = mywait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@name='username']"));
			}
		});
		txtusername.sendKeys("Admin");
	}

}
```

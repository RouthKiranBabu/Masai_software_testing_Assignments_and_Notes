package PackOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Class_1 {

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

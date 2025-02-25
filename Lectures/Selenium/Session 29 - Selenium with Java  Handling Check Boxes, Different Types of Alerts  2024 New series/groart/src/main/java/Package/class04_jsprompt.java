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

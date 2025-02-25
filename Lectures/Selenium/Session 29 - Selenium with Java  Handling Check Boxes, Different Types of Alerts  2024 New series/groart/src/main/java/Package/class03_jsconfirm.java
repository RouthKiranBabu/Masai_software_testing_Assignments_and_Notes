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

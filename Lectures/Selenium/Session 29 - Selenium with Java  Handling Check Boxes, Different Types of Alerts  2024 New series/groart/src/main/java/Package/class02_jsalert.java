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

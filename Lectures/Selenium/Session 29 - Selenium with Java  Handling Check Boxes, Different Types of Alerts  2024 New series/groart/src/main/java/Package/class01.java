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

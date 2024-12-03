package Part2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//span[contains(text(), 'Down')]")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("/downloads")) {
			System.out.println("Yes it contains \"/downloads\" in url: " + url);
		}else {
			System.out.println("\"/downloads\" is not in url: " + url);
		}
		
		int delay = 3000;
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(delay);
		driver.findElement(By.cssSelector("promtButton")).click();
		Alert art = driver.switchTo().alert();
		String artext = art.getText();
		Thread.sleep(delay);
		System.out.println("Text on Alert: " + artext);
		art.sendKeys("[value provide]");
		art.accept();
		driver.switchTo().defaultContent();
		String outprom = driver.findElement(By.cssSelector("promptResult")).getText();
		System.out.println("Output Prompt: " + outprom);
	}

}
/*Output
 * Yes it contains "/downloads" in url: https://www.selenium.dev/downloads/*/

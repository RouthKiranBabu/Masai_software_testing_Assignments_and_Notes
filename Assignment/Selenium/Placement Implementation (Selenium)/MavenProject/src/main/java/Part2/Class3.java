package Part2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int delay = 2000;
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(delay);
		driver.findElement(By.xpath("(//button[contains(text(), 'Click')])[4]")).click();
		Alert art = driver.switchTo().alert();
		Thread.sleep(delay);
		String artext = art.getText();
		System.out.println("Text on Alert: " + artext);
		art.sendKeys("[value provide]");
		Thread.sleep(delay);
		art.accept();
		Thread.sleep(delay);
		driver.switchTo().defaultContent();
		Thread.sleep(delay);
		String outprom = driver.findElement(By.cssSelector("promptResult")).getText();
		System.out.println("Output Prompt: " + outprom);
	}

}

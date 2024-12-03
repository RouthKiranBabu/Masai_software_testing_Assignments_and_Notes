package packMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/iframes");
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(frame1);
		WebElement btn1 = driver.findElement(By.id("actionButton"));
		String initext = btn1.getText();
		btn1.click();
		String lsttext = btn1.getText();
		System.out.println("Initial text on Button: " + initext + ", \nafter click text on button: " + lsttext);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement frame2 = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(frame2);
		btn1 = driver.findElement(By.id("actionButton"));
		initext = btn1.getText();
		btn1.click();
		lsttext = btn1.getText();
		System.out.println("Initial text on Button: " + initext + ", \nafter click text on button: " + lsttext);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();
/*Initial text on Button: Click Me!, 
after click text on button: Button Pressed
Initial text on Button: Click Me!, 
after click text on button: Button Pressed*/
	}

}

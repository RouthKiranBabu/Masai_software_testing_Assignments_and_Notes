package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class Part3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int delay = 2000;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		System.out.println("Clicking on alert button...");
		WebElement alrbtn = driver.findElement(By.cssSelector("#alertButton"));
		alrbtn.click();
		Thread.sleep(delay);
		System.out.println("Accepting alert button...");
		Alert alert = driver.switchTo().alert();
		String alrtmsg = alert.getText();
		alert.accept();
		Thread.sleep(delay);
		System.out.println("Alert Message: " + alrtmsg);
		
		System.out.println("Clicking on confirm button...");
		WebElement cnfbtn = driver.findElement(By.cssSelector("#confirmButton"));
		cnfbtn.click();Thread.sleep(delay + 2000);
		System.out.println("Clicking on alert ok button...");
		Alert alertcnf = driver.switchTo().alert(); alrtmsg = alertcnf.getText();
		alertcnf.accept();
		Thread.sleep(delay);
		System.out.println("Alert Message: " + alrtmsg);
		WebElement cnftext = driver.findElement(By.cssSelector("#confirmResult"));
		String result = cnftext.getText();
		Thread.sleep(delay);
		System.out.println("Confirmed Text: " + result);
		Thread.sleep(delay);
		driver.quit();
		/*Output
Clicking on alert button...
Accepting alert button...
Alert Message: You clicked a button
Clicking on confirm button...
Clicking on alert ok button...
Alert Message: Do you confirm action?
Confirmed Text: You selected Ok*/
	}

}

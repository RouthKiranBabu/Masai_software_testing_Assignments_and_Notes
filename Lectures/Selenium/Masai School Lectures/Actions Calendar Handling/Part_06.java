package Actions_CalendarHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Actions action = new Actions(driver);
		
//		JS Alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String altmsg = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(altmsg); // You successfully clicked an alert
		
//		JS Confirm
		driver.findElement(By.cssSelector("button[onclick = 'jsConfirm()']")).click();
//		Clicking on the cancel button on the alert
		driver.switchTo().alert().dismiss();Thread.sleep(2000);
		String msgo = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(msgo); // You clicked: Cancel
		
		driver.findElement(By.cssSelector("button[onclick = 'jsConfirm()']")).click();
//		For clicking on ok button on the alert message
		driver.switchTo().alert().accept();Thread.sleep(2000);
		String msgc = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(msgc); // You clicked: Ok
		
//		JS alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); Thread.sleep(2000);
		alert.sendKeys("Value send!"); Thread.sleep(2000);
		alert.accept();
		String msgp = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(msgp); // You clicked: Ok
		
		driver.close();
	}

}

package PackOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int delay = 2000;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		WebElement altbtn = driver.findElement(By.cssSelector("#alertBox"));
		altbtn.click();
		Alert alrt = driver.switchTo().alert();
		String altmsg = alrt.getText();
		System.out.println("Text in the alert box: " + altmsg);
		alrt.accept();
		String popup = driver.findElement(By.cssSelector("#output")).getText();
		System.out.println("Pop up message: " + popup);
		Thread.sleep(3 * delay);
		
		altbtn = driver.findElement(By.cssSelector("#confirmBox"));
		altbtn.click();
		alrt = driver.switchTo().alert();
		altmsg = alrt.getText();
		System.out.println("Text in the Confirm box: " + altmsg);
		alrt.accept();
		popup = driver.findElement(By.cssSelector("#output")).getText();
		System.out.println("Pop up message: " + popup);
		Thread.sleep(3 * delay);
		altbtn = driver.findElement(By.cssSelector("#confirmBox"));
		altbtn.click();
		alrt = driver.switchTo().alert();
		altmsg = alrt.getText();
		System.out.println("Text in the Confirm box: " + altmsg);
		alrt.dismiss();
		popup = driver.findElement(By.cssSelector("#output")).getText();
		System.out.println("Pop up message: " + popup);
		Thread.sleep(3 * delay);
		
		altbtn = driver.findElement(By.cssSelector("#promptBox"));
		altbtn.click();
		alrt = driver.switchTo().alert();
		altmsg = alrt.getText();
		System.out.println("Text in the Prompt box: " + altmsg);
		alrt.sendKeys("testString given!");
		Thread.sleep(3 * delay);
		alrt.accept();
		popup = driver.findElement(By.cssSelector("#output")).getText();
		System.out.println("Pop up message: " + popup);
		driver.quit();
	}
/*Output
Text in the alert box: I am an alert box!
Pop up message: You selected alert popup
Text in the Confirm box: Press a button!
Pop up message: You pressed OK in confirmation popup
Text in the Confirm box: Press a button!
Pop up message: You pressed Cancel in confirmation popup
Text in the Prompt box: Please enter your name:
Pop up message: You entered text testString given! in propmt popup*/
}

package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/iframes");
		Thread.sleep(3000);
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(frame1);
		WebElement btn1 = driver.findElement(By.cssSelector("#actionButton"));
		String initext1 = btn1.getText();
		btn1.click();
		String nxtext1 = btn1.getText();
		System.out.println("Intial Text on button(frame1): " + initext1);
		System.out.println("Final Text on button(frame1): " + nxtext1);
		driver.switchTo().defaultContent();Thread.sleep(2000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src = '/selenium/frame2']"));
		driver.switchTo().frame(frame2);
		WebElement btn2 = driver.findElement(By.cssSelector("#actionButton"));
		String initext2 = btn2.getText();
		btn2.click();
		String nxtext2 = btn2.getText();
		System.out.println("Intial Text on button(frame2): " + initext2);
		System.out.println("Final Text on button(frame2): " + nxtext2);
		driver.close();
	}
/*Output
Intial Text on button(frame1): Click Me!
Final Text on button(frame1): Button Pressed
Intial Text on button(frame2): Click Me!
Final Text on button(frame2): Button Pressed*/
}

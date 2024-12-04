package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		String firstWindow = driver.getWindowHandle(); System.out.println(firstWindow); // 6F10AB371C2C281CB713A5CA321CD520
		Set<String> windows = driver.getWindowHandles(); System.out.println(windows); // [FA23BE6B28AA43AB96A4F68130115F9E, C7665C04D120A8BCFD0E3A7C074BB4D7]
		
		Iterator<String> itr = windows.iterator();
		String id1 = itr.next();
		String id2 = itr.next();
		
		driver.switchTo().window(id2);
		System.out.println("Title: " + driver.getTitle());
		Thread.sleep(3000);driver.switchTo().window(id1);
		System.out.println("Title: " + driver.getTitle());
		Thread.sleep(6000);driver.switchTo().window(id2);
		System.out.println("Title: " + driver.getTitle());
		Thread.sleep(6000);driver.switchTo().window(id1);
		System.out.println("Title: " + driver.getTitle());
		Thread.sleep(6000);driver.switchTo().window(id2);
		System.out.println("Title: " + driver.getTitle());
		Thread.sleep(6000);driver.switchTo().window(id1);
		System.out.println("Title: " + driver.getTitle());
		/*Output
A0D20605AE09D84A60353E20043085AA
[A0D20605AE09D84A60353E20043085AA, 12132ABCA625EEFB627502220BDF7A02]
Title: Human Resources Management Software | OrangeHRM
Title: OrangeHRM
Title: Human Resources Management Software | OrangeHRM
Title: OrangeHRM
Title: Human Resources Management Software | OrangeHRM
Title: OrangeHRM
*/
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		driver.quit();
	}

}

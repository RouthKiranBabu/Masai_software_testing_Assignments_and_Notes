package Package;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class class02 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> windowList = new ArrayList(windowIDs);
		String parentid = windowList.get(0);
		String childid = windowList.get(1);
//		Switch to child Window
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle()); // Human Resources Management Software | OrangeHRM
//		Switch to parent window
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle()); // OrangeHRM
	}
}
package YouTube;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Class26 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		System.out.println("Page Source: " + driver.getPageSource());
//		getWindowHandle() - returns ID of the single Browser window which changes
		System.out.println("Window ID: " + driver.getWindowHandle()); // Window ID: D1EA61FA9F8C43EB2BA946435D5B81C5
//		getWindowHandles() - returns ID's of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids); // [D1EA61FA9F8C43EB2BA946435D5B81C5, FA0006AA7E816179C8DA15B5BF0F71A2]
//		close() - closes only one window, quit() - closes multiple window
	}

}

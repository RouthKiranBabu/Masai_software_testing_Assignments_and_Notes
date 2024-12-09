package PackOne;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		for(String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl()); // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
			}
		}
		for(String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println("Title: " + title);
//			Title: OrangeHRM
//			Title: Human Resources Management Software | OrangeHRM
		}
		for(String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println("Title: " + title);
			if (title.equals("Human Resources Management Software | OrangeHRM")) {
				driver.close(); // Closes the tab which has the title 
			}
		}
	}

}

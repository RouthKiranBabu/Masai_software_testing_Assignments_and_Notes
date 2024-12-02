/*For right Click*/
package Actions_CalendarHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Class_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.id("#doubleClickBtn"));
//		For double click - .doubleClick(button)
		action.doubleClick(button).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}

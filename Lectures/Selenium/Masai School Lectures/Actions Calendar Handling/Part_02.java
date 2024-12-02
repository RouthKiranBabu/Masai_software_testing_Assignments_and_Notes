/*For right Click*/
package Actions_CalendarHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Class_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions actions = new Actions(driver);
//		Copy relative xpath from selector hub
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Thread.sleep(2000);
//		Right clicks on a button
		actions.contextClick(button).build().perform();
		Thread.sleep(4000);
		driver.quit();	
	}

}

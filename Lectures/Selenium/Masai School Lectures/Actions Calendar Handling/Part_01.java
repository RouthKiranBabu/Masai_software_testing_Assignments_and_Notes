/*For right Click*/
package Actions_CalendarHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Class_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Actions actions = new Actions(driver);
//		Copy relative xpath from selector hub
		WebElement button = driver.findElement(By.cssSelector("#hot-spot"));
		Thread.sleep(2000);
//		Right clicks on the button. build() - Creates the action, perform() - completing the action
		actions.contextClick(button).build().perform();
		Thread.sleep(4000);
		System.out.println(driver.switchTo().alert().getText()); //You selected a context menu
		driver.switchTo().alert().accept();
		driver.quit();
	}

}

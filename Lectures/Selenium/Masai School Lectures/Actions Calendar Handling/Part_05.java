package Actions_CalendarHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action = new Actions(driver);
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement ital = driver.findElement(By.id("box106"));
		WebElement washing = driver.findElement(By.id("box3"));
		WebElement us = driver.findElement(By.id("box103"));
		action.dragAndDrop(rome, ital).perform();
		action.dragAndDrop(washing, us).perform();
	}

}

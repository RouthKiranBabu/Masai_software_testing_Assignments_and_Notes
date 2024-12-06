package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement football = driver.findElement(By.id("draggable"));
		WebElement dropzone1 = driver.findElement(By.id("droppable"));
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		actions.dragAndDrop(football, dropzone2).perform(); Thread.sleep(2000);
		actions.dragAndDrop(football, dropzone1).perform(); Thread.sleep(2000);
		driver.quit();
	}

}

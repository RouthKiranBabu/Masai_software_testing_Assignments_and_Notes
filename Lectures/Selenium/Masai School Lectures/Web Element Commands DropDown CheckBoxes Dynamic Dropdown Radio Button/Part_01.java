package WebElementCommands_Drop_Down_Checkboxes_DynamicDropdown_Radio_Buttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Actions actions = new Actions(driver);
		WebElement ele1 = driver.findElement(By.id("inputText1"));
		ele1.sendKeys("This is some text in the text box!");
//		ctrl + A
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		ctrl + C
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
//		Tab
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//		ctrl + V
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		driver.close();
	}

}

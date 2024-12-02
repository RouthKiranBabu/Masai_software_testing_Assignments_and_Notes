package WebElementCommands_Drop_Down_Checkboxes_DynamicDropdown_Radio_Buttons;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.className("multiselect-selected-text")).click();
		List<WebElement> eleist1 = driver.findElements(By.xpath("//label[@class='checkbox']"));
//		Clicks which is not selected
		for(WebElement ele: eleist1) {
			if(!ele.isSelected()) {
				ele.click();
			}
		}
//		Clicks the specific element which contains java and python
		for(WebElement ele: eleist1) {
			if(ele.getText().contains("Java") || ele.getText().contains("Python")) {
				ele.click();
			}
		}
	}

}

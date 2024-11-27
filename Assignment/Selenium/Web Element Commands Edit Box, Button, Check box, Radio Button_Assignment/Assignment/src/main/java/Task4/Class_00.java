package Task4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_00 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> eleist = driver.findElements(By.xpath("(//div[@id= 'radio-btn-example'])/descendant::input"));
		for (int i = 0; i < eleist.size(); i ++) {
			String name = eleist.get(i).getAttribute("value");
			System.out.println("Attribute value: " + name);
			System.out.println((eleist.get(i).isSelected()) ? "Status: Selected!" : "Status: Not Selected!");
			eleist.get(i).click();
			Thread.sleep(1000);
			System.out.println((eleist.get(i).isSelected()) ? "Status: Selected!" : "Status: Not Selected!");
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}

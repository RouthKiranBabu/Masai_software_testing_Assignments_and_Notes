package Task3;

import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> clist = driver.findElements(By.xpath("(//div[@class = 'right-align'])[1]/descendant::input"));
		System.out.println("Checkbox Status and clicks:");
		for(int i = 0; i < clist.size(); i += 1) {
			boolean isselected = (clist.get(i).isSelected() ? true: false);
			if (!isselected) {
				System.out.println("Detected not checked so making Check...");
				clist.get(i).click();
			}
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}

package Task2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dver = new ChromeDriver();
		dver.manage().window().maximize();
		dver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		List of element having the tag name button
		List<WebElement> elelist = dver.findElements(By.tagName("button"));
		System.out.println("List of button Text: ");
//		for loop for getting all the elements from list
		for(int i = 0; i < elelist.size(); i ++) {
			WebElement ele = elelist.get(i);
//			To get the text written on button
			String text = ele.getText();
			System.out.println("Si no: " + (i + 1) + ", Button Text: " + text + ".");
		}
//		Getting one of the element and clicking
		WebElement ele = elelist.get(0);
		System.out.println("Home Page is available(for 3 seconds): ");
		ele.click();
		Thread.sleep(3000);
		dver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("End of Home Page...");
		Thread.sleep(3000);
		dver.close();
		System.out.println("Driver closed!");
	}

}

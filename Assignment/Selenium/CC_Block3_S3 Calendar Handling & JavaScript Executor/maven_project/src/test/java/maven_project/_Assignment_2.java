package maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
//		Implicit wait and explicit wait together are not recommended, 
//		Makes unexpected waits
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String obj = "Shoes";
		String search_box_xpath = "//input[@placeholder='Search products & brands']";
		String search_icon_xpath = "//span[text()='Search']";
		String scroll_px = "1000";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		Enter shoes in search box
		js.executeScript("document.evaluate(\"" + search_box_xpath + "\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='" + obj + "';");
		Thread.sleep(3000);
		
//		Click Search Button
		WebElement search_btn = driver.findElement(By.xpath(search_icon_xpath));
		js.executeScript("arguments[0].click()", search_btn);
		Thread.sleep(3000);
		
//		Scroll down and up
		js.executeScript("window.scrollBy(0, " + scroll_px + ")");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -" + scroll_px + ")");
		Thread.sleep(3000);
		
//		Clearing search box
//		js.executeScript("document.evaluate(\""+search_box_path+"\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='';");
//		driver.findElement(By.xpath(search_box_path)).clear();
		
		js.executeScript("document.evaluate(\""+search_box_xpath+"\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='';");
		

		
		
	}

}

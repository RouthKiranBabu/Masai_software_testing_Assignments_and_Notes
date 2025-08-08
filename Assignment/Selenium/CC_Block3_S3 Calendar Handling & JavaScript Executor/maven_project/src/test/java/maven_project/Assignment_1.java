package maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		String obj = "Shoes";
		String search_box_path = "(//input)[1]";
		
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement search_box = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_box_path)));
//		Enter Shoes
		search_box.sendKeys(obj);
//		Click Search
		WebElement search_btn = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'Search']")));
		search_btn.click();
		
//		Scroll down to all the shoes
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		WebElement related_search_text = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text() = 'Related Searches']")));
		js.executeScript("arguments[0].scrollIntoView(true)", related_search_text);
		Thread.sleep(3000);
		
//		Scroll back to search again
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight);");
		Thread.sleep(3000);
		
//		Clearing the Shoes text
		driver.findElement(By.xpath(search_box_path)).clear();
		
		
//		driver.quit();
	}

}

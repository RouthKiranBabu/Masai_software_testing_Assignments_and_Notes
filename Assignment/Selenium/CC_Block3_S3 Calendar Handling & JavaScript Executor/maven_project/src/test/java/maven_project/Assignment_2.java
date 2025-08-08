package maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement search_box = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
//		WebElement search_btn = driver.findElement(By.xpath("//span[text()='Search']"));
		WebElement search_box = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search products & brands']")));
		WebElement search_btn = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Search']")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		Enter shoes in search box
		js.executeScript("arguments[0].value='Shoes';", search_box);
//		Click on Search button
		js.executeScript("arguments[0].click();", search_btn);
//		Scroll down
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
//		Scroll back to top
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
//		Clear the Search input box
		js.executeScript("arguments[0].value='';", search_box);
	}

}

package PackOne;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.snapdeal.com/");
			WebDriverWait waitsea = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement Search = waitsea.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search products & brands']")));
			//WebElement Search = driver.findElement(By.xpath("//input[@placeholder = 'Search for anything']"));
			Search.sendKeys("Shoes");
			WebDriverWait waitseb = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement searchbtn = waitseb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class= 'searchTextSpan']")));
			//WebElement searchbtn = driver.findElement(By.xpath("//input[@value = 'Search']"));
			searchbtn.click();
	        JavascriptExecutor je = (JavascriptExecutor) driver;
	        Thread.sleep(3000);
	        je.executeScript("window.scrollTo(0, document.body.scrollHeight/4);");
	        Thread.sleep(3000);
	        je.executeScript("window.scrollTo(0, document.body.scrollHeight/2);");
	        Thread.sleep(3000);
	        je.executeScript("window.scrollTo(0, document.body.scrollHeight*(3/4));");
	        Thread.sleep(3000);
	        je.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        Thread.sleep(3000);
	        je.executeScript("window.scrollTo(0, 0);");
	        Thread.sleep(3000);
	        Search.clear();
	        Thread.sleep(3000);
		}catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
	}

}

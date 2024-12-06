package PackOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement we = driver.findElement(By.xpath("//input[@class = 'form-control-file']"));
		je.executeScript("arguments[0].scrollIntoView();", we);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		we.sendKeys("C://Users//kiran//OneDrive//文档//txtfile.txt");
		
		WebElement uf = driver.findElement(By.id("uploadedFilePath"));
		if(uf.getText().contains("txtfile.txt")) {
			System.out.println("File is uploaded!");
		}
		
	}

}

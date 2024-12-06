package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement we = driver.findElement(By.xpath("//input[@id='input-4']"));
		je.executeScript("arguments[0].scrollIntoView();", we);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		we.sendKeys("C://Users//kiran//OneDrive//文档//txtfile.txt");
		
		WebElement uf = driver.findElement(By.xpath("//div[@class='kv-fileinput-error file-error-message']"));
		if(uf.getText().contains("txtfile.txt")) {
			System.out.println("File is uploaded!");
			System.out.println("Text: " + uf.getText());
//			File is uploaded!
//			Text: ×
//			File "txtfile.txt" (0.00 KB) is too small and must be larger than 0 KB.
		}
	}

}

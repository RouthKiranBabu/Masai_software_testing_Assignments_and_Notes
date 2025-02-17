package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03_linkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
//		For exact text of link tag or a tag. Text must be exact.
		driver.findElement(By.linkText("Tablets")).click();
		Thread.sleep(8000);
//		Partial text of the link text. Where this may find duplicates.
		driver.findElement(By.partialLinkText("Table")).click();
		Thread.sleep(8000);
		driver.quit();//35:06
	}

}

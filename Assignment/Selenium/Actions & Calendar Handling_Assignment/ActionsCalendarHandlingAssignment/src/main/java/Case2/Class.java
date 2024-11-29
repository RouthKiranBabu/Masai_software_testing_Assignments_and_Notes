package Case2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Class {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://books.toscrape.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Nonfiction']")).click();
		String title = driver.getTitle();
		if (title.contains("Nonfiction")) System.out.println("Yes its a nonfiction page!");
		else System.out.println("No its a nonfiction page!");
		Thread.sleep(3000);
		driver.close();
	}
//	Output: Yes its a nonfiction page!
}

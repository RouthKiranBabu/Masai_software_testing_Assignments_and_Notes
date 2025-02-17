package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class04_findingMultipleElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		List<WebElement> headerList = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total Number Element[className = 'list-inline-item']: " + headerList.size()); // Total Number Element[className = 'list-inline-item']: 7
		
//		To find the number of a tag or links in the driver
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total Number Element[tagName = 'a']: " + linkList.size()); // Total Number Element[tagName = 'a']: 76
		
//		To find the number of images in the webpage
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("Total Number Element[tagName = 'img']: " + imgList.size()); // Total Number Element[tagName = 'img']: 18
		
		driver.quit();
	}

}

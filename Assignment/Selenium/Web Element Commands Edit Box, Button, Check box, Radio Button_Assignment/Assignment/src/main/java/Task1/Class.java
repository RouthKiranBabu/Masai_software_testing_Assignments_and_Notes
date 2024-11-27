package Task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Class {
	public static void main(String[] args) throws InterruptedException {
//		Choosing chrome Driver
		WebDriver dver = new ChromeDriver();
//		Maximizing the window
		dver.manage().window().maximize();
		dver.get("https://rahulshettyacademy.com/AutomationPractice/");
		dver.findElement(By.id("name")).click();
//		Storing elements in varible type WebElement
		WebElement usingid = dver.findElement(By.id("name"));
		WebElement usingname = dver.findElement(By.name("enter-name"));
		WebElement usingxpath = dver.findElement(By.xpath("//input[@class = 'inputs']"));
//		Sends the value to the element
		usingid.sendKeys("This text using ID!");
//		To get the value
		String valid = usingid.getAttribute("value");
		System.out.println("Now Value displayed: " + valid);
		Thread.sleep(3000);
//		To clear the box
		usingid.clear();
		usingname.sendKeys("This text using Name!");
		String valname = usingname.getAttribute("value");
		System.out.println("Now Value displayed: " + valname);
		Thread.sleep(3000);
		usingname.clear();
		usingxpath.sendKeys("This text using Xpath!");
		String valxpath = usingxpath.getAttribute("value");
		System.out.println("Now Value displayed: " + valxpath);
		Thread.sleep(3000);
		usingxpath.clear();
		usingxpath.sendKeys("Finished!");
		Thread.sleep(1000);
		try {
			if(usingid.isEnabled()) {
				System.out.println("Text Box is enabled!");
			}else {System.out.println("Text Box is not enabled!");}
		}finally {
			dver.close();
		}
	}
}

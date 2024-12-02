package WebElementCommands_Drop_Down_Checkboxes_DynamicDropdown_Radio_Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.get("https://text-compare.com/");
		String title = driver.getTitle();
		if(title.equals("Practice Page")) {
			System.out.println("The title is: " + title);
		}else {
			System.out.println("Guessed Title is wrong!");
		}
		WebElement ele = driver.findElement(By.xpath("//button[@id='openwindow']"));
		String idvalue = ele.getAttribute("id");
		System.out.println("Id value: " + idvalue);
		String classvalue = ele.getAttribute("class");
		System.out.println("Class value: " + classvalue);
		/*
The title is: Practice Page
Id value: openwindow
Class value: btn-style class1*/
		WebElement ele1 = driver.findElement(By.xpath("//legend[normalize-space()='Switch Window Example']"));
		String str = ele1.getText();
		if(str.contains("Window")) {
			System.out.println("Yes, " + str + " contains Window.");
		}// Yes, Switch Window Example contains Window.
		
		System.out.println(ele1.getTagName()); // legend
		System.out.println(driver.getPageSource());
		/*<html lang="en"><head>
  <title>Practice Page</title>
  <meta charset="utf-8">
  <link rel="icon" href="images/rs_logo.png" type="image/x-icon">*/
		System.out.println(driver.getCurrentUrl()); // https://rahulshettyacademy.com/AutomationPractice/
		driver.close();
	}

}

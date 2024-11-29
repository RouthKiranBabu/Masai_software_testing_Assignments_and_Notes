package Case1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://books.toscrape.com/");
		String title = driver.getTitle();
		if(!title.equals("My Store")) System.out.println("My Store is not the title");
		else System.out.println("My Store is the title");
		driver.close();
//		output: My Store is not the title
	}

}

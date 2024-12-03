package Part1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		if(title.equals("Selenium")) {
			System.out.println("Success message: Title is Selenium!");
		}else {
			System.out.println("Message: Title is not Selenium!");
		}
		driver.close();
	}

}
/*Output
Success message: Title is Selenium!*/
package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		if (title.equals("Selenium")) {
			System.out.println("Yes, title is 'Selenium'");
		}else {
			System.out.println("No, title is not \"Selenium\"");
		}
		driver.close();
		// Output: Yes, title is 'Selenium'
	}

}

package Pack3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement frame = driver.findElement(By.xpath("(//iframe)[4]"));
		driver.switchTo().frame(frame);
		String str1 = driver.findElement(By.xpath("//h1[@id = 'sampleHeading']")).getText();
		if (str1.equals("This is a sample page")) {
			System.out.println("Yes, the text is same!"); // Yes, the text is same!
			
		}
		driver.quit();
	}

}

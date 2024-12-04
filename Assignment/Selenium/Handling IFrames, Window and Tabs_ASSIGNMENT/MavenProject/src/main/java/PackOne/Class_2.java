package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		String altmsg = driver.findElement(By.xpath("//div[@id = 'flash']")).getText();
		System.out.println("Success message: " + altmsg);
		
		driver.quit();
	}

}
/*Output
Success message: You logged into a secure area!
×*/

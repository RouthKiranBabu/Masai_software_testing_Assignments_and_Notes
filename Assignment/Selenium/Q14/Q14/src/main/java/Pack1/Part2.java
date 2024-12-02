package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement download = driver.findElement(By.xpath("//span[contains(text(), \"Downloads\")]"));
		download.click();
		String downloadUrl = driver.getCurrentUrl();
		//System.out.println(downloadUrl); // https://www.selenium.dev/downloads/
		if (downloadUrl.contains("/downloads")) {
			System.out.println("Yes, url contains \"/downloads\".");
		}else {
			System.out.println("No, url does not contains \"/downloads\".");
		}
		driver.close();
		//Output: Yes, url contains "/downloads".
	}

}

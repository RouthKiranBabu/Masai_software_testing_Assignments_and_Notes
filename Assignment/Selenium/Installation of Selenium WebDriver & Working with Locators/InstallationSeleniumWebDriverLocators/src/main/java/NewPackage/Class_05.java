package NewPackage;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Class_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		List<WebElement> eleist = driver.findElements(By.xpath("(//div[@class='w-full lg:pt-6 xl:pt-8'])"));
		for(int i = 0; i < eleist.size(); i ++) {
			String txt = eleist.get(i).getText();
			System.out.println(txt);
		}
	}

}

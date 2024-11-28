package NewPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

public class Class_00 {
	
	public void printText(WebDriver driver, String xpat) {
		String text1 = "\n" + driver.findElement(By.xpath(xpat)).getText();
		System.out.println(text1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		Class_00 cls = new Class_00();
		
		String xpath1 = "//h1[@class = 'hero-tag']"; cls.printText(driver, xpath1);
		String xpath2 = "//a[@title = \"Airport Transfers\"]"; cls.printText(driver, xpath2);
		String xpath3 = "//div[@class='search-lbl']"; cls.printText(driver, xpath3);
		String xpath4 = "//div[@class='adv-flex']";
		List<WebElement> elelist = driver.findElements(By.xpath(xpath4));
		for(int i = 0; i < elelist.size(); i ++) {
			String text = elelist.get(i).getText();
			System.out.println("Si no: " + i + ".\nText: " + text);
		}
		String xpath5 = "//div[@class='trvl-head']"; cls.printText(driver, xpath5);
		String xpath6 = "//div[@class='bus-place']";
		List<WebElement> elelist2 = driver.findElements(By.xpath(xpath6));
		for(int i = 0; i < elelist2.size(); i ++) {
			String text = elelist2.get(i).getText();
			System.out.println("Text: " + text);
		}
		driver.quit();
	}

}
/*Output:
 
Book your journey now with the world's largest bus platform

Airport Transfers

SEARCH
Si no: 0.
Text: Worldwide coverage
Find affordable travel tickets across the world, all at one place
Si no: 1.
Text: Anxiety-free travel
We ensure your information is safe and your travel is hassle free, wherever you go
Si no: 2.
Text: No hidden charges
Find the best deals online and guess what, refunds are simple!

Top Travelled Bus Routes
Text: Vienna to Bratislava
Text: London to Oxford
Text: Berlin to Prague
Text: Lisbon to Porto
Text: Tallinn to Riga
Text: Rome to Florence
*/
 */
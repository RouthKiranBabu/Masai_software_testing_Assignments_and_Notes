package NewPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		List<WebElement> eleist = driver.findElements(By.xpath("//ul[@class='vl-flyout-nav__container']/li"));
		for(int i = 0; i < eleist.size(); i ++) {
			String text = eleist.get(i).getText();
			System.out.println("Si no: " + (i + 1) + ", Element: " + text);
		}
		List<WebElement> eleist1 = driver.findElements(By.xpath("(//ul[@class='carousel__list'])[3]/li"));
		for(int i = 0; i < eleist1.size(); i ++) {
			String text = eleist1.get(i).getText();
			System.out.println("Si no: " + (i + 1) + ", Category: " + text);
		}
		driver.quit();
	}

}
/*Si no: 1, Element: Explore (New!)
Si no: 2, Element: Saved
Si no: 3, Element: Electronics
Si no: 4, Element: Motors
Si no: 5, Element: Fashion
Si no: 6, Element: Collectibles and Art
Si no: 7, Element: Sports
Si no: 8, Element: Health & Beauty
Si no: 9, Element: Industrial equipment
Si no: 10, Element: Home & Garden
Si no: 11, Element: Deals
Si no: 12, Element: Sell
Si no: 13, Element: 
Si no: 1, Category: Luxury
Si no: 2, Category: Sneakers
Si no: 3, Category: P&A
Si no: 4, Category: Refurbished
Si no: 5, Category: Trading cards
Si no: 6, Category: Pre-loved Luxury
Si no: 7, Category: Toys
*/

package NewPackage;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Class_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> elelist1 = driver.findElements(By.xpath("//div[@id='gw-card-layout']/div"));
		for(int i = 0; i < elelist1.size(); i ++) {
			String text = elelist1.get(i).getText();
			System.out.println("Sections: " + text);
		}
		/*Sections: Score Black Friday Week deals
Amazon Basics & more
Home improvement
Cell phones & accessories
Furniture
Shop all deals
Sections: Refresh your space
Dining
Home
Kitchen
Health and Beauty
See more
Sections: Toys under $25
Shop now
Sections: Shop Black Friday deals
Shop Black Friday deals
Sections: Must-see Black Friday Week deals
Home
Sports & outdoors
Beauty
Headphones
Shop all deals
Sections: Black Friday Week deals are here
Tech & gaming
Toys & games
Kitchen
Fashion
Shop all deals
Sections: Get your game on
Shop gaming
Sections: Easy updates for elevated spaces
Baskets & hampers
Hardware
Accent furniture
Wallpaper & paint
Shop home products
Sections: Fashion trends you like
Dresses
Knits
Jackets
Jewelry
Explore more
*/
	}

}

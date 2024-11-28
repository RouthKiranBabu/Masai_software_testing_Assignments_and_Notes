package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;

public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		String xpath1 = "//div[@class='imageSlideContainer']";
		String text = driver.findElement(By.xpath(xpath1)).getText();
		System.out.println(text);
		String xpath2 = "//span[@class='commonModal__close']";
		driver.findElement(By.xpath(xpath2)).click();
		String xpath3 = "//ul[@class='makeFlex font12 headerIconsGap']";
		List<WebElement> elelist = driver.findElements(By.xpath(xpath3));
		for(int i = 0; i < elelist.size(); i ++) {
			String tex = elelist.get(i).getText();
			System.out.println("Travel Plans: " + tex);
		}
		String xpath4 = "//div[@class=\"aboutDesc\"]";
		List<WebElement> elelist1 = driver.findElements(By.xpath(xpath4));
		for(int i = 0; i < elelist1.size(); i ++) {
			String tex1 = elelist1.get(i).getText();
			System.out.println("Si no: " + i + ".\nDescription: " + tex1);
		}
		driver.quit();
	}

}
/*PERSONAL ACCOUNT
MYBIZ ACCOUNT
Mobile Number
+91
CONTINUE
Or Login/Signup With
By proceeding, you agree to MakeMyTrip's  Privacy Policy, User Agreement and T&Cs
Travel Plans: Flights
Hotels
Homestays & Villas
Holiday Packages
Trains
Buses
Cabs
Forex Card & Currency
Travel Insurance
Si no: 0.
Description: Why MakeMyTrip?
Established in 2000, MakeMyTrip has since positioned itself as one of the leading companies, providing great offers, competitive airfares, exclusive discounts, and a seamless online booking experience to many of its customers. The experience of booking your flight tickets, hotel stay, and holiday package through our desktop site or mobile app can be done with complete ease and no hassles at all. We also deliver amazing offers, such as Instant Discounts, Fare Calendar, MyRewardsProgram, MyWallet, and many more while updating them from time to time to better suit our customers’ evolving needs and demands.
Si no: 1.
Description: Booking Flights with MakeMyTrip
At MakeMyTrip, you can find the best of deals and cheap air tickets to any place you want by booking your tickets on our website or app. Being India’s leading website for hotel, flight, and holiday bookings, MakeMyTrip helps you book flight tickets that are affordable and customized to your convenience. With customer satisfaction being our ultimate goal, we also have a 24/7 dedicated helpline to cater to our customer’s queries and concerns. Serving over 5 million happy customers, we at MakeMyTrip are glad to fulfill the dreams of folks who need a quick and easy means to find air tickets. You can get a hold of the cheapest flight of your choice today while also enjoying the other available options for your travel needs with us.
Si no: 2.
Description: Domestic Flights with MakeMyTrip
MakeMyTrip is India's leading player for flight bookings. With the cheapest fare guarantee, experience great value at the lowest price. Instant notifications ensure current flight status, instant fare drops, amazing discounts, instant refunds and rebook options, price comparisons and many more interesting features.
*/
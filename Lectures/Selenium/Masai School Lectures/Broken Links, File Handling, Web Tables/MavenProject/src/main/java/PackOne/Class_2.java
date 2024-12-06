package PackOne;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.xpath("//li//a[@href]"));
		List<String> hrefs = new ArrayList<String>();
		for(WebElement link : links) hrefs.add(link.getAttribute("href"));
		int brokenlinks = 0;
		int activelinks = 0;
		for(String href: hrefs) {
			try {
				URL url = new URL(href);
				HttpURLConnection req = (HttpURLConnection) url.openConnection();
				int status = req.getResponseCode();
				if (status >= 400) {
					System.out.println("Broken Link: " + url);
					brokenlinks += 1;
				}else {
					System.out.println("Active Link: " + url);
					activelinks += 1;
				}
			}catch(Exception e) {
				e.getMessage();
			}
		}
		System.out.println("Total Links: " + hrefs.size()); // Total Links: 45
		System.out.println("Broken Links: " + brokenlinks); // Broken Links: 42
		System.out.println("Active Links: " + activelinks); // Active Links: 2
		driver.quit();
	}
}
// https://students.masaischool.com/lectures/91789?tab=notes
// 31:15
/*...Broken Link: http://www.deadlinkcity.com/default.asp?r=6
Broken Link: http://www.deadlinkcity.com/default.asp?r=7
Broken Link: http://www.deadlinkcity.com/disallowed/disallowed.html
Broken Link: http://www.deadlinkcity.com/disallowed/nonexistent.html*/
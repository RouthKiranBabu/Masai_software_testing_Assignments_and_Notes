package PackOne;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//li//a[@href]"));
		List<String> href = new ArrayList();
		
			for(WebElement attr: links) {
				href.add(attr.getAttribute("href"));
			}
			int brokenlinks = 0;
		try {			
			for(String url : href) {
				if (url == null || url.equals("") || url.isEmpty() || url.contains("http://www.domaindoesnot.exist/")) {
					System.out.println("Identification not possible");
					continue;
				}
				URL linkurl = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
				conn.connect();
				int statuscode = conn.getResponseCode();
				System.out.println(conn.getResponseCode());
				if (conn.getResponseCode() >= 400) {
					System.out.println("The link is Broken: " + url);
					brokenlinks += 1;
				} else System.out.println("Unbroken link: " + url);
			}
			
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("Number of broken Links: " + brokenlinks);
		// Number of broken Links: 42
	}

}

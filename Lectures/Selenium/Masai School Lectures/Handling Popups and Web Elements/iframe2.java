package packMain;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"courses-iframe\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//a[contains(text(), \"All Access \")])[1]")).click();
		List<WebElement> msgs = driver.findElements(By.xpath("//div[@class = 'testimonial']"));
		for (int i = 0; i < msgs.size(); i++) {
			String txt = msgs.get(i).getText();
			System.out.println("" + i + "\n" + txt);
		}
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		String txt = driver.findElement(By.xpath("//legend[contains(text(), 'Mouse')]")).getText();
		System.out.println(txt);
		/*0
I had initially enrolled in Rahul's selenium course which gave me a premium learning experience and wanted to enroll more of his courses. My dream of becoming a full stack QA has become a reality thanks to the Platinum plan which gave me lifeaccess to all existing and new courses with host of other benefits. I feel great that there is always something new skills to learn from his courses and to advance in my career.
1
Rahul is not only a teacher but also a mentor and guide to me. His interview and Resume prepartion assistance was very beneficial in landing SDET position in a leading product based company.
2
From being a Manual tester for 5 years and then landing a job as senior automation engineer was possible only because I took selenium, restassured, jmeter, design patterns course as part of the Silver package. I'm really indebted to you for sharing your knowledge and I believe anyone taking life time subscription has QA career learning covered for lifetime.
Mouse Hover Example*/
		driver.quit();
	}

}

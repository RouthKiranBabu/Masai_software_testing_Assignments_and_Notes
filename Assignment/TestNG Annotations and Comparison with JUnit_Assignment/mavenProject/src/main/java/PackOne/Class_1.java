package PackOne;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_1 {
	WebDriver driver = new ChromeDriver();

  @Test
  public void goTest() {
//    throw new RuntimeException("Test not implemented");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	String title = driver.getTitle();
	System.out.println("Title: " + title);
  }

  @Test
  public void handlingCheckboxTest() {
    List<WebElement> boxes = driver.findElements(By.xpath("//div[@id='checkbox-example']/descendant::input"));
    for (int box = 0; box < boxes.size(); box ++) {
    	boxes.get(box).click();
    }
  }
  
  @Test
  public void handlingRadioButtonTest() throws InterruptedException {
	  List<WebElement> raios = driver.findElements(By.xpath("//div[@id='radio-btn-example']/descendant::input"));
	    for (int box = 0; box < raios.size(); box ++) {
	    	Thread.sleep(2000);
	    	raios.get(box).click();
	    }
  }
}
// right click on test-output/index.html open with System editor
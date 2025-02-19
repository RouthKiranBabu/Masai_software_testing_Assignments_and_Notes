	package Package;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Class01_usingMultiAttribute {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/");
			
			driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("T-Shirts");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@placeholder='Search'][@name='search']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@placeholder='Search'][@name='search']")).sendKeys("New T-Shirts");
			Thread.sleep(2000);
			
			driver.quit();
		}
	
	}

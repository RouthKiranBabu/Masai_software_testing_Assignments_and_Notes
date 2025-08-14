package java_package;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_reports_assertions_in_testNG {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	ExtentSparkReporter spark;
	
	@BeforeClass(groups = {"Setup", "All_test_cases"})
	public void setup(ITestContext testcontext) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement cnt_shp = driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		if (cnt_shp.isDisplayed()) {
			cnt_shp.click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		spark = new ExtentSparkReporter("Extent_Report_example.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Automation Report");
		spark.config().setTheme(Theme.DARK);
		
		reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("Device", "Laptop");
		reports.setSystemInfo("Performed By", "Tester");
		reports.setSystemInfo("Tester Name", System.getProperty("user.name"));
		String os = testcontext.getCurrentXmlTest().getParameter("os");
		reports.setSystemInfo("OS", os);
		/* in testng.xml(run this file as run as testNG suite)
		 * <parameter name="os" value="Windows"></parameter>
  	<parameter name="browser" value="Chrome"></parameter>*/
		String browser = testcontext.getCurrentXmlTest().getParameter("browser");
		reports.setSystemInfo("Browser", browser);
		/*in testng.xml
		 * <groups>
		<run>
			<include name="All_test_cases"/>
			<!-- <include name="Start"/>
			<include name="Search"/>
			<include name="End"/>-->
		</run>
	</groups>*/
		List<String> includedGroups = testcontext.getCurrentXmlTest().getIncludedGroups();
		if(!includedGroups.isEmpty()) {
			reports.setSystemInfo("Groups", includedGroups.toString());
		}
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("Laptop");
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement search_btn = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Go']")));
		search_btn.click();
		
		test = reports.createTest("Search for Laptop", "Prints the laptop text in Eclipse Console...");
		test.assignCategory("Start");
		test.skip("Setting up driver, reports, etc at setup gets passed!");
		test.log(Status.SKIP, "From Log: Setting up driver, reports, etc at setup gets passed!");

	}
	
	public static String captureScreen(WebDriver driver, String tname) throws IOException{
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		String target_path = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timestamp + ".png"; 
		File targetfile = new File(target_path);
		FileUtils.copyFile(sourcefile, targetfile);
		sourcefile.renameTo(targetfile);
		return target_path;
	}
	
	@Test(priority = 3, groups = {"Print_Laptop", "All_test_cases"})
	public void get_info() throws IOException {
		List<WebElement> laptops = driver.findElements(By.xpath("//div[@role='listitem']"));
		int number_of_laptops = 11;
		if (number_of_laptops < laptops.size() && number_of_laptops <= 10) {
			for (int i = 0; i < number_of_laptops; i++) {
				System.out.println("<<<" + i + ">>>");
				System.out.println(laptops.get(i).getText());
			}
			test.assignCategory("Search");
//			test.pass("Number of laptop Searched " + number_of_laptops + ".");
			test.log(Status.PASS, "From Log: " + "Number of laptop Searched " + number_of_laptops + ".");
		}else {
			for (int i = 0; i < laptops.size(); i++) {
				System.out.println("<<<" + i + ">>>");
				System.out.println(laptops.get(i).getText());
			}
			test.assignCategory("Search");
//			test.fail("Number of laptop Searched is more than 10.");
			test.log(Status.PASS, "Number of laptop Searched is more than 10.");
			
			try {
				String img_path = captureScreen(driver, "saved_screenshot");
				test.addScreenCaptureFromPath(img_path);
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//			File targetfile = new File("C:\\Users\\kiran\\OneDrive\\Desktop\\CCP_Block3_S4 Extent Reports and Assertions in TestNG\\maven_project\\src\\test\\java\\java_package\\New_screenshot.png");
//			FileUtils.copyFile(sourcefile, targetfile);
		}
	}
	
	@AfterClass(groups = {"Exits", "All_test_cases"})
	public void close_up() {
		test.assignCategory("Exit");
		
		String title = driver.getTitle();
		if (title.contains("Laptop")) {
			assertTrue(true);
			test.log(Status.PASS, "Laptop exists in title.");
		}else {
			assertTrue(false);
			test.log(Status.FAIL, "Laptop does not exists in title.");
		}
		driver.quit();
		reports.flush();
		
	}
}

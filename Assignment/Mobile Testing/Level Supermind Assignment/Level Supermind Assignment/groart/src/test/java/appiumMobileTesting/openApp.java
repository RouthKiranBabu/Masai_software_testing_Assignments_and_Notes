package appiumMobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class openApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		try {
			openApp();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void openApp() throws MalformedURLException, InterruptedException{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
//		dc.setCapability("platformVersion", "10 QKQ1.190828.002");
//		dc.setCapability("platformVersion", "12.0.3Stable");
//		dc.setCapability("platformVersion", "12.0.3(QEJMIXM)");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("deviceName", "pocoPhone");
		dc.setCapability("udid", "bb2f736b");
		dc.setCapability("automationName", "UiAutomator2");
		dc.setCapability("noReset", true);
		
		dc.setCapability("appPackage", "level.game");
		dc.setCapability("appActivity", "level.game.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723");
		
		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.xpath("com.android.permissioncontroller:id/permission_logo"));
		if(logo.isDisplayed()) {
			System.out.println("Logo is Visible...");
		}
		System.out.println("Setup done successfully...");
	}

}

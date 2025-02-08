package appiumMobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class LoginProcess {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		// Perform Login
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
		WebElement usernameField = driver.findElement(By.id("com.level.supermind:id/username"));
        usernameField.sendKeys("testuser@example.com");
        
        WebElement passwordField = driver.findElement(By.id("com.level.supermind:id/password"));
        passwordField.sendKeys("Test@123");
        
        WebElement loginButton = driver.findElement(By.id("com.level.supermind:id/login_button"));
        loginButton.click();
        
        // Wait and check if login is successful
        Thread.sleep(5000);
        
        System.out.println("Login Test Completed");
        
        // Close the driver
        driver.quit();
	}

}

package pack_1;

import org.testng.ITestContext;

/*Two ways to implement TestListener
 * Method 1
 * class myListener implements TestListener{
 * 
 * }
 * 
 * Method 2
 * class myListener extends TestListenerAdapter{
 * 
 * }
 * 
 * Ctrl + hover and click on ITestListener
 * 
 * Search testng listeners -> https://testng.org/testng_listeners.html
 * Click on ITestListener -> docs
 * https://testng.org/#_testng_listeners
 * Click on the java doc
 * https://javadoc.io/static/org.testng/testng/7.9.0/org/testng/ITestListener.html
 * 
 * Convert Class_1.java file -> Convert to testNG
 * Browse in the same Pack
 * Right click on the testng.xml file run as testNG Suite*/

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Class_2_Listener implements ITestListener{
	
	public void onStart(ITestContext result) {
		System.out.println("On Start: Test Execution has started...");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start: Test Started...");
	}
	
	public void onTestSuccess(ITestResult result) {	
		System.out.println("On Test Success: Test Passed...");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure: Test Failed...");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped: Test Skipped...");
	}

	public void onFinish(ITestContext result) {
		System.out.println("On Finish: Test Execution is Finished...");
	}
}


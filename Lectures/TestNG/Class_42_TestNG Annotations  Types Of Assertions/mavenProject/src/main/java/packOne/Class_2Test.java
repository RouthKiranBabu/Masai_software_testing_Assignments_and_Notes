package packOne;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_2Test {

	@BeforeClass
	void login() {
		System.out.println("This is login...");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("This is search...");
	}
	
	@Test(priority = 2)
	void advancedSearch() {
		System.out.println("This advanced Search...");
	}
	
	@AfterClass
	void logout() {
		System.out.println("This is logout...");
	}

}
/*[RemoteTestNG] detected TestNG version 7.4.0
This is login...
This is search...
This advanced Search...
This is logout...
PASSED: advancedSearch
PASSED: search

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================

*/
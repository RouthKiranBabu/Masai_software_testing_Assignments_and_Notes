package PackOne;

import org.testng.annotations.Test;

public class Class_2 {
//  @Test is annotation
	@Test(priority = 1)
	void openapp() {
		System.out.println("Opens the application...");
	}
	
	@Test(priority = 3)
	void login() {
		System.out.println("Login into the application...");
	}
	
	@Test(priority = 2)
	void logout() {
		System.out.println("Logout into the application...");
	}

}
/*Opens the application...
Logout into the application...
Login into the application...
PASSED: openapp
PASSED: logout
PASSED: login

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================
*/

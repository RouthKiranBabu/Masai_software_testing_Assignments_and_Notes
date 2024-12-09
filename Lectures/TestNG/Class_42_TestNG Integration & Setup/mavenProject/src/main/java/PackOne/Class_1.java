package PackOne;

import org.testng.annotations.Test;

public class Class_1 {
	
	@Test
	void openapp() {
		System.out.println("Opens the application...");
	}
	
	@Test
	void login() {
		System.out.println("Login into the application...");
	}
	
	@Test
	void logout() {
		System.out.println("Logout into the application...");
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}

}
/*[RemoteTestNG] detected TestNG version 7.4.0
Login into the application...
Logout into the application...
Opens the application...
PASSED: login
PASSED: logout
PASSED: openapp

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================*/

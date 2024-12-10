package packThree;
// https://www.youtube.com/watch?v=_yjcTM6ZHlo&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR&index=14
// 50:50
import org.testng.annotations.*;

public class Class_4_All_annotations {
	
	@BeforeSuite
	void bs() {
		System.out.println("This is BeforeSuite...");
	}
	
	@AfterSuite
	void as() {
		System.out.println("This is AfterSuite...");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("This is BeforeTest...");
	}
	
	@AfterTest
	void at() {
		System.out.println("This is AfterTest...");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("This is BeforeClass...");
	}
	
	@AfterClass
	void ac() {
		System.out.println("This is AfterClass...");
	}
	
	@BeforeMethod
	void be() {
		System.out.println("This is BeforeMethod...");
	}
	
	@AfterMethod
	void ae() {
		System.out.println("This is AfterMethod...");
	}
	
	@Test(priority = 2)
	void Test2() {
		System.out.println("This is Test priority 2...");
	}
	
	@Test(priority = 1)
	void Test1() {
		System.out.println("This is Test priority 1...");
	}
}
/*Output
[RemoteTestNG] detected TestNG version 7.4.0
This is BeforeSuite...
This is BeforeTest...
This is BeforeClass...
This is BeforeMethod...
This is Test priority 1...
This is AfterMethod...
This is BeforeMethod...
This is Test priority 2...
This is AfterMethod...
This is AfterClass...
This is AfterTest...
PASSED: Test1
PASSED: Test2

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

This is AfterSuite...

===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================*/

/*Right click on this file -> TestNG -> Convert to TestNG. Browse it in the same package*/
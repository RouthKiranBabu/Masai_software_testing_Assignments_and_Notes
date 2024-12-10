package pack_1_dependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_1 {
	@Test(priority = 1)
	void openapp() {
		Assert.assertTrue(false);
	}
//	if openapp test passes then this does and skip increases to one.
	@Test(priority = 2, dependsOnMethods = {"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority = 3)
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority = 4)
	void advanceSearch() {
		Assert.assertTrue(true);
	}
	@Test(priority = 6, dependsOnMethods = {"search", "advanceSearch"})
	void logout() {
		Assert.assertTrue(true);
	}
//	To use this method both openapp and advanceSearch must pass
	@Test(priority = 5, dependsOnMethods = {"openapp", "advanceSearch"})
	void about() {
		Assert.assertTrue(true);
	}
	
}
/*Output
PASSED: advanceSearch
PASSED: search
PASSED: logout
FAILED: openapp
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	
SKIPPED: about
java.lang.Throwable: Method Class_1.about()[pri:5, instance:pack_1_dependencyMethods.Class_1@6e171cd7] depends on not successfully finished methods
	at
	
SKIPPED: login
java.lang.Throwable: Method Class_1.login()[pri:2, instance:pack_1_dependencyMethods.Class_1@6e171cd7] depends on not successfully finished methods
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:102)
	

===============================================
    Default test
    Tests run: 6, Failures: 1, Skips: 2
===============================================


===============================================
Default suite
Total tests run: 6, Passes: 3, Failures: 1, Skips: 2
===============================================
*/

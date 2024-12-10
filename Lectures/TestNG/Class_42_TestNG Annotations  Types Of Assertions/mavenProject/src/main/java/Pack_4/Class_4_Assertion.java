package Pack_4;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Class_4_Assertion {
	@Test
	void testTitle() {
		String exp_title = "OpenCart";
		String act_title = "OpenShop";
		if(exp_title.equals(act_title)) {
			System.out.println("test passed");
			Assert.assertTrue(true);
		}else {
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}
	}
}
/* Right click on file and 'Run As' 'TestNG Test'
 * Output
[RemoteTestNG] detected TestNG version 7.4.0
Test failed
FAILED: testTitle
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
...*/
 */
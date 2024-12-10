package Pack_4;

import org.testng.annotations.Test;

public class class_1_Assertion {
	@Test
	void testTitle() {
		String exp_title = "OpenCart";
		String act_title = "OpenShop";
		
		if(exp_title.equals(act_title)) {
			System.out.println("test passed...");
		}else {
			System.out.println("test failed...");
		}
	}
}
/*Right click -> Run As -> TestNG
 * Output:
[RemoteTestNG] detected TestNG version 7.4.0
test failed...
PASSED: testTitle

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================
*/
package Pack_4;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Class_3_Assertion {
	
	@Test
	void testTitle() {
		String exp_title = "OpenCart";
		String act_title = "OpenShop";
		Assert.assertEquals(exp_title, act_title);
		/*Right click on this file -> Run as -> TestNG Test*/
	}
	
}

package Pack_4;

import org.testng.annotations.Test;

public class Class_2_Assertion {
	@Test
	void testTitle() {
		String exp_title = "OpenCart";
		String act_title = "OpenCart";
		
		if(exp_title.equals(act_title)) {
			System.out.println("test passed...");
		}else {
			System.out.println("test failed...");
		}
	}
}

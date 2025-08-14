package java_package;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testing {
	@Test(priority = 1)
	void hard_assert() {
		System.out.println("hprint");
		System.out.println("hprint");
//		If the hard assert fails below code does not execute
		Assert.assertEquals(1, 1);
		System.out.println("hprint");
	}
	@Test(priority = 2)
	void soft_assert() {
		System.out.println("sprint");
		System.out.println("sprint");
//		In soft assert if it fails it execute below code
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(12, 13);
		System.out.println("sprint");
//		Mendatory to put at last to get the response clearly
		sa.assertAll();
	}
}

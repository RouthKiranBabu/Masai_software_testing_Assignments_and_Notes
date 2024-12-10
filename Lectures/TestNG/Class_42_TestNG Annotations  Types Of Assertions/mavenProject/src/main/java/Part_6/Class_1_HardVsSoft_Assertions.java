package Part_6;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class_1_HardVsSoft_Assertions {
	@Test
	void test_hardAssertions1() {
		System.out.println("Before Assert1.");
		Assert.assertEquals(1, 1);
		System.out.println("After Assert1.");
	}
	
	@Test
	void test_hardAssertions2() {
		System.out.println("Before Assert2.");
		Assert.assertEquals(2, 1);
		System.out.println("After Assert2.");
	}
	
	@Test
	void test_softAssertions1() {
		System.out.println("Before Assert2.");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2); // soft assertion
		System.out.println("After Assert2.");
		sa.assertAll(); // mandatory other wise this method gets passed
	}
}
/*Output
 * Comment: After the assert fail execution does'nt happen
 * if we want to execute the below code of assertion we 
 * go for the soft assertion
 * So hard assertion is placed most of time at last of the methods
Before Assert1.
After Assert1.
Before Assert2.
Before Assert2.
After Assert2.
PASSED: test_hardAssertions1
PASSED: test_softAssertions1
FAILED: test_hardAssertions2
java.lang.AssertionError: expected [1] but found [2]
	at org.testng.Assert.fail(Assert.java:99)*/

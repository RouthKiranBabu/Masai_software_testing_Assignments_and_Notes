package Pack_5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_1_Hard_Assertions {
	@Test
	void test1() {
		//Assert.assertEquals(false, false);
//		Assert.assertEquals(12, 34);
		Assert.assertEquals("asdfa", 34);
	}
	@Test
	void test2() {
		Assert.assertNotEquals("asdfa", 34);
	}
	@Test
	void test3() {
//		Assert.assertTrue(false); // fails
//		Assert.assertTrue(1 == 2); // fails
//		Assert.assertTrue(true); // pass
//		Assert.assertFalse(1 == 2); // pass
//		Assert.assertTrue(1 == 2); // fails
		Assert.fail(); // fails
	}
}

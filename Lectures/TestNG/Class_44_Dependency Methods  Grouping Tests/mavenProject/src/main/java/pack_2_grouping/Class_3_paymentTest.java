package pack_2_grouping;

import org.testng.annotations.Test;

public class Class_3_paymentTest {
	@Test(priority = 1, groups = {"sanity", "regression"})
	void paymentInRupees() {
		System.out.println("Payment in rupees...\"sanity\", \"regression\"");
	}
	
	@Test(priority = 2, groups = {"sanity", "regression"})
	void paymentInDollars() {
		System.out.println("Payment in dollars...\"sanity\", \"regression\"");
	}
}
/*right click on the package -> new -> File -> browse in the same
 * package and name the file as 'grouping.xml' */

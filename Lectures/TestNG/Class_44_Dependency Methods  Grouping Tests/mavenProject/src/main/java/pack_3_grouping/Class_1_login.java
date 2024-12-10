package pack_3_grouping;
/*
 * loginbyfacebook - sanity
 * loginbyemail - sanity
 * loginbytwitter - sanity
 * 
 * signupbyfacebook - regression
 * signupbyemail - regression
 * signupbytwitter - regression
 * 
 * paymentInRupees - sanity, regression (functional)
 * paymentInDollars - sanity, regression (functional)
*/
import org.testng.annotations.Test;

public class Class_1_login {
	@Test(priority = 1, groups = {"sanity"})
	void loginByEmail() {
		System.out.println("This is login by email...sanity");
	}
	
	@Test(priority = 2, groups = {"sanity"})
	void loginByFacebook() {
		System.out.println("This is login by facebook...sanity");
	}
	
	@Test(priority = 3, groups = {"sanity"})
	void loginByTwitter() {
		System.out.println("This is login by twitter...sanity");
	}
}

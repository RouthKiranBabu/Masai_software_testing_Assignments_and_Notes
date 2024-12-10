package pack_3_grouping;

import org.testng.annotations.Test;

public class Class_2_signupClass {
	@Test(priority = 1, groups = {"regression"})
	void signUpByEmail() {
		System.out.println("This is signup by Email...regression");
	}
	
	@Test(priority = 2, groups = {"regression"})
	void signUpByFacebook() {
		System.out.println("This is signup by Facebook...regression");
	}
	
	@Test(priority = 3, groups = {"regression"})
	void signUpByTwitter() {
		System.out.println("This is signup by Twitter...regression");
	}
}

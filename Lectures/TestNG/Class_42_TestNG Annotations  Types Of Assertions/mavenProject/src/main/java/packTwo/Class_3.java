package packTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_3 {

	@Test
	void pqr() {
		System.out.println("This is Test pqr() from class_3...");
	}
	
	@BeforeSuite
	void bs() {
		System.out.println("This is BeforeSuite bs() from class_3...");
	}
	
	@AfterSuite
	void as() {
		System.out.println("This is AfterSuite as() from class_3...");
	}

}

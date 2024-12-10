package packTwo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class_2 {

	@Test
	void t() {
		System.out.println("This is Test t() in class_2...");
	}
	
	@AfterTest
	void bt() {
		System.out.println("This is AfterTest bt() from class_2...");
	}

}

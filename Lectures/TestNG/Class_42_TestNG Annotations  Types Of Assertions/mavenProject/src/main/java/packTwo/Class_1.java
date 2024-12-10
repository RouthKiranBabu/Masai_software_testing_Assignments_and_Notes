/*Right click on package -> TestNG -> Convert to testNG
 * Then you gets the testing.xml which has 
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="packTwo.Class_2"/>
      <class name="packTwo.Class_1"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

rightclick on testing.xml -> run as -> TestNG Suite -> ok -> proceed
*/
package packTwo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_1 {

	@Test
	void t() {
		System.out.println("This is Test t() in class_1...");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("This is BeforeTest bt() from class_1...");
	}

}

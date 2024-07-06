package TestNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {

	
	@Test
	public void test_001()
	{
		
	System.out.println("Email Id");
	System.out.println("Password");
	System.out.println("Login");
	
	SoftAssert soft=new SoftAssert();	
	
	String expected="Welcome";
	String actual="welcome";
	
	soft.assertEquals(actual,expected);
	System.out.println("Test Verify sucessfully");


	System.out.println("This is test 2");
	soft.assertAll();
}

}

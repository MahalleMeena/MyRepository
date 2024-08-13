package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void verify_test_001()
	{
		System.out.println("Email Id");
		System.out.println("Password");
		System.out.println("Login");
		
		String Expected="Welcome";
		String Actual="welcome";
		Assert.assertEquals(Actual, Expected);
		System.out.println("Test Verify sucessfully");
	}
	@Test
	public void test_002()
	{
		System.out.println("This is test 2");
	}


}

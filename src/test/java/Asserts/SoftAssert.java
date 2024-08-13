package Asserts;

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
	}
@Test
public void test_002()
{

	SoftAssert soft=new SoftAssert();	
	soft.assertAll();
	System.out.println("This is test 2");
}

	private void assertAll() {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String actual, String expected) {
		// TODO Auto-generated method stub
		
	}

}



package TestNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	@Test(invocationCount=2)
	public void test_001()
	{
		System.out.println("Test case 1");
	}
	
	
	@Test(priority=1)
	public void test_002()
	{
		System.out.println("Test case 2");
}
	@Test(priority=3)
	public void test_003()
	{
		System.out.println("Test case 3");
		Assert.assertTrue(false);
}
	@Test(priority=2,enabled=false)
	public void test_004()
	{
		System.out.println("Test case 4");
}
	@Test(priority=4,dependsOnMethods="test_003")
	public void test_005()
	{
		System.out.println("Test case 5");
}
}

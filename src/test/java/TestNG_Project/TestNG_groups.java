package TestNG_Project;

import org.testng.annotations.Test;

public class TestNG_groups {
	@Test(groups="Sanity")
	public void Test_001() {
		System.out.println("This is a Sanity test cases_001");	
	}
	@Test(groups="Regression")
	public void Tast_002()
	{
	System.out.println("This is a Regression test cases_002");	
	}
	@Test(groups="Critical Regression")
	public void Tast_003()
	{
		System.out.println("This is a Critical Regression test cases_003");	
		}
	@Test(groups="Regression")
	public void Tast_004()
	{
	System.out.println("This is a Regression test cases_004");	
	}
	
	@Test(groups="Sanity")
	public void Tast_005()
	{
	System.out.println("This is a Sanity test cases_005");	
	}
}

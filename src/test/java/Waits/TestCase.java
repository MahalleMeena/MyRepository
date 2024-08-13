package Waits;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase extends BaseClass
{
	@Test
	public void test_001()
	{
		try
		{
		LoginWebElement login=PageFactory.initElements(driver,LoginWebElement.class);
		
		login.getTxt_email().sendKeys("Test@123");
		Library_Genericmtd.explicitwait( driver, 5, login.getTxt_email());
		
		login.getTxt_pass().sendKeys("12345");
		Library_Genericmtd.explicitwait(driver, 5, login.getTxt_pass());
		
		login.getBtn_login().click();
		Library_Genericmtd.explicitwait(driver, 5, login.getBtn_login());
		
		
	     }
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
package Test_Pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BrowserPOM.BrowserOpen;
import DiffPagesPom.LoginPage;

public class Test_1 extends BrowserOpen{
	@Test
	public void test_001()
	{
	 LoginPage login=PageFactory.initElements(driver,LoginPage.class);	
	 login.getTxt_email().sendKeys("Test@123");
	 
	 login.getTxt_password().sendKeys("1234");
	 
	}

}

package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Implicit_Wait extends BaseClass
{
@Test
public void verify_wait()
{
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	LoginWebElement login=PageFactory.initElements( driver,LoginWebElement.class);
	
	login.getTxt_email().sendKeys("Test@123");
	login.getTxt_pass().sendKeys("1234");
	login.getBtn_login().click();
	
}
}

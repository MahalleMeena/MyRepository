package Waits;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

public class Explicit_Wait extends BaseClass
{
	@Test
	public void verify_Tc_001()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		LoginWebElement login =	PageFactory.initElements(driver, LoginWebElement.class);
		
		login.getTxt_email().sendKeys("Test@123");
		wait.until(ExpectedConditions.visibilityOf(login.getTxt_email()));
		
		login.getTxt_pass().sendKeys("123");
		wait.until(ExpectedConditions.visibilityOf(login.getTxt_pass()));
		
		login.getBtn_login().click();
		wait.until(ExpectedConditions.visibilityOf(	login.getBtn_login()));
	}


}
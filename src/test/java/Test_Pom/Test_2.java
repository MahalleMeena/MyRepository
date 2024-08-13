package Test_Pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BrowserPOM.BrowserOpen;
import DiffPagesPom.LoginPage;

public class Test_2 extends BrowserOpen {
@Test
public void test_002()
{
LoginPage login=PageFactory.initElements(driver,LoginPage.class);	
login.getBtn_login().click();
}
}

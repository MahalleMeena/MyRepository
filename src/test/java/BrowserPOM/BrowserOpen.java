package BrowserPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen 
{
	public static WebDriver driver;
	@BeforeMethod
	public void BOpen() throws Exception
	{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}	
@AfterMethod
public void BDown()
{
	driver.close();
}
}

package TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	@BeforeMethod
	
	public void setup()
	{
	// Browser opening
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown()
	{
		// Browser closing
		driver.close();
	}
	}
	



package TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserBase {
	
	WebDriver driver;
	
	@Parameters({"BrowserName"})
	@BeforeMethod()
	public void BM(String BrowserName)
	  {
		if(BrowserName.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		
		else if(BrowserName.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	 }
	
	@AfterMethod
	public void AM()
	{
		driver.close();
	}
}

package TestNG_Project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CrossBrowserChild extends CrossBrowserBase{
	@Test
		public void Test_001()
		{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@123");
		}
	@Test
	public void Test_002()
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("T123");	
	}
	@Test
	public void Test_003()
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		}


}

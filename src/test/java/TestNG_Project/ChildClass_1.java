package TestNG_Project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChildClass_1 extends BaseClass{
	@Test
	public void Test_001() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@123");
		Thread.sleep(3000);
	}
	

}

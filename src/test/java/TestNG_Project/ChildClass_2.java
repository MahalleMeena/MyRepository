package TestNG_Project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChildClass_2 extends ChildClass_1{
	@Test
	public void Test_002() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		Thread.sleep(4000);
	}

}

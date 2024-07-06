package TestNG_Project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChildClass_3 extends ChildClass_2 {
	@Test
	public void Test_003() throws Exception
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	}

}

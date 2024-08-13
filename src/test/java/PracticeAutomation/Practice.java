package PracticeAutomation;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Practice 
{
	public static void main(String[] args) throws Exception 
		{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Myfb.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String path="C:\\Users\\sagarmahalle28\\eclipse-workspace\\Automation_Project\\ScreenShot";
		String rm=RandomString.make(2);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		//driver.close();
 }
}

package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class SS_DiffName {

	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Identyfy webelement
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String rm=RandomString.make(3);
		String path="C:\\Users\\sagarmahalle28\\eclipse-workspace\\Automation_Project\\ScreenShot";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}

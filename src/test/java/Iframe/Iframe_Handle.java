package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_Handle 
{
	WebDriver driver;
	@Test
	public void tc_001()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("file:///C:/Users/sagarmahalle28/OneDrive/Desktop/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//number of frame present on webpage
		
		//System.out.println("Total iframe present on webpage : "+driver.findElement(By.tagName("iframe")).getSize());)
	
//Switch to selenium
//iframe handling using index
driver.switchTo().frame(1);

driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[text()='Click here for login facebook']")).click();

driver.navigate().back();

//iframe handling using string name
driver.switchTo().frame("Selenium");
driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();

driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[text()='Click here for login facebook']")).click();

driver.navigate().back();

//iframe handling using webelement(xpath)
driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();

driver.switchTo().defaultContent();
driver.quit();

}
}
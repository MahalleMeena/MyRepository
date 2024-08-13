package Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Library_Genericmtd 
{
	public static void custom_sendkeys(WebElement element,String value)
	{
		try {
			element.sendKeys(value);
		}catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}
	}
public static void custom_click(WebElement element)
{
	try
	{
		element.click();	
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}	
}
public static void explicitwait(WebDriver driver,int time,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
}


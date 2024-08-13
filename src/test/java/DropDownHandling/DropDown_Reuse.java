package DropDownHandling;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Reuse 
{
	public static void main(String[] args) 
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	
	WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel=new Select(country);
	
	System.out.println(sel.getFirstSelectedOption().getText());
	
	List<WebElement> list=sel.getOptions();
	
	System.out.println(list.size());

	for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("INDIA"))
				{
					list.get(i).click();
				}
		}
	driver.close();
	}
}

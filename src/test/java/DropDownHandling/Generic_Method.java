package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic_Method
{
	public static void HandlingDropDown(WebElement elemet, String text)
	{
		Select sel=new Select(elemet);
		sel.selectByVisibleText(text);
	}
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		HandlingDropDown(country,"INDIA");
driver.close();
	}

}

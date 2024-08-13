package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down {

	public static void main(String[] args) throws Exception 
	{
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel=new Select(drp_country);
	
	// selectByValue
	sel.selectByValue("ARGENTINA");
	Thread.sleep(3000);
	
	// sel.selectByIndex
	sel.selectByIndex(2);
	Thread.sleep(3000);
	
	// selectByVisibleText
	sel.selectByVisibleText("ANTIGUA AND BARBUDA");
	Thread.sleep(3000);
	
	driver.close();
	}

}

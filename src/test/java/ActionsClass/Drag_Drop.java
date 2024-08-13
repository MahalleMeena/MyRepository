package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act.dragAndDrop(src1, dest).build().perform();
		Thread.sleep(3000);
	}

}

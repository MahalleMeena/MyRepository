package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Movement 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		// One click
		WebElement Drp_Selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		act.contextClick(Drp_Selenium).click(Drp_Selenium).build().perform();
		Thread.sleep(3000);
		
		//Right Click
		WebElement Right_Click=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.moveToElement(Right_Click).build().perform();
		Thread.sleep(3000);
		
		// Double Click
		WebElement  Double_Click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Double_Click).build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}

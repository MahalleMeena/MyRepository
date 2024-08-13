package ScrollingWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Generic 
{
	WebDriver driver;
	
	public static void main(WebDriver driver,WebElement element) throws Exception 
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//ScrollBy Element	
		WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		HandleScrollByElement( driver,english);
	
	}
	public static void HandleScrollByElement(WebDriver driver,WebElement element) throws Exception 
	{

		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView()",element);
	
	}


}

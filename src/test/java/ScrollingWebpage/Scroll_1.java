package ScrollingWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_1 {
	
	@Test
	public void Test_001() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//ScrollBy Pixel
		js.executeScript("window.scrollBy(0,500)"," ");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-500)", " ");
		Thread.sleep(2000);
		
		//ScrollBy Element
		WebElement element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()",element);
	}


}

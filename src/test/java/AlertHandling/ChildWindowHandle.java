package AlertHandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ChildWindowHandle 
{
	public static void main(String[] args)
	{
	 // BBrowser Opening
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	
// Parent window address		
String parentwinAddress=driver.getWindowHandle();
System.out.println(parentwinAddress);

// Identify WebElement
	driver.findElement(By.xpath("//a[text()='Click Here']")).click();

// All window address
Set<String> AllwinAddress=driver.getWindowHandles();
System.out.println(AllwinAddress);

Iterator<String> it =AllwinAddress.iterator();
while(it.hasNext())
{
String ChildwinAdress=it.next();
if(!parentwinAddress.equals(ChildwinAdress))
{
	driver.switchTo().window(ChildwinAdress);
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("1234");
	driver.close();
}
}
driver.switchTo().window(parentwinAddress);
driver.close();
}
}


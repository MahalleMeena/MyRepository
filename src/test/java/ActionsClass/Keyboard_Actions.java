package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions 
{
	public static void main(String[] args) throws Exception
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
	act.keyDown(txt_email,Keys.SHIFT).sendKeys("text").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(3000);
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(3000);
	
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(3000);
	
	WebElement txt_pass=driver.findElement(By.xpath("//input[@name='pass']"));
	txt_pass.click();
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(3000);
	
	WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
	btn_login.sendKeys(Keys.ENTER);
	driver.close();
	}

}

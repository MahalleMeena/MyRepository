package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandling {

	public static void main(String[] args) throws Exception {
		// BBrowser Opening
				WebDriverManager.edgedriver().setup();
				WebDriver driver=new EdgeDriver();
				driver.get("https://demo.guru99.com/test/delete_customer.php");
				driver.manage().window().maximize();
				
			// WebElement Identify
				driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
				driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			// driver navigate alert window accept()
				Alert alt=driver.switchTo().alert();
				alt.accept();
				
			// First alert window OK click
				String firstwindowmsg=alt.getText();
				System.out.println( firstwindowmsg);
				Thread.sleep(3000);
				
			// driver navigate alert window dismiss()
			    //alt.dismiss();
				
			// First alert window OK click
				alt.accept();
				String secondwindowmsg=alt.getText();
				System.out.println( secondwindowmsg);
				
				driver.close();
	}

}

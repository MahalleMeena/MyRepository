package AutomationTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheet {
	public static void main(String[] args) throws Exception {
		
    WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    
    WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
    WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
    
    String path="C:\\Users\\sagarmahalle28\\eclipse-workspace\\Automation_Project\\ExcelData\\Data.xlsx";
   FileInputStream fis = new FileInputStream(path);
   XSSFWorkbook wb = new  XSSFWorkbook(fis);
   
   String email=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
   System.out.println(email);
   txt_email.sendKeys(email);
   
   String pass=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
   System.out.println(pass);
   txt_pass.sendKeys(pass);
   
    driver.findElement(By.xpath("//button[@name='login']")).click();
    driver.close();
	}

}

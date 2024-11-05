package selenium_class;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
		// TODO Auto-generated method stub
		 FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		 Row rw = sheet.getRow(0);
		Cell c1 = rw.getCell(0);
		String usn=c1.getStringCellValue();
		System.out.println(usn);
		Cell c2 = rw.getCell(1);
		String pwd=c2.getStringCellValue();
		System.out.println(pwd);
		
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}

package selenium_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinksintoExcelFromFlipkart {

	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book1 = WorkbookFactory.create(fis);
		Sheet x = book1.createSheet("flipkart");
		int count=links.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			Row rw = x.createRow(i);
			Cell cl = rw.createCell(0);
			cl.setCellValue(url);
		}
		FileOutputStream fos=new FileOutputStream("./Excel/TestData.xlsx");
		book1.write(fos);

	}

}

package selenium_class;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("./Testdata/testdata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		System.out.println(url);
		String usn = pro.getProperty("usn");
		System.out.println(usn);
		String pwd = pro.getProperty("pwd");
		System.out.println(pwd);
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get(url);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}

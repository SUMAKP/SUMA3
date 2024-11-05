package selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_serailorder {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/HTML/checkbox1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//int count=links.size();
		for(WebElement x:links)       //for each loop
		{
			x.click();
			Thread.sleep(1000);
			
		}
		//for(int i=0;i<=count-1;i++)    //for loop
			//{
				//WebElement g=links.get(i);
				//g.click();
				//Thread.sleep(1000);
				
			//}
		//for(int i=count-1;i>=0;i--)
		//{
			//WebElement g=links.get(i);
			//g.click();
			//Thread.sleep(1000);
			
		//}
		driver.quit();

	}

}

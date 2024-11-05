package selenium_class;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Amazon_get_all_href {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		/*
		 * int count=links.size(); System.out.println(count);
		 */
		/*
		 * for(int i=0;i<count;i++) { WebElement we=links.get(i);
		 * 
		 * System.out.println(we.getAttribute("href")); }
		 */
		for(WebElement l:links)
		{
			
			System.out.println(l.getAttribute("href"));
		}
		driver.quit();
		

	}

}

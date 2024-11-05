package selenium_class;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Gettext_of_all_links {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		/*
		 * int count=links.size(); System.out.println(count); for(int i=0;i<count;i++) {
		 * WebElement we=links.get(i); System.out.println(we.getText()); }
		 */
		for(WebElement link:links)
		{
		
			System.out.println(	link.getText());
		}
		driver.quit();
		
	}

}

package selenium_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_select_dropdown 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/single_selectdropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement links=driver.findElement(By.id("Nandana palace"));	
		Select s=new Select(links);
		List<WebElement> l=s.getOptions();
		ArrayList<String> a=new ArrayList<String>();
		for(WebElement w:l)
		{
			a.add(w.getText());
		}
		Collections.sort(a);
		for(String s1:a)
		{
			System.out.println(s1);
		}
		driver.quit();
		//Select s=new Select(links);
		//s.selectByIndex(1);
		//Thread.sleep(2000);
		//s.selectByValue("i");
		//Thread.sleep(2000);
		//s.selectByVisibleText("masala dosa");
		//Thread.sleep(2000);
		//s.deselectAll();
		}
	
	}
	

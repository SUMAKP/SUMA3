package selenium_class;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_sort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.facebook.com/r.php/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		TreeSet<String> x = new TreeSet<String>( Collections.reverseOrder() ) ;
		//TreeSet<String> l = new TreeSet<String>();
		for(WebElement ap:opt)
		{
			x.add(ap.getText());
			
		}
		
		
		if(x.contains("Aug"))
		{
			x.remove("Aug");
		}
		
		System.out.println(x);
		driver.quit();

	}

}

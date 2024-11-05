package selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckIsMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/single_selectdropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement links=driver.findElement(By.id("Nandana palace"));	
		Select s=new Select(links);
		boolean b=s.isMultiple();
		if(b)
		{
			System.out.println("Multiselect");
		}
		else
		{
			System.out.println("not a multiselect");
		}
		List<WebElement> list=s.getOptions();
		int count=list.size();
		System.out.println(count);
		for(int i=0;i<count;i=i+2)
		{
			WebElement print=list.get(i);
			System.out.println(print.getText());
		}
		

	}

	
}

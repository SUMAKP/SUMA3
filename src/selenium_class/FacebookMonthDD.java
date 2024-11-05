package selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class FacebookMonthDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(ele);
		List<WebElement> l=s.getOptions();
		for(WebElement w:l)
		{
			String text=w.getText();
			if(text.contains("Aug"))
				System.out.println(text + " present");
			//else
				//System.out.println("not present");
		}
		
		
		driver.quit();
		

	}

}

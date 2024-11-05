package selenium_class;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sibling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/sibling.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(//td[.='1']/following-sibling::td[1]);

	}

}

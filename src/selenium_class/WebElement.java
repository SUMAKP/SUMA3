package selenium_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/enabled.html");
		driver.manage().window().maximize();
		org.openqa.selenium.WebElement usn=driver.findElement(By.id("usn"));
		boolean res=usn.isDisplayed();
		//System.out.println(res);
		//
		//System.out.println(res1);
		if(res==true)
		{
			boolean res1=usn.isEnabled();
			if(res1==true)
			{
			driver.findElement(By.id("usn")).sendKeys("sumakp268");
			}
		}

	}

}

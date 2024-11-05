package selenium_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Assignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		String s=driver.getTitle();
		System.out.println(s);
		
	
		String S1="Facebook";
		System.out.println(S1);
		if(s.contains(S1))
		{
			System.out.println("TEST CASE PASSED");
		}
		else
		{
			System.out.println("TEST CASE FAILED");
		}
		driver.quit();
		}

}

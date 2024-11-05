package selenium_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComapreURL {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		String s=driver.getCurrentUrl();
		System.out.println(s);
		
	
		String S1="www";
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


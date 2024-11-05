package selenium_class;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bothbrowsers {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();

			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
			ChromeDriver driver1 =new ChromeDriver();

	}

}

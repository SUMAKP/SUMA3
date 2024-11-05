package selenium_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom_in_JSE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.guru99.com/regression-testing.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='60%'");
	Thread.sleep(1000);
	driver.quit();
	}

	}

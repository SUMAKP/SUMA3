package selenium_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/disabled_element.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('a1').value=''");
	Thread.sleep(1000);
	driver.quit();
	}

}

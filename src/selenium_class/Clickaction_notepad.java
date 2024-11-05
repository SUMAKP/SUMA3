package selenium_class;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clickaction_notepad {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/HHTML.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
	}

}

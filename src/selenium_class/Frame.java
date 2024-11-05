package selenium_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Frame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/frame.html");
		driver.manage().window().maximize();
		WebElement usn=driver.findElement(By.name("usn"));
		usn.sendKeys("admin");
		driver.switchTo().frame(0);
		WebElement ln=driver.findElement(By.name("ln"));
		usn.sendKeys("ad123");
		driver.switchTo().frame(0);
		WebElement fn=driver.findElement(By.name("fn"));
		usn.sendKeys("12eieo");
		driver.switchTo().frame(0);
		WebElement mo=driver.findElement(By.name("mobile"));
		usn.sendKeys("7829612614");

	}

}

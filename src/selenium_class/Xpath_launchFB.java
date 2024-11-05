package selenium_class;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath_launchFB {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumakp268@gmail.com");
		driver.findElement( By.xpath("//input[@id='pass']")).sendKeys("7829612614");
		driver.findElement( By.xpath("//button[@name='login']")).click();

	}

}

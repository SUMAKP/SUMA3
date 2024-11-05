package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test
	public void login() throws InterruptedException
	{

System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
WebDriver driver= new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
Thread.sleep(2000);
driver.findElement(By.name("name")).sendKeys("sumakp");
Thread.sleep(3000);
driver.findElement( By.name("email")).sendKeys("Sumaprabhakar72@gmail.com");
Thread.sleep(3000);
driver.findElement( By.name("password")).sendKeys("Shwetha1234");
Thread.sleep(3000);
driver.findElement(By.cssSelector("button[type='submit']")).click();
}

}

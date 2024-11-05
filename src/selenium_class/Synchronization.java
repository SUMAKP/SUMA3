package selenium_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=header-mail&pspid=2114723002&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail&add=1");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sumaprabhakar72@gmail.com");
		
		driver.findElement( By.xpath("//input[@id='login-signin']")).click();
		
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("7829612614");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("UPSC SUBJECTS");
		
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("ALL THE BEST");
		
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		
	}

}

package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders_dynamicelment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9526616,77.5275458,15z?entry=ttu");
		driver.findElement(By.xpath("//button[@class='hArJGc vF7Cdb']")).click();
		Thread.sleep(3000);

	}

}

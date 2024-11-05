package selenium_class;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Youtubelaunch_css {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("martin trailer");
		Thread.sleep(3000);
		driver.findElement( By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='title-wrapper']")).click();
	}

}

package selenium_class;

import org.openqa.selenium.chrome.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Openyoutube_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='search']"));
		ele.sendKeys("martin trailer");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement( By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement( By.xpath("//div[@id='title-wrapper' and @class='style-scope ytd-promoted-video-renderer']")).click();
		Thread.sleep(2000);
		driver.findElement( By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']")).click();

	}

}

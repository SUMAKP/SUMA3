package selenium_class;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Flipkart_buy {

	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
			Thread.sleep(3000);
			driver.findElement( By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='CGtC98']")).click();
			Thread.sleep(2000);
			driver.findElement( By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();

}
}

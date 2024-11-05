package selenium_class;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Googlemap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9526616,77.5275458,15z?entry=ttu");
		driver.findElement(By.xpath("//button[@class='hArJGc vF7Cdb']")).click();
		Thread.sleep(3000);
		driver.findElement( By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("attiguppe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("mysuru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"directions-searchbox-1\"]/button[1]/span")).click();

}
}

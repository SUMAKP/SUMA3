package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Handlingdynamicelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='10.15 Crore']/../td[1]"));
		//td[text()='10.15 Crore']/../
		
		//driver.findElement( By.xpath("//td[text()='']/../td[4]"));
	//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='CGtC98']")).click();
		//Thread.sleep(2000);
		//driver.findElement( By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();

		//Auron Mein Kahan Dum Tha
	}

}

package selenium_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("SUMA");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sumakp268@gmail.com");
		Thread.sleep(4000);
		

		WebElement elee = driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
		 elee.click();
		 Select s=new Select(elee);
		 s.selectByIndex(2);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*
		 * Select s = new Select(elee); 
		 * Thread.sleep(2000);
		 * s.selectByVisibleText("Mobile"); 
		 * List<WebElement> el1 = s.getOptions(); for
		 * (WebElement w: el1) { String ss=w.getText(); if(ss.contains("Mobile")) {
		 * s.sel }
		 * 
		 * 
		 * 
		 */
driver.quit();
	}

}

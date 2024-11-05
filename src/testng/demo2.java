package testng;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demo2 {
	

	

	@Test
	public void login() throws InterruptedException
	{

			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("gulon main rang bare");
			Thread.sleep(3000);
			driver.findElement( By.xpath("//button[@id='search-icon-legacy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Coke Studio Season 12 | Gulon Main Rang | Ali Sethi")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@title='I like this']")).click();
			
		}

	}



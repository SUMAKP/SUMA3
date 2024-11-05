package selenium_class;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParametersINTestNG 
{
	@Test(enabled=true)
	public void Window() throws InterruptedException 
	{
		System.out.println("good Morning");
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> all_wh = driver.getWindowHandles();
	//	System.out.println(all_wh.size());
		for(String wh:all_wh)
		{
			driver.switchTo().window(wh);
			//Assert.fail();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		
	driver.quit();

	}
	@Test(dependsOnMethods = "Window")
	
	public  void Dropdown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/single_selectdropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement links=driver.findElement(By.id("Nandana palace"));	
		Select s=new Select(links);
		List<WebElement> l=s.getOptions();

		
	for(WebElement w:l)
	{
		System.out.println(w.getText());
	}
	}

}

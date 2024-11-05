package selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiGetAllTexts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/single_selectdropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement links=driver.findElement(By.id("Nandana palace"));	
		Select s=new Select(links);
		List<WebElement> l=s.getOptions();

		//int count=l.size();
	for(WebElement w:l)
	{
		System.out.println(w.getText());
	}
	}

}

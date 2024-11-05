package selenium_class;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDeleteAug {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(ele);
		List<WebElement> l=s.getOptions();
		ArrayList<String> li=new ArrayList<String>();
		for(WebElement w:l)
		{
			li.add(w.getText());

	}
		//System.out.println(li);
		//for(String lz:li)
		//{
			//System.out.println(lz);
		//}
		TreeSet<String>t=new TreeSet<String>();
		for(String jh:li)
		{
			t.add(jh);
		}
		t.remove("Aug");
		System.out.println(t);
		
		
		
		driver.quit();

}
}

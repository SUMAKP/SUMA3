package selenium_class;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;
import org.openqa.selenium.WebElement;


public class Multiple_elements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3625069440476770643&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198441&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> link=driver.findElements(By.xpath("//img"));
		//java.util.List<org.openqa.selenium.WebElement> link=driver.findElements(By.xpath("//img|//a"));
		int count=link.size();
		System.out.println(count);
        Thread.sleep(2000);
        driver.quit();
	}

}

package selenium_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolldownAndUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=16505377213532296152&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198441&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=3;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}
		for(int i=0;i<=3;i++)
		{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		}
		driver.quit();
	}

}

package testng3_Mon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScriptTestNG  extends GenericScriptTestNG{
	@Test
	public void runScript()
	{
		driver.get("https://en-gb.facebook.com/login/");
	driver.findElement(By.id("email")).sendKeys("admin123");
	driver.findElement(By.id("pass")).sendKeys("admin1237895");
	driver.findElement(By.name("login")).click();
	}



@Test
public void hello()
{
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=16505377213532296152&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198441&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	driver.manage().window().maximize();

	WebElement ele = driver.findElement(By.xpath("//a[.='Amazon Pay on Merchants']"));
			
	Point locn = ele.getLocation();
	int x=locn.getX();
	int y=locn.getY();
	JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy("+x+","+y+")");
ele.click();
}
}


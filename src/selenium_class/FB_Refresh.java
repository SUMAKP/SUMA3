package selenium_class;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FB_Refresh extends GenericScriptTestNG {
	@Test
	public void data()
	{
	 driver.navigate().refresh();
	 ele.sendKeys("suma268@gmail.com");
	
	 
	}
}

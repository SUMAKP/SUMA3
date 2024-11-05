package selenium_class;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFB_AssetFail_TakeScreenshot extends GenericScript_FB{
	
	@Test
public void runScript()
{
	
	 driver.findElement(By.id("email")).sendKeys("sumakp268@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("sumakp268@");
	 driver.findElement(By.name("login")).click();
	
		Assert.fail();
}
}

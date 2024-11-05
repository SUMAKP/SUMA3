package selenium_class;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Wed extends GenericScriptTestNG{
	@Test
	public void data()
	{
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "Hello Facebbok");
		System.out.println("good morning");
		sa.assertAll();
	
	
	}

}

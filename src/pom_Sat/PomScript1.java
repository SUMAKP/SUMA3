package pom_Sat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript1 {
	@FindBy(id="email")
	private WebElement Uname;
	@FindBy(name="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	
	public PomScript1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void PassData(String un)
	{
		Uname.sendKeys("admin");
	}
	public void PassPwd(String p)
	{
		pwd.sendKeys("admin@1234");
	}
	public void ValidClick()
	{
		loginBtn.click();
	}
	
	

}

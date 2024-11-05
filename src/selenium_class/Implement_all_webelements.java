package selenium_class;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Implement_all_webelements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("email"));
		//((WebElement) driver).clear();
		
		//driver.findElement(By.name("login")).click();
		
		//WebElement link=driver.findElement(By.tagName("a"));
		//String res=link.getAttribute("href");
		//System.out.println(res);
		
		//WebElement link=driver.findElement(By.name("email"));
		//String res=link.getCssValue("background-size");
		//int height=link.getSize().getHeight();
		//int width=link.getSize().getWidth();
		//System.out.println(height);
		//System.out.println(width);
		//System.out.println(res);
		//Thread.sleep(2000);
		
		
		//WebElement ele=driver.findElement(By.name("email"));
		//Point locn=ele.getLocation();
		//System.out.println(locn);
		//System.out.println(locn.getX());
		//System.out.println(locn.getY());
		
		
		//Dimension d=new Dimension(200,300);
		//driver.manage().window().setSize(d);
		
		
		//WebElement res=driver.findElement(By.name("email"));
		//System.out.println(res.getTagName()); 
		
		//WebElement res=driver.findElement(By.name("email"));
		//String text=res.getText();
		//System.out.println(text);
		
		WebElement user=driver.findElement(By.name("email"));
		boolean res=user.isDisplayed();
		System.out.println(res);
		
		WebElement pwd=driver.findElement(By.name("email"));
		boolean res1=pwd.isEnabled();
		System.out.println(res1);
		
		WebElement pwd1=driver.findElement(By.name("email"));
		boolean res2=pwd1.isSelected();
		System.out.println(res2);
		
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		

	}

}

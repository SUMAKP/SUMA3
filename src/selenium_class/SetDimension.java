package selenium_class;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class SetDimension {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver1 =new ChromeDriver();	
		driver1.get("https://www.facebook.com/");
		 org.openqa.selenium.WebElement res=driver1.findElement(By.name("email"));
		System.out.println(res.getTagName()); 
		
		Thread.sleep(2000);
		//Dimension d=new Dimension(200,300);
		//driver1.manage().window().setSize(d);
		//Point p=new Point(100,150);
	
		//driver1.manage().window().setPosition(p);
		//Thread.sleep(3000);
		
		driver1.quit();
		
		
		

	}

}


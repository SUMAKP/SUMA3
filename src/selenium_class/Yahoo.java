package selenium_class;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=header-mail&pspid=2114723002&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail&add=1");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sumaprabhakar72@gmail.com");
		Thread.sleep(3000);
		driver.findElement( By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("7829612614");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("UPSC SUBJECTS");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("ALL THE BEST");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		//driver.findElement( By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
		
		//*[@id="ybar-inner-wrap"]/div[2]/div/div[3]/div[1]/div/button
		
		//button[@tabindex='-1' and @class='_yb_13bnjuu _yb_1vve3ar _yb_nd1uon _yb_1f6lljd _yb_1xj0bqd _yb_12pe8to']

	}

}

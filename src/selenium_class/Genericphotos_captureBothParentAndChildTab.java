package selenium_class;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericphotos_captureBothParentAndChildTab {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/browser");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
driver.manage().window().maximize();

Set<String> all_wh = driver.getWindowHandles();
ArrayList<String>ar=new ArrayList<String>(all_wh);

String x = ar.get(1);
driver.switchTo().window(x);
Thread.sleep(3000);
driver.manage().window().maximize();
WebElement y1=driver.findElement(By.xpath("//input[@name='email']"));
y1.sendKeys("sumakp268@gmail.com");
WebElement z=driver.findElement(By.xpath("//input[@name='password']"));
z.sendKeys("sumakp268");
WebElement a1=driver.findElement(By.xpath("//input[@id='confirm-password']"));
a1.sendKeys("sumakp268");
WebElement a2=driver.findElement(By.xpath("//button[.='Sign Up']"));
a2.click();

Thread.sleep(2000);


String a11=ar.get(0);
Thread.sleep(2000);
driver.switchTo().window(a11);
Thread.sleep(2000);
 genericphoto.getPhoto(driver);


driver.quit();











}

}

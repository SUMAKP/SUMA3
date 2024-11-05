package selenium_class;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_ExplicitlyWait {

    public static void main(String[] args) throws Exception {
        
        // Setting up WebDriver
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        Thread.sleep(1000);
      
        driver.findElement(By.xpath("//section[.='Web Elements']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//section[.='Synchronization']")).click();
        Thread.sleep(1000);

       
        driver.findElement(By.xpath("//section[.='Page Loading']")).click();
        Thread.sleep(2000);

      
        driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
        Thread.sleep(2000);

       
        Set<String> allWh = driver.getWindowHandles();
        ArrayList<String> ar = new ArrayList<>(allWh);
        String newTab = ar.get(1); 
        driver.switchTo().window(newTab);
        String Title = driver.getTitle();
        System.out.println(Title);
        
		
		 WebDriverWait wait = new WebDriverWait(driver, 10); 
		 wait.until(ExpectedConditions.titleContains(Title));
		 
        WebElement dfg = driver.findElement(By.xpath("//input[.='Enter your email']"));
        Point locn= dfg.getLocation();
       int x = locn.getX();
       int y = locn.getY();
       
       System.out.println(x);
       System.out.println(y);
        
      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        
      
       
        dfg.sendKeys("sumakp268@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
        
      
        driver.quit();
    }
}




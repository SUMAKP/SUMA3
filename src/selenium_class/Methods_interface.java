package selenium_class;
import org.openqa.selenium.chrome.*;

public class Methods_interface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);

		driver.get("https://www.facebook.com");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getPageSource());
	}

}

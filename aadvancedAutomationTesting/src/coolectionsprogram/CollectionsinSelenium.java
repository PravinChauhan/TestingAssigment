package coolectionsprogram;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsinSelenium {
	
	public static WebDriver driver;
	
	public static void setup(String application) {
	
	System.setProperty("webdriver.chrome.driver","D:\\WS\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(application);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	}
	
	public static void ElementListUsage(String xpath) {
		
	}

}

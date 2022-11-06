package SeleniumPractical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\WS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver); 
		action. sendKeys(Keys. ESCAPE);
		
		driver.findElement(By.name("q")).sendKeys("Shoes");
		Thread.sleep(500);
		

	}

}

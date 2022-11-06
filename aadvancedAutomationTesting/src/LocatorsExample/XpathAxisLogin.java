package LocatorsExample;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxisLogin {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D://WS//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// click on sign off in facebook by xpath axis
		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button")).click();
        
		
		//locate first  name field in sign up form 
		//button[@id='u_1_s_ug']/parent::*/parent::*/child::div/div[1]
		
		//identify passowrd from mobile number
		//input[@id='u_1_g_An']/following::input

	}

}

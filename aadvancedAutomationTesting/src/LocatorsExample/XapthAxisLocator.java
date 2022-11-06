package LocatorsExample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XapthAxisLocator {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://WS//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//self axis xpath  --a is self node  >>> select current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]//self::a")).getText();
        System.out.println(text);
        
        
        // Parent axis xpath -----td parent node >>> select class of parent node (always one)
        text=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]//parent::td")).getText();
        System.out.println(text);
       
        //child element >> select all children of current node (one or many)
        List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements : "+ childs.size());
        
        //Ancestor >> select all ancestors (parent, grandparent, etc)
        text=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr")).getText();
        System.out.println(text);
       
        //Descendant  >> select all descedant (children, grandchildren,etc) of current node
        List<WebElement> descendant=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/descendant::*"));
        System.out.println("Number of descendant Nodes : "+ descendant.size());
        
        
        //following -select everything from document after closing tag of current node
        List<WebElement> followingnode=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/following::tr"));
        System.out.println(followingnode.size());
        
        
        //following-sibling -select all node sibling after current node
        List<WebElement> followingsiblingnode=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/following-sibling::tr"));
        System.out.println(followingsiblingnode.size());
        
      //preceding -select all nodes preceding before after current node
        List<WebElement> precedingnode=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/preceding::tr"));
        System.out.println(precedingnode.size());
        driver.close();
        
        //preceding-sibling -select all preceding node sibling before current node
        List<WebElement> precedingsiblingnode=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println(precedingsiblingnode.size());
        
	}

}

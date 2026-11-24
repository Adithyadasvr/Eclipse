package xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	
	FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		//driver.navigate().refresh();
	}
	
	@Test
	public void test()
	
	
	{
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
		driver.findElement(null)
		//driver.findElement(By.xpath("//div[@id='nav-cart-count-container']",Keys.ENTER));
		
		
	}

}

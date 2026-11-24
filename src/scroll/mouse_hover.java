package scroll;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouse_hover {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod
	public void method()
	{
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void test()
	{
		driver.manage().implicitlyWait(Duration.ofSeconds(30));
		Actions act = new Actions();
		act.
	}
	

}

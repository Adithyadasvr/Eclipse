package scroll;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class notification {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.justdial.com/");
	}

}

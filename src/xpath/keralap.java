package xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class keralap {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		
		 driver=new ChromeDriver();
		 driver.get("https://keralaproperty.in/member/login/"); 
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='ulogin']")).sendKeys("randomgmail@gmail.com");
		driver.findElement(By.xpath("//input[@id='upass']")).sendKeys("randompassword");
		driver.findElement(By.xpath("//input[@id='sub_logbtn']")).click();
	}
	
}


package JUNIT;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class keralaprop {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/");
		driver.get("https://keralaproperty.in/member/login/");
		
	}
	
	@Test
	public void B()
	{
		driver.findElement(By.name("ulogin")).sendKeys("randomgmail@gmail.com");
		driver.findElement(By.name("upass")).sendKeys("randompassword");
		driver.findElement(By.id("sub_logbtn")).click();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

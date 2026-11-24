package JUNIT;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class camera {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://webcamtoy.com/");
	
		
	}
	
	@Test
	public void B()
	{
		driver.findElement(By.name("ulogin")).sendKeys("randomgmail@gmail.com",Keys.ENTER);
		driver.findElement(By.name("upass")).sendKeys("randompassword",Keys.ENTER);
		driver.findElement(By.id("sub_logbtn")).click();

	}

}

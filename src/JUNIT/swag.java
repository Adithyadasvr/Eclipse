package JUNIT;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class swag {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		driver.findElement(By.name("login-button")).click();

	}
	@Test
	public void test2()
	{
		driver.findElement(By.class("login_logo")).sendKeys("secret_sauce",Keys.ENTER);
	
		
	}

}

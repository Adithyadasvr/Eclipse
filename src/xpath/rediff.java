package xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input")).sendKeys("adithyadas");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("password123");
		


		
	}

	
	
	

}

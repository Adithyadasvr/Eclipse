
package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bali {
	ChromeDriver Driver;

	@BeforeTest
	public void a()
	{
		Driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void b()
	{
		Driver.get("https://rishiherbalindia.linker.store/");
		
	}
	
	@Test
	public void c() throws Exception
	{


		Driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[1]/div[2]/div/ul/li[1]/a")).click();
		Driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[1]/div[2]/div/ul/li[1]/ul/li[4]/a")).click();
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input")).sendKeys("suii@123");
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("suii@123");
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[3]/label/input")).click();
		
		Driver.findElement(By.xpath("/html/body/div[2]/div[4]")).click();
	   //Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/button")).click();
		

		

		

		
		

		
	}
	
	@AfterMethod
	public void d()
	{
		
	}
	
	
	@AfterTest
	public void e()
	{
		
	}
}

	




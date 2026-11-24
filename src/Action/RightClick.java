package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod()
	public void urloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}

	@Test
	public void test()
	{
	  
	   WebElement c= driver.findElement(By.xpath("/html/body/span"));
	   Actions a= new Actions(driver);
	   a.contextClick(c);
	   a.perform();
	   driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
	   driver.switchTo().alert().accept();
	  
	  
	      
	  WebElement k =driver.findElement(By.xpath("/html/body/button"));
	  Actions l= new Actions(driver);
	  l.doubleClick(k);
	  l.perform();
	  driver.switchTo().alert().accept();
	  
	 
	  
	}
	}
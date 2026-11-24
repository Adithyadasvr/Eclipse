package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drag {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod()
	public void urloading()
	{
		driver.get("https://webdriveruniversity.com/Actions/index.html");
	}

	
	@Test
	public void test()
	{
		WebElement f = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/p/b"));
		WebElement n = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]"));
		
		Actions c = new Actions(driver);
		c.dragAndDrop(f, n);
		
		c.perform();
	
		
		String v= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/p")).getText();
		System.out.println(v);
		if(v.equalsIgnoreCase("dropped!"))
		{
			System.out.println("verification success");
		}
		else
		{
		System.out.println("verification fail");
		}
		
	
	}
	}
package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scroll1 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() 
	{
		driver= new ChromeDriver();
		
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://keralaproperty.in/");
	}
	
	@Test
	public void test()
	{
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)", " ");
		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/footer/div/ul/li[3]/a")));
		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement t= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[1]/input")).sendKeys("abc");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		driver.findElement(By.xpath("/html/body/footer/div/ul/li[3]/a")).click();

		
		
		
	}

}

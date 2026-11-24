package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ninja {
	
	ChromeDriver Driver;

	@BeforeTest
	public void a()
	{
		Driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void b()
	{
		Driver.get("https://tutorialsninja.com/demo/");
		Driver.manage().window().maximize();
	}
	
	@Test
	public void c() throws Exception
	{
//		WebElement w=Driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
//		Actions act=new Actions(Driver);
//		act.moveToElement(w).perform();
//		Thread.sleep(10);
//		WebElement q=Driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a"));
//		q.click();
		
		Driver.findElement(By.id("input-firstname")).sendKeys("adithyadas");
		Driver.findElement(By.id("input-lastname")).sendKeys("vr");
		Driver.findElement(By.id("input-email")).sendKeys("adhi3425@gmail.com");
		Driver.findElement(By.id("input-telephone")).sendKeys("786757536");
		Driver.findElement(By.id("input-password")).sendKeys("adhi@777");
		Driver.findElement(By.id("input-confirm")).sendKeys("adhi@777");
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
		WebElement pop=Driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input"));
		File p=pop.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(p,new File("C:\\selenium\\Seleniumm\\email.png"));
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
		JavascriptExecutor js=(JavascriptExecutor)Driver;
		js.executeScript("window.scrollby(0,document.body.scrollHeight)");

		WebElement z=Driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[3]/a"));
		File q=z.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(q, new File("C:\\selenium\\Seleniumm\\site.png"));
		
		
		Driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
		Driver.findElement(By.id("input-name")).sendKeys("adhii");
		Driver.findElement(By.id("input-email")).sendKeys("adhii@1234.com");
		Driver.findElement(By.id("input-enquiry")).sendKeys(" i am adhiii");
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input")).click();

		
 
		 

		
		

		
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



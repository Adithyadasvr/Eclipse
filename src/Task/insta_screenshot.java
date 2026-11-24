package Task;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class insta_screenshot {

	
	ChromeDriver Driver;
	
	
	@Before
	public void A()
	{
		Driver=new ChromeDriver(); 
		Driver.get("https://www.instagram.com/");
	}
	 
	
	@Test
	public void B() throws IOException
	{
		WebElement w=Driver.findElement(By.name("email"));
		File q=w.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(q, new File("C:\\Software Testing\\selenium\\instaaaaaaaaaaa.png"));
	}
}
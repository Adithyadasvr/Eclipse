
package Screenshot;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class rediffscreen{
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
	  driver= new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void screenshot() throws IOException
	
	{
		
		
		WebElement dayelement =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		File src=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./screeeenshot  //huhu.png"));
		
		
		
		
		
	}
	
	

}

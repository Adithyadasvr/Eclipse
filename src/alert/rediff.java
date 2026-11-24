package alert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
	
	ChromeDriver driver;
	
	
	@Before
	public void A()
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	
	@Test
	
	public void B()
	{
	  String a=driver.findElement(By.id("Register")).getAttribute("value");

	  System.out.println(a);
	  	
	  
		
	}

}
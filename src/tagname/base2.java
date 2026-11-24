
package tagname;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class base2 {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		 driver =new ChromeDriver();
		 driver.get("https://keralaproperty.in/");
	}
	
	@Test
	public void test()
	{
		List<WebElement> li= driver.findElements(By.tagName("a"));
		
		System.out.println(li.size());

		for(WebElement a:li)
		{
			System.out.println(a.getAttribute("href"));
			System.out.println(a.getText());
			
			 
		}
	}
	
}

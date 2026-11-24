package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Keralapage;


public class keralatest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://keralaproperty.in/member/login/");
		
	}
	
	@Test
	public void c()
	{
		Keralapage ob=new Keralapage(driver);
		ob.setvalues("kiki", "hgg778");
		ob.login();
		
	
		
	}
}

package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		
	}
	
	@ BeforeMethod
	public void method()
	{
		driver.get("https://keralaproperty.in/");
	}

	@Test
	public void test()
	{
		
		SoftAssert  soft = new SoftAssert();
		String title = driver.getTitle();
		System.out.println(title);
		
		soft.assertEquals(title,"google","Title is not matching");
		
		soft.assertTrue(driver.findElement(By.xpath("/html/body/header/div[2]/div/a[1]")).isDisplayed(),"login button not displayed");
		System.out.println("test execution continues");
		soft.assertAll();
		
	}
}




package Filesupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediff {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();	
		
	}

	@BeforeMethod
	public void method()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@Test
	public void test()
	{
		
		
		boolean  v =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img")).isDisplayed();
		
		if(v)
		{
			System.out.println("displayeed");
		}
		else
		{
			System.out.println("not displayed");
		}	
		
	
	WebElement w = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[15]/div/input"));
	w.click();
	
	boolean s= w.isSelected();
	if(s)
	{
		System.out.println("is selected");
	}
	else
	{
		System.out.println("not selected");
	}
	
	
	
	
	WebElement e = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[15]/div/input"));
	e.click();

	Boolean m= e.isEnabled();
	
	
	if(m)
	{
		System.out.println("is enabled");
	}
	else
	{
		System.out.println("not enbaled");
	}
			
}
}


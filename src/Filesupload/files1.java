package Filesupload;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class files1 {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod()
	public void urloading()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}

	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).sendKeys("C:\\Resume\\Automation\\Adithiyadas_vr_Resume.pdf");
		driver.findElement(By.xpath("\"C:\\Resume\\Automation\\Adithiyadas_vr_Resume.pdf\"")).click();
	}
}

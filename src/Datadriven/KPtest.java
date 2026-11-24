package Datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Excelutils;

public class KPtest{
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@DataProvider(name="logindata")
	     public Object[][] getdata() throws Exception 
	     {
		String path = "C:\\Software Testing\\Manual Testing\\data.xlsx";
		return Excelutils.getTestData(path,"Sheet1");
	     }
	
	@Test(dataProvider="logindata")
	public void loginTest(String username,String password)
	{
		driver.findElement(By.id("ulogin")).sendKeys(username);
		driver.findElement(By.id("upass")).sendKeys(password);
		driver.findElement(By.id("sub_logbtn")).click();
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
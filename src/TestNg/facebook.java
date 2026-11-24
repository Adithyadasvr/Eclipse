package TestNg;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebook {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	
	}
	
	@BeforeMethod
	public void method()
	{
		driver.get(baseurl);
		
	}
	@Test(priority=3)
	public void test() throws Exception
	{
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss,new File("C:\\Software Testing\\selenium\\screenss.jpg"));
		System.out.println("screenshot taken");
		
	}
	@Test(priority=1)
	public void test1()
	{
        String expectedtitle="Facebook";
        
        String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
        
        if(actualtitle.equals(expectedtitle))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }    

		
	}
	@Test(priority=2)
	public void test2() throws Exception
	{
		URL ob= new URL(baseurl);
		
		HttpURLConnection con =(HttpURLConnection)ob.openConnection();
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url");
		}
		else
		{
			System.out.println("invalid url");
		}
	}
	
	@AfterMethod
	public void report()
	{
		System.out.println("report");
	}
	
	@AfterTest
	public void close()
	{
	
		System.out.println("closed");
	}
	}



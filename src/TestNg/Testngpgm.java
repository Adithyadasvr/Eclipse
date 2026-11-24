package TestNg;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpgm {
	
	@BeforeMethod
	public void setup() 
	{
		System.out.println("browser launch");
	}
	@BeforeTest()
	public void  method()
	{
		 System.out.println("url open");
	}
	@Test(priority=3)
	
	public void test()
	{
		
		System.out.println("test1");
	}
	@Test
	public void test1()
	{
		System.out.println("test2");
	}
	@Test
	public void test2()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("report");
	}
	@AfterTest
	public void close()
	{
		System.out.println("close");
	}
	}


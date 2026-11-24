package TestNg;

import org.testng.annotations.Test;

public class grouping {
	
	@Test(groups= {"sanity"})
	public void test()
	{
		System.out.println("this is test1");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void  test1() 
	{
		System.out.println("this is test2");
	}
	
	@Test(groups= {"regression"})
	public void test2()
	{
		System.out.println("this is test3");
	}
	
	@Test(groups= {"sanity","regression"})
	public void test3()
	{
		System.out.println("THIS IS TEST4");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void test4()
	{
		
		System.out.println("this is test5");
	}
	
	@Test
	public void test5()
	{
		System.out.println("this is test6");
	}
	
	
	

}

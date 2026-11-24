package ukg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void b() 
	{
	   WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
	   Select day1=new Select(day);
	   int ca=day1.getOptions().size();
	   day1.selectByValue("01");
	   System.out.println(ca);
	   
	   WebElement month=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
	   Select month1= new Select (month);
	   int cc=month1.getOptions().size();
	   month1.selectByValue("04");
	   System.out.println(cc);
	   
	   
	   WebElement year=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
	   Select year1= new Select(year);
	   int cn=year1.getOptions().size();
	   year1.selectByVisibleText("2008");
	   System.out.println(cn);

	   
	   
	   
	   
	   
}
}


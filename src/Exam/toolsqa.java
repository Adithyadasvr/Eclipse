package Exam;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class toolsqa {
	 WebDriver driver;
	 
	 @BeforeTest
	 public void setup()
	 {
		 driver = new ChromeDriver();
	 }
	 
	 @BeforeMethod
	 public void method()
	 {
	 
		 driver.get("https://toolsqa.com/");
	 }
	 
	 @Test
	 public void test() throws IOException , InterruptedException {
	     tools t = new tools(driver);
	     //t.link();
	     t.titles();
	    // t.newtab();
	     t.url();
	     //t.enro();
	    // t.backtowindow();
	     t.Screenshot();
	 }
	 @AfterMethod
	 public void method2()
	 {
		 driver.close();
	 }
}

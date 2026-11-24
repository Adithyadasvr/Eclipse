package Datadriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframes {
		
		@Test
		public void iframee() 
		{
		
		ChromeDriver Driver=new ChromeDriver();
		 Driver.manage().window().maximize();
		 Driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement frame1=Driver.findElement(By.id("iframeResult"));
		Driver.switchTo().frame(frame1);
		
		 
		WebElement innerframe=Driver.findElement(By.tagName("iframe"));
		Driver.switchTo().frame(innerframe);
		
		
		WebElement text=Driver.findElement(By.tagName("h1"));
		
		System.out.println(text.getText());
		

	
		//back to home page
		Driver.switchTo().defaultContent();
		}
		
		 
		 
}



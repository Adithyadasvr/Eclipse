package Filesupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class files2 {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod()
	public void urloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@Test
	public void test() throws AWTException 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[3]/a")).click();
		fileUpload("C:\\Resume\\Automation\\Adithiyadas_vr_Resume.pdf");

	}
	
	public void fileUpload(String p) throws AWTException
	{
		StringSelection str= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robo =new Robot();
		robo.delay(5000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/button")).click();
		
	}
	

}

















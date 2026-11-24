package Task;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class java {

    ChromeDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void test() {

        String a = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).getText();
        System.out.println(a);
        
        String b= driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).getText();
        System.out.println(b);
        

        driver.findElement(By.xpath("//*[@id=\"result\"]")).click();         
        Alert d= driver.switchTo().alert();
        d.sendKeys("adhii");
        d.accept();
        
        
    }
}
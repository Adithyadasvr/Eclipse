
package Exam;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import junit.framework.Assert;

public class tools {

    WebDriver driver;

    public tools(WebDriver driver) {
        this.driver = driver;
    }

   public void link() throws IOException {
   
        List<WebElement> links = driver.findElements(By.tagName("a"));
       System.out.println("no of links " + links.size());
  
       for (WebElement link : links) {
           String url = link.getAttribute("href");
   
           if (url == null || url.isEmpty()) {
               continue;
          }
   
           URL ob = new URL(url);
             HttpURLConnection con = (HttpURLConnection) ob.openConnection();
           con.connect();  
           if (con.getResponseCode() >= 400) {
               System.out.println("broken link");
             } else {
                System.out.println("valid link");
          }
    
           con.disconnect();
        }
    }



//    public void enro() throws InterruptedException {
//
//        driver.findElement(By.xpath(
//            "/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/a"
//        )).click();
//
//        driver.findElement(By.id("first-name")).sendKeys("Adithiyadas");
//        driver.findElement(By.id("last-name")).sendKeys("vr");
//        driver.findElement(By.id("email")).sendKeys("adithyadas@gmail.com");
//        driver.findElement(By.id("city")).sendKeys("Thrissur");
//    }

    public void titles() {

        String actual = driver.getTitle();
        String expected = "Tools QA";

        if (expected.equals(actual)) {
            System.out.println(" title valid");
        } else {
            System.out.println("title not valid ");
        }
    }

    public void url() {

        String url = driver.getCurrentUrl();
        String exp = "https://toolsqa.com/";

        System.out.println(url);
        Assert.assertEquals(url, exp);
    }

    public void Screenshot() throws IOException {

        File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File source = new File( "C:\\Software Testing\\Manual Testing\\testers.png");
        FileHandler.copy(Screenshot, source);		
    
}
}

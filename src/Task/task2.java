package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class task2 {

    ChromeDriver Driver;

    @BeforeTest
    public void a() {
        Driver = new ChromeDriver();
    }

    @Test
    public void c() throws Exception {

        // 1. Open the application
        Driver.get("https://tutorialsninja.com/demo/");
        Driver.manage().window().maximize();

        // 2. Click on "My Account" drop-down menu
        Driver.findElement(By.xpath("//span[text()='My Account']")).click();

        // Click on Register
        Driver.findElement(By.linkText("Register")).click();

        // 3. Enter new account details into mandatory fields

        Driver.findElement(By.id("input-firstname"))
              .sendKeys("adithyadas");

        Driver.findElement(By.id("input-lastname"))
              .sendKeys("v.r");

        // Using current time to avoid "email already registered"
        String email = "joymon" + System.currentTimeMillis() + "@gmail.com";

        Driver.findElement(By.id("input-email"))
              .sendKeys(email);

        Driver.findElement(By.id("input-telephone"))
              .sendKeys("8136995884");

        Driver.findElement(By.id("input-password"))
              .sendKeys("adhi@9090");

        Driver.findElement(By.id("input-confirm"))
              .sendKeys("adhi@9090");

        // Select Privacy Policy checkbox
        Driver.findElement(By.name("agree")).click();


        WebElement emailField = Driver.findElement(By.id("input-email"));

        File emailScreenshot =
                emailField.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(
                emailScreenshot,
                new File("C:\\selenium\\Seleniumm\\email.png")
        );

        // 5. Click Continue button
        Driver.findElement(By.xpath("//input[@value='Continue']")).click();

        Thread.sleep(2000);

        // 6. Click Continue button displayed in Account Success page
        Driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

        Thread.sleep(2000);

        // 7. Again click My Account drop-down and click Logout

        Driver.findElement(By.xpath("//span[text()='My Account']")).click();

        Driver.findElement(By.linkText("Logout")).click();

        Thread.sleep(2000);

        // 8. Scroll down to bottom of page
        //    and take screenshot of Site Map element

        JavascriptExecutor js = (JavascriptExecutor) Driver;

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)"
        );

        Thread.sleep(1000);

        WebElement siteMap =
                Driver.findElement(By.linkText("Site Map"));

        File siteMapScreenshot =
                siteMap.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(
                siteMapScreenshot,
                new File("C:\\selenium\\Seleniumm\\site.png")
        );

        // 9. Click on Contact Us link

        Driver.findElement(By.linkText("Contact Us")).click();

        Thread.sleep(2000);

        // 10. Enter details in Contact Form

        Driver.findElement(By.id("input-name"))
              .sendKeys("adhiiiii");

        Driver.findElement(By.id("input-email"))
              .sendKeys("adhi@1235.com");

        Driver.findElement(By.id("input-enquiry"))
              .sendKeys("Hi, my name is adhii");

        // Click Submit
        Driver.findElement(
                By.xpath("//input[@value='Submit']")
        ).click();

        Thread.sleep(2000);
    }

    @AfterTest
    public void e() {

        // Close browser
        Driver.quit();
    }
}
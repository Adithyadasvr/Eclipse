package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {

    protected WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.toolsqa.com/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
}
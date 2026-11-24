package ukg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.chrome.com");

       driver.close();
       // driver.quit();
    }
}
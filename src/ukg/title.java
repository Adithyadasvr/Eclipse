package ukg;

import org.openqa.selenium.chrome.ChromeDriver;

public class title {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.chrome.com");
        String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
        
        String expectedtitle="Google Chrome";
        
        if(actualtitle.equals(expectedtitle))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }
        

       
    }
}
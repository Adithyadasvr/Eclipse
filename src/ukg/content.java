package ukg;

import org.openqa.selenium.chrome.ChromeDriver;

public class content {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.chrome.com");
        String ac=driver.getPageSource();
        
        String e="Safety";
     
        
        if(ac.contains(e))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }
       
    }
    
}
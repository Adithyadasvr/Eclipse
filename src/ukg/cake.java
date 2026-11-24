	package ukg;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class cake{

	    public static void main(String[] args) {

	        ChromeDriver driver = new ChromeDriver();

	        driver.get("https://www.cakehut.in/x-mas-new-year-cakes");
	        String act=driver.getTitle();
	        String ac=driver.getPageSource();
	        System.out.println(act);
	        
	        String s="X-Mas/New Year Cakes";
	       String p="Price";
	        
	        if(act.equals(s)&&ac.contains(p))
	        {
	        	System.out.println("pass");	
	        }
	        else
	        {
	        	System.out.println("fail");
	        }
	        
	        		
	       
	        
	    }
	}
	         

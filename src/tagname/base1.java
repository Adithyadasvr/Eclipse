package tagname;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base1 {

	FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/gp/aw/d/B09B8XJDW5/ref=gwm_qc_btf_BTSpeaker2/?ie=UTF8&pd_rd_w=FnxHN&content-id=amzn1.sym.e54785b5-f484-4041-b937-0183212b2545&pf_rd_p=e54785b5-f484-4041-b937-0183212b2545&pf_rd_r=QSM8VDQF4443F4BGB57F&pd_rd_wg=1NANr&pd_rd_r=2ecb2f69-2c1d-4ba8-a021-7d3810f222e0&ref_=pd_hp_d_r_btf_unk&th=1");
	}
	
	@Test
	public void test()
	{
		
		List<WebElement> li=driver.findElements(By.tagName("div"));
		
		System.out.println(li.size());
		
	} 

}

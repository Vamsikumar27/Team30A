package Testcases;

import org.testng.annotations.Test;

import Pageobj.Freedemo;
import Pageobj.Loginpagein;

public class TC_002_FreeDemo extends Baseclasss {
	@Test
	public void FreedemoTest() throws InterruptedException {
		
		Loginpagein lp=new Loginpagein(driver);
	
		
		Freedemo fd=new Freedemo(driver);
		Thread.sleep(5000);
		fd.Clickfreedemobuton();
		fd.SetFullname();
		fd.SetEmail();
		fd.SetCmpname();
		fd.ClickCountry();
		fd.Setnumber();
		fd.Clickbox();
		fd.Clicksubmit();
		
	}
	
	
		
	

}

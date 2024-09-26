package Testcases;

import org.testng.annotations.Test;

import Pageobj.Loginpagein;

public class TC_01_Loginn extends Baseclasss {
	@Test
	public void LoginnTest() throws InterruptedException {
		Loginpagein lp=new Loginpagein(driver);
		
		Thread.sleep(4000);
		lp.SetUsername();
	
		lp.SetPassword();
		lp.ClickLoginbtn();
	
	}

}

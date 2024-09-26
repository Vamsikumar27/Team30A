package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

    public class Baseclasss {
    public static WebDriver driver;
    	
    	@BeforeClass
    	@Parameters({"Browser" ,"Url"})
    	public void OpenApplication(String br, String url) {
    		if(br.equals("chrome")) {
    			driver=new ChromeDriver();
    		}
    		else if(br.equals("edge")) {
    			driver=new EdgeDriver();
    		}
    		else if(br.equals("firefox")) {
    			driver=new FirefoxDriver();
    		}
    		driver.get(url);
    		driver.manage().window().maximize();
    	}
    	@AfterClass
    	public void CloseApplication() {
    		//driver.close();
    	}
    	
}


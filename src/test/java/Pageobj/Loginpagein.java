package Pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagein {
	public static WebDriver driver;
	public Loginpagein(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement txtusername;
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnlogin;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement lnkforgot;
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	WebElement lnkorangeinc;
	
	public void SetUsername() {
		txtusername.sendKeys("Admin");
	}

	public void SetPassword() {
		txtpassword.sendKeys("admin123");
	}
	public void ClickLoginbtn() {
		btnlogin.click();
	}

	public void Clickorangeinc() {
		lnkorangeinc.click();
	}
}

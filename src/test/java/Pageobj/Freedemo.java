package Pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Freedemo {
	   public static WebDriver driver;
	   public Freedemo(WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	   @FindBy(xpath="//nav[@class='navbar navbar-expand-lg navbar-light fixed-top']//div[@class='collapse navbar-collapse']//div[@class='d-flex web-menu-btn']//button[text()='Book a Free Demo']")
	   WebElement btnbookademo;
	   @FindBy(id="Form_getForm_FullName")
	   WebElement txtFname;
	   @FindBy(id="Form_getForm_Email")
	   WebElement txtEmail;
	   @FindBy(id="Form_getForm_CompanyName")
	   WebElement txtCmpname;
	   @FindBy(id="Form_getForm_Country")
	   WebElement Clkcountry;
	   @FindBy(id="Form_getForm_Contact")
	   WebElement txtnumber;
	   @FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	   WebElement Clickbox;
	   @FindBy(id="Form_getForm_action_submitForm")
	   WebElement btnsubmit;
	   public void Clickfreedemobuton() {
		   btnbookademo.click();
	   }
	   
	   public void SetFullname() {
		   txtFname.sendKeys("Arunkumar");
	   }
	   public void SetEmail() {
		   txtEmail.sendKeys("arunkumar12@gmail.com");
	   }
	   public void SetCmpname() {
		   txtCmpname.sendKeys("w3softtechnos");
	   }
	   public void ClickCountry() {
		   Clkcountry.click();
	   }
	   public void Setnumber() {
		   txtnumber.sendKeys("9696598569");
	   }
	   public void Clickbox() {
		   Clickbox.click();
	   }
	   public void Clicksubmit() {
		   btnsubmit.click();
	   }
	   

}

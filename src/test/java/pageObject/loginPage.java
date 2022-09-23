package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")  
	WebElement email;
	@FindBy(xpath="//input[@id='Password']") 
	WebElement password;
	@FindBy(xpath="//button[text()='Log in']") 
	WebElement loginBtn;
	@FindBy(linkText="Log out")
	WebElement logout;
	
	public void enterEmail(String mail) 
	{
	    email.sendKeys(mail);
	}
	
//	public void enterPass(String pwd)
//	{
//		password.sendKeys(pwd);
//	}
	
	
	
	
}

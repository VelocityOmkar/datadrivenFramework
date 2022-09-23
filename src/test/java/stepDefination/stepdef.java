package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.loginPage;

public class stepdef {
	
	public WebDriver driver;
	public  loginPage loginP;

	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() {
	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		loginP = new loginPage(driver);
      }

	@When("user opens Url {string}")
	public void user_opens_url(String url) {
	    
	   driver.get(url);
	}

	@When("User enters Email as {string} & Password as {string}")
	public void user_enters_email_as_password_as(String emailadd, String password) {
	
		loginP.enterEmail(emailadd);
		loginP.enterPass(password);
	}

	@When("click on login")
	public void click_on_login() {
	   
		loginP.loginBtn();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
	   String actualTitle = driver.getTitle();
	   if(actualTitle.equals(expectedTitle))
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertTrue(false);
	   }
	}

	@When("user click on Logout link")
	public void user_click_on_logout_link() {
	   
		loginP.clickonLogout();
	}

	@Then("close Browser")
	public void close_browser() {
		driver.close();
	}

}

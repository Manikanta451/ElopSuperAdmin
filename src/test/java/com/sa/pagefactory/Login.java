package com.sa.pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class Login extends CommonBase{
	
	public Login(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "EmailId")
	@CacheLookup
	public static WebElement Emailid;
	
	@FindBy(how = How.ID, using = "PassWord")
	@CacheLookup
	public static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[1]/div/input[3]")	
	@CacheLookup					
	public  static WebElement Loginbutton;
	
	public void accountlogin(DataInt dataInt) throws Exception {
		
			waitForSeconds(4);
			LOG.info("Getting Values of email and password");
			Emailid.sendKeys(dataInt.getEmail());
			waitForSeconds(2);
			Password.sendKeys(dataInt.getPassword());
			waitForSeconds(2);
			Loginbutton.click();
			LOG.info("Super Admin Successfully Log In in to their account");
			
		
	  }	
	
	
}

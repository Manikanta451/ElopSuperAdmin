package com.sa.pagefactory;


import org.openqa.selenium.WebDriver;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.LoginPageObjects;

public class Login extends LoginPageObjects{
	
	public Login(WebDriver driver) {
		super(driver);
	}

	public void accountlogin(DataInt dataInt) throws Exception {
		
			waitForSeconds(4);
			LOG.info("Getting Values of email and password");
			Emailid.sendKeys(dataInt.getEmail());
			waitForSeconds(2);
			//Password.sendKeys("123456");
			Password.sendKeys(dataInt.getPassword());
			waitForSeconds(2);
			Loginbutton.click();
			LOG.info("Super Admin Successfully Log In in to their account");
			
		
	  }	
	
	
}

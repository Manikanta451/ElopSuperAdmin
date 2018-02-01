package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.pagefactory.CommonBase;

public class LoginPageObjects extends CommonBase{
	
	protected LoginPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "EmailId")
	@CacheLookup
	public static WebElement Emailid;
	
	@FindBy(how = How.ID, using = "PassWord")
	@CacheLookup
	public static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[1]/div/input[37]")	
	@CacheLookup
	public  static WebElement Loginbutton;
}

package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class LoginPageObjects extends CommonBase{
	
	protected LoginPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "EmailId")
	public static WebElement Emailid;
	
	@FindBy(how = How.ID, using = "PassWord")
	public static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[1]/div/input[3]")	  
	public  static WebElement Loginbutton;
}

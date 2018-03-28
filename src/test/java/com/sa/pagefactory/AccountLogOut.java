package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AccountLogOut extends CommonBase{

	public AccountLogOut(WebDriver driver) {
		super(driver);
		
	}
	
	//--- My Profile---//
	
		@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/a/span")
		public static WebElement admin;
	
		@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/ul/li[3]/a")
		public static WebElement AdminLogout;
	
	    public void logout()throws Exception{
		
			waitForSeconds(3);
			mouseOver(admin, AdminLogout);
			waitForSeconds(1);
			AdminLogout.click();
			
			
	}

}

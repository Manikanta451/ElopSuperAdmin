package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.AdminProfilePageObjects;

public class AccountLogOut extends AdminProfilePageObjects{

	public AccountLogOut(WebDriver driver) {
		super(driver);
		
	}
	
	public void logout()throws Exception{
		
			waitForSeconds(3);
			mouseOver(admin, AdminLogout);
			waitForSeconds(1);
			AdminLogout.click();
			
	}

}

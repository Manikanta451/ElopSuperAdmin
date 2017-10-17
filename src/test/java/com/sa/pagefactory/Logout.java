package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.AdminProfilePageObjects;

public class Logout extends AdminProfilePageObjects{

	public Logout(WebDriver driver) {
		super(driver);
		
	}
	
	public void signout() throws Exception{
		
				waitForSeconds(5);
				mouseOver(Admin, AdminLogout);
				waitForSeconds(1);
				AdminLogout.click();
	}

}

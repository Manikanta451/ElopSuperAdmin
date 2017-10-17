package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.AdminProfilePageObjects;

public class ChangePassword extends AdminProfilePageObjects
{

	public ChangePassword(WebDriver driver) {
		super(driver);
		
	}
	
	public void passwrod(DataInt dataInt)throws Exception{
		
				waitForSeconds(4);
				mouseOver(admin, ChangePasswrod);
				waitForSeconds(1);
				ChangePasswrod.click();
				waitForSeconds(3);
				AdminPassword.sendKeys(dataInt.getAdminPassword());
				waitForSeconds(1);
				AdminNewPassword.sendKeys(dataInt.getAdminNewPassword());
				waitForSeconds(1);
				AdminConfirmPassword.sendKeys(dataInt.getAdminConfirmPassword());
				waitForSeconds(1);
				//ChangeAdminpassword.click();
				
	}
	

}

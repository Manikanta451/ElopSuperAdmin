package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.AdminProfilePageObjects;

public class AdminProfile extends AdminProfilePageObjects {

	public AdminProfile(WebDriver driver) {
		super(driver);
	}
	
	public void profile(DataInt dataInt)throws Exception{
		
				waitForSeconds(4);
				mouseOver(admin, Adminmyprofile);
				waitForSeconds(1);
				Adminmyprofile.click();
				waitForSeconds(3);
				Admineditprofile.click();
				waitForSeconds(4);
				AdminFirstName.clear();
				waitForSeconds(1);
				AdminFirstName.sendKeys(dataInt.getAdminFirstName());
				AdminLastName.clear();
				waitForSeconds(1);
				AdminLastName.sendKeys(dataInt.getAdminLastName());
				AdminPhoneNumber.clear();
				waitForSeconds(1);
				AdminPhoneNumber.sendKeys(dataInt.getAdminPhoneNumber());
				AdminAddress1.clear();
				waitForSeconds(1);
				AdminAddress1.sendKeys(dataInt.getAdminAddress1());
				AdminAddress2.clear();
				waitForSeconds(1);
				AdminAddress2.sendKeys(dataInt.getAdminAddress2());
				AdminCity.clear();
				waitForSeconds(1);
				AdminCity.sendKeys(dataInt.getAdminCity());
				AdminZipCode.clear();
				waitForSeconds(1);
				AdminZipCode.sendKeys(dataInt.getAdminZipCode());
				waitForSeconds(2);
				Adminprofileupdate.click();
				
				
	}
	
	

}

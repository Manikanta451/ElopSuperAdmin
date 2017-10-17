package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.SiteUsersPageObjects;

public class EditSiteUser extends SiteUsersPageObjects{

	public EditSiteUser(WebDriver driver) {
		super(driver);
	}

	
	public void siteuseredit(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					SiteUseredit.click();
					waitForSeconds(4);
					SiteUserFirstName.clear();
					waitForSeconds(1);
					SiteUserFirstName.sendKeys(dataInt.getSiteUserFirstName());
					SiteUserMiddleName.clear();
					waitForSeconds(1);
					SiteUserLastName.sendKeys(dataInt.getSiteUserLastName());
					waitForSeconds(1);
					SiteUserPhoneNumber.clear();
					waitForSeconds(1);
					SiteUserPhoneNumber.sendKeys(dataInt.getSiteUserPhoneNumber());
					waitForSeconds(1);
					SiteUserAddress1.clear();
					waitForSeconds(1);
					SiteUserAddress1.sendKeys(dataInt.getSiteUserAddress1());
					waitForSeconds(1);
					SiteuserAddress2.clear();
					waitForSeconds(1);
					SiteuserAddress2.sendKeys(dataInt.getSiteuserAddress2());
					waitForSeconds(1);
					SiteUserCity.clear();
					waitForSeconds(1);
					SiteUserCity.sendKeys(dataInt.getSiteCity());
					SiteUserZipCode.clear();
					waitForSeconds(1);
					SiteUserZipCode.sendKeys(dataInt.getSiteUserZipCode());
					waitForSeconds(2);
					SiteUserUpdate.click();
					
		
	}
	
}

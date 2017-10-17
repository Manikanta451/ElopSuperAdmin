package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.SiteUsersPageObjects;

public class CreateSiteUser extends SiteUsersPageObjects {

	public CreateSiteUser(WebDriver driver) {
		super(driver);
		
	}
	
	public void siteusercreate(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				SiteUsers.click();
				waitForSeconds(3);
				SiteUsersCreate.click();
				waitForSeconds(3);
				Select sitename = new Select(siteName);
				sitename.selectByVisibleText(dataInt.getSchoolName());
				waitForSeconds(1);
				SiteUserFirstName.sendKeys(dataInt.getSiteUserFirstName());
				SiteUserMiddleName.sendKeys(dataInt.getSiteUserMiddleName());
				SiteUserLastName.sendKeys(dataInt.getSiteUserLastName());
				SiteUserEmailId.sendKeys(gettingEmailrandomly());
				SiteuserPassWord.sendKeys(dataInt.getSiteuserPassWord());
				SiteUserConfirmPassword.sendKeys(dataInt.getSiteuserPassWord());
				SiteUserPhoneNumber.sendKeys(dataInt.getSiteUserPhoneNumber());
				SiteUserAddress1.sendKeys(dataInt.getSiteUserAddress1());
				SiteuserAddress2.sendKeys(dataInt.getSiteuserAddress2());
				SiteUserCity.sendKeys(dataInt.getSiteUserCity());
				SiteUserZipCode.sendKeys(dataInt.getSiteUserZipCode());
				waitForSeconds(2);
				//SiteUserSubmit.click();
	}
	
	
	
	

}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.ContentManagementPageObjects;

public class CreatePage extends ContentManagementPageObjects {

	public CreatePage(WebDriver driver) {
		super(driver);
		
	}

	public void pages(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					contentmanagementclick.click();
					waitForSeconds(4);
					pageclick.click();
					waitForSeconds(4);
					pagecreate.click();
					pagefriendlyUrl.sendKeys(dataInt.getPagefriendlyUrl());
					pageTitle.sendKeys(dataInt.getPageTitle());
					MenuName.sendKeys(dataInt.getMenuName());
					BannerImageupload.click();
					waitForSeconds(1);
					fileupload(imagepath + "\\images\\greaterscsbanner.jpg");
					BannerimageAltTag.sendKeys(dataInt.getBannerimageAltTag());
					senddescription(dataInt);
					PageMetaTitle.sendKeys(dataInt.getPageMetaTitle());
					PageMetaKeywords.sendKeys(dataInt.getPageMetaKeywords());
					PageMetaDescription.sendKeys(dataInt.getPageMetaDescription());
					Standalonepage.click();
					PageOrder.sendKeys(dataInt.getPageOrder());
					bannerIsActive.click();
					waitForSeconds(3);
					//pagesubmit.click();
		
		
			}
	public void senddescription(DataInt dataInt)throws Exception{
					Actions actions = new Actions(driver);
					actions.moveToElement(Bannerimagedesc);
					actions.click();
					waitForSeconds(2);
					actions.sendKeys(dataInt.getHeaderImagedesc());
					actions.build().perform();
	}
}

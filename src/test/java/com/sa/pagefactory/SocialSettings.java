package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.ContentManagementPageObjects;

public class SocialSettings extends ContentManagementPageObjects{

	public SocialSettings(WebDriver driver) {
		super(driver);
		
	}
	
	public void settings(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				contentmanagementclick.click();
				waitForSeconds(4);
				socialsettingsclick.click();
				waitForSeconds(4);
				socialsettingsedit.click();
				waitForSeconds(4);
				Facebook.clear();
				waitForSeconds(1);
				Facebook.sendKeys(dataInt.getFacebook());
				twitter.clear();
				waitForSeconds(1);
				twitter.sendKeys(dataInt.getTwitter());
				Instagram.clear();
				waitForSeconds(1);
				Instagram.sendKeys(dataInt.getInstagram());
				Pinterest.clear();
				waitForSeconds(1);
				Pinterest.sendKeys(dataInt.getPinterest());
				Youtube.clear();
				waitForSeconds(1);
				Youtube.sendKeys(dataInt.getYoutube());
				GooglePLUS.clear();
				waitForSeconds(1);
				GooglePLUS.sendKeys(dataInt.getGooglePLUS());
				SocialMetaTitle.clear();
				waitForSeconds(1);
				SocialMetaTitle.sendKeys(dataInt.getSocialMetaTitle());
				SocialMetaKeyword.clear();
				waitForSeconds(1);
				SocialMetaKeyword.sendKeys(dataInt.getSocialMetaKeyword());
				SocialMetaDesc.clear();
				waitForSeconds(1);
				SocialMetaDesc.sendKeys(dataInt.getSocialMetaDesc());
				waitForSeconds(3);
				socialsettingsupdate.click();
				
	}

}

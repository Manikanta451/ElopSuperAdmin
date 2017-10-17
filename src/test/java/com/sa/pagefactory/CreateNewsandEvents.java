package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.ContentManagementPageObjects;

public class CreateNewsandEvents extends ContentManagementPageObjects{

	public CreateNewsandEvents(WebDriver driver) {
		super(driver);
		
	}

	public void newsevents(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				contentmanagementclick.click();
				waitForSeconds(4);
				newsandeventsclick.click();
				waitForSeconds(4);
				newsandeventscreate.click();
				waitForSeconds(4);
				NewsTitle.sendKeys(dataInt.getNewsTitle());
				NewsShortDescription.sendKeys(dataInt.getNewsShortDescription());
				senddescription(dataInt);
				newsimageupload.click();
				waitForSeconds(1);
				fileupload(imagepath + "\\images\\News.jpg");
				NewsImageAltTag.sendKeys(dataInt.getNewsImageAltTag());
				Postdate.click();
				waitForSeconds(1);
				systemdateselect();
				newsActive.click();
				NewsMetaTitle.sendKeys(dataInt.getNewsMetaTitle());
				NewsMetakeywords.sendKeys(dataInt.getNewsMetakeywords());
				NewsMetadescription.sendKeys(dataInt.getNewsMetadescription());
				waitForSeconds(3);
				//newsSubmit.click();
				
				
		}
				
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(Newsdescription);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getHeaderImagedesc());
				actions.build().perform();
	}
	
	
}

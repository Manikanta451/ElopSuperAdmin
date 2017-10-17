package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.ContentManagementPageObjects;

public class CreateHeaderImage extends ContentManagementPageObjects {

	public CreateHeaderImage(WebDriver driver) {
		super(driver);
		
	}
	
	public void headerimages(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					contentmanagementclick.click();
					waitForSeconds(4);
					headerimageclick.click();
					waitForSeconds(4);
					HeaderImageTitle.sendKeys(dataInt.getHeaderImageTitle());
					waitForSeconds(1);
					senddescription(dataInt);
					waitForSeconds(3);
					HeaderImageupload.click();
					waitForSeconds(1);
					fileupload(imagepath + "\\images\\headerelop.jpg");
					HeaderImageAltTag.sendKeys(dataInt.getHeaderImageAltTag());
					HeaderImageButtonText.sendKeys(dataInt.getHeaderImageButtonText());
					HeaderImageUrl.sendKeys(dataInt.getHeaderImageUrl());
					HeaderImageOrdering.sendKeys(dataInt.getHeaderImageOrdering());
					HeaderImageOpennewwindow.click();
					HeaderImageActive.click();
					waitForSeconds(3);
					//HeaderImagesubmit.click();
			}

	public void senddescription(DataInt dataInt)throws Exception{
					Actions actions = new Actions(driver);
					actions.moveToElement(HeaderImagedesc);
					actions.click();
					waitForSeconds(2);
					actions.sendKeys(dataInt.getHeaderImagedesc());
					actions.build().perform();
				}
		
	
}

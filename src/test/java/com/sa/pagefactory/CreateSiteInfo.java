package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.SiteInfoPageObjects;


public class CreateSiteInfo extends SiteInfoPageObjects{

	public CreateSiteInfo(WebDriver driver) {
		super(driver);
		
	}
	
	public void siteinfo(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				clicksiteinfo.click();
				waitForSeconds(4);
				createksiteinfo.click();
				waitForSeconds(4);
				Select sitename = new Select(siteinfositename);
				sitename.selectByVisibleText(dataInt.getSiteinfositename());
				waitForSeconds(1);
				Select program = new Select(siteinfoSiteTypeId);
				program.selectByVisibleText(dataInt.getSiteinfoSiteTypeId());
				waitForSeconds(1);
				StartDate.click();
				waitForSeconds(1);
				systemdateselect();
				waitForSeconds(1);
				EndDate.click();
				waitForSeconds(1);
				futuredateselection();
				waitForSeconds(1);
				Select checkintime = new Select(WeekStartTime);
				checkintime.selectByVisibleText(dataInt.getWeekStartTime());
				waitForSeconds(1);
				Select checkouttime = new Select(WeekEndTime);
				checkouttime.selectByVisibleText(dataInt.getWeekEndTime());
				waitForSeconds(1);
				Select ampm = new Select(WeekEndAMPM);
				ampm.selectByVisibleText(dataInt.getWeekEndAMPM());
				waitForSeconds(1);
				Maxcapacity.sendKeys(dataInt.getMaxcapacity());
				MealsOrdered.clear();
				waitForSeconds(1);
				MealsOrdered.sendKeys(dataInt.getMealsOrdered());
				SiteInfoWeeklyRate.sendKeys(dataInt.getSiteInfoWeeklyRate());
				SiteinfoLateFee.sendKeys(dataInt.getSiteinfoLateFee());
				SiteinfoRegistraionFee.sendKeys(dataInt.getSiteinfoRegistraionFee());
				SiteInfoLatefeeforeveryminute.sendKeys(dataInt.getSiteInfoLatefeeforeveryminute());
				waitForSeconds(2);
				Active.click();
				//submitsireInfo.click();
				
				
	}
	
	
	

}

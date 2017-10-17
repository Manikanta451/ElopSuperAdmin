package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.SitePageObjects;

public class EditSite extends SitePageObjects{

	public EditSite(WebDriver driver) {
		super(driver);
	}

	public void editsites(DataInt dataInt)throws Exception{
				
				waitForSeconds(5);
				ElopSites.click();
				waitForSeconds(4);
				editSite.click();
				waitForSeconds(4);
				SiteName.clear();
				waitForSeconds(1);
				SiteName.sendKeys(dataInt.getSiteName());
		        waitForSeconds(1);
		        SiteSupervisor.clear();
		        waitForSeconds(1);
		        SiteSupervisor.sendKeys(dataInt.getSiteSupervisor());
		        waitForSeconds(1);
		        SiteLocationCode.clear();
		        waitForSeconds(1);
		        SiteLocationCode.sendKeys(dataInt.getSiteLocationCode());
		        waitForSeconds(1);
		        SitePhoneNumber.clear();
		        waitForSeconds(1);
		        SitePhoneNumber.sendKeys(dataInt.getSitePhoneNumber());
		        waitForSeconds(1);
		        SiteAddress.clear();
		        waitForSeconds(1);
		        SiteAddress.sendKeys(dataInt.getSiteAddress());
		        waitForSeconds(1);
		        SiteCity.clear();
		        waitForSeconds(1);
		        SiteCity.sendKeys(dataInt.getSiteCity());
		        waitForSeconds(1);
		        SiteZipcode.clear();
		        waitForSeconds(1);
		        SiteZipcode.sendKeys(dataInt.getSiteZipcode());
		        waitForSeconds(1);
		        SiteFaxNumber.clear();
		        waitForSeconds(1);
		        SiteFaxNumber.sendKeys(dataInt.getSiteFaxNumber());
		        waitForSeconds(2);
		        UpdateSite.click();

		
		
	}
}

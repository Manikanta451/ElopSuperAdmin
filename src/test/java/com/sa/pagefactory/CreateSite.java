package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.SitePageObjects;

public class CreateSite extends SitePageObjects{

	public CreateSite(WebDriver driver) {
		super(driver);
	}

	public void createsitenames(DataInt dataInt) throws Exception{
		
		        waitForSeconds(5);
		        ElopSites.click();
		        waitForSeconds(3);
		        CreateSite.click();
		        waitForSeconds(4);
		        SiteName.sendKeys(dataInt.getSiteName());
		        waitForSeconds(1);
		        beforeonly.click();
		        afteronly.click();
		        beforeandafteronly.click();
		        waitForSeconds(2);
		        Select sitetype = new Select(SiteType);
		        sitetype.selectByVisibleText(dataInt.getSiteType());
				waitForSeconds(1);
		        SiteSupervisor.sendKeys(dataInt.getSiteSupervisor());
		        SiteLocationCode.sendKeys(dataInt.getSiteLocationCode());
		        SitePhoneNumber.sendKeys(dataInt.getSitePhoneNumber());
		        SiteAddress.sendKeys(dataInt.getSiteAddress());
		        waitForSeconds(1);
		        SiteCity.sendKeys(dataInt.getSiteCity());
		        SiteZipcode.sendKeys(dataInt.getSiteZipcode());
		        SiteFaxNumber.sendKeys(dataInt.getSiteFaxNumber());
		        waitForSeconds(2);
		       // Sitesubmit.click();
		        

		        
		        
		        
	}
	
	
}

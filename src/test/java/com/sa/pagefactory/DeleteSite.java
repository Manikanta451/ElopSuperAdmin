package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.SitePageObjects;

public class DeleteSite  extends SitePageObjects{

	public DeleteSite(WebDriver driver) {
		super(driver);
		
	}

	public void sitedelete()throws Exception{
		
			waitForSeconds(6);
			DeleteSite.click();
			waitForSeconds(1);
			checkAlert();
	}
	
	
}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.pageobjects.ChangeProgramorSitePageObjects;

public class ChangeProgramorSite extends ChangeProgramorSitePageObjects{

	public ChangeProgramorSite(WebDriver driver) {
		super(driver);
		
	}
	
	public void progrmorsite() throws Exception{
		
				waitForSeconds(5);
				Changeprogramsite.click();
				waitForSeconds(5);
				Select program = new Select(Program);
				program.selectByVisibleText("Before ONLY");
				waitForSeconds(1);
				Select status = new Select(Status);
				status.selectByVisibleText("Admitted");
				waitForSeconds(1);
				Select sitename = new Select(SiteName);
				sitename.selectByVisibleText("Alcy Elementary ");
				waitForSeconds(5);
				program.selectByVisibleText("ALL");
				waitForSeconds(1);
				status.selectByVisibleText("ALL");
				waitForSeconds(1);
				sitename.selectByVisibleText("ALL");
				waitForSeconds(5);
				Changeprogramsitestudentedit.click();
				waitForSeconds(5);
				Updaterogramsite.click();
				waitForSeconds(4);
				ExportChangeprogramsite.click();
				
				
	}

}

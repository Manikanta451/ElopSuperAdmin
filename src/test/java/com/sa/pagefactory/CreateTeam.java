package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.ContentManagementPageObjects;

public class CreateTeam extends ContentManagementPageObjects{

	public CreateTeam(WebDriver driver) {
		super(driver);
		
	}

	public void team(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				contentmanagementclick.click();
				waitForSeconds(4);
				aboutustreamclick.click();
				waitForSeconds(4);
				aboutustreamcreate.click();
				waitForSeconds(4);
				TeamName.sendKeys(dataInt.getTeamName());
				Desgination.sendKeys(dataInt.getDesgination());
				senddescription(dataInt);
				TeamAltTag.sendKeys(dataInt.getTeamAltTag());
				TeamDisplayOrder.sendKeys(dataInt.getTeamDisplayOrder());
				waitForSeconds(2);
				//teamSubmit.click();
		
		}
		
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(Teamdescription);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getHeaderImagedesc());
				actions.build().perform();
	}
	
	
}

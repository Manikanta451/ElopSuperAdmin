package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.WeekOffPageObjects;

public class CreateWeekOff extends WeekOffPageObjects{

	public CreateWeekOff(WebDriver driver) {
		super(driver);
		
	}
		
	public void weekoff(DataInt dataInt )throws Exception{
				
				waitForSeconds(5);
				weekoffclick.click();
				waitForSeconds(4);
				weekoffcreate.click();
				waitForSeconds(5);
				Date.click();
				waitForSeconds(1);
				futuredateselection();
				waitForSeconds(1);
				Title.sendKeys(dataInt.getTitle());
				senddescription(dataInt);
				waitForSeconds(2);
				active.click();
				//submitweekoff.click();

			}
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(description);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getDescription());
				actions.build().perform();
			}
}

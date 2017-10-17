package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.MedicalConditionPageObjects;

public class CreateMedicalCondition extends MedicalConditionPageObjects {

	public CreateMedicalCondition(WebDriver driver) {
		super(driver);
	}
	
	public void medicalcondition()throws Exception{
		
				waitForSeconds(5);
				medical.click();
				waitForSeconds(4);
				createmedical.click();
				waitForSeconds(4);
				ConditionName.sendKeys("Sample Medical");
				waitForSeconds(1);
				medicalactive.click();
				waitForSeconds(1);
				medicaladd.click();
		
	}

}

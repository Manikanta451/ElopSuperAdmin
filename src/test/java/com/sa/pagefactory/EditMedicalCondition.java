package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sa.pageobjects.MedicalConditionPageObjects;

public class EditMedicalCondition extends MedicalConditionPageObjects{

	public EditMedicalCondition(WebDriver driver) {
		super(driver);
	}

	
	public void editmedical()throws Exception{
		
				waitForSeconds(5);
				medicaledit.click();
				waitForSeconds(4);
				ConditionName.clear();
				waitForSeconds(1);
				ConditionName.sendKeys("No known health problems");
				waitForSeconds(1);
				isactive(medicalactive);
				waitForSeconds(1);
				medicalupdate.click();
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
	
}

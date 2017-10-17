package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.ElopUsersPageObjects;

public class EditElopUser  extends ElopUsersPageObjects{

	public EditElopUser(WebDriver driver) {
		super(driver);
	}

	public void  editelopuser(DataInt dataInt) throws Exception{
		
				waitForSeconds(5);
				Elopusers.click();
				waitForSeconds(5);
				ElopUserEdit.click();
				waitForSeconds(3);
				ElopUserFirstName.clear();
				waitForSeconds(1);
				ElopUserFirstName.sendKeys(dataInt.getElopUserFirstName());
				waitForSeconds(1);
				ElopUserLastName.clear();
				waitForSeconds(1);
				ElopUserLastName.sendKeys(dataInt.getAdminLastName());
				ElopUserPhoneNumber.clear();
				waitForSeconds(1);
				ElopUserPhoneNumber.sendKeys(dataInt.getElopUserPhoneNumber());
				waitForSeconds(1);
				ElopUserAddress1.clear();
				waitForSeconds(1);
				ElopUserAddress1.sendKeys(dataInt.getElopUserAddress1());
				waitForSeconds(1);
				ElopUserAddress2.clear();
				waitForSeconds(1);
				ElopUserAddress2.sendKeys(dataInt.getElopUserAddress2());
				waitForSeconds(1);
				ElopUserCity.clear();
				waitForSeconds(1);
				ElopUserCity.sendKeys(dataInt.getElopUserCity());
				waitForSeconds(1);
				ElopUserZipCode.clear();
				waitForSeconds(1);
				ElopUserZipCode.sendKeys(dataInt.getElopUserZipCode());
				waitForSeconds(3);
				ElopUserUpdate.click();
				

				

				
	}
	
	
}

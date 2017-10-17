package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.ElopUsersPageObjects;

public class CreateElopUser extends ElopUsersPageObjects {

	public CreateElopUser(WebDriver driver) {
		super(driver);
		
	}

	public void Createadmin (DataInt dataInt) throws Exception{
		
			waitForSeconds(4);
			Elopusers.click();
			waitForSeconds(3);
			CreateNewElopUser.click();
			waitForSeconds(3);
			ElopUserFirstName.sendKeys(dataInt.getElopUserFirstName());
			ElopUserMiddleName.sendKeys(dataInt.getElopUserMiddleName());
			ElopUserLastName.sendKeys(dataInt.getElopUserLastName());
			ElopUserEmailId.sendKeys(dataInt.getElopUserEmailId());
			ElopUserPassWord.sendKeys(dataInt.getElopUserPassWord());
			ElopUserConfirmPassword.sendKeys(dataInt.getElopUserPassWord());
			ElopUserPhoneNumber.sendKeys(dataInt.getElopUserPhoneNumber());
			ElopUserAddress1.sendKeys(dataInt.getElopUserAddress1());
			ElopUserAddress2.sendKeys(dataInt.getElopUserAddress2());
			ElopUserCity.sendKeys(dataInt.getElopUserCity());
			ElopUserZipCode.sendKeys(dataInt.getElopUserZipCode());
			waitForSeconds(2);
			ElopUserIsActive.click();
			waitForSeconds(2);
			//ElopUserSubmit.click();
	}	
}

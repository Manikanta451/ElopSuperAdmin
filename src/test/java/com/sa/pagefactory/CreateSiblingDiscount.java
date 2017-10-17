package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.SiblingDiscountPageObjects;

public class CreateSiblingDiscount extends SiblingDiscountPageObjects {

	public CreateSiblingDiscount(WebDriver driver) {
		super(driver);
	}
	
	public void Siblingdiscount(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				Siblingdiscount.click();
				waitForSeconds(3);
				Siblingdiscountcreate.click();
				waitForSeconds(3);
				Select parents = new Select(ParentId);
				parents.selectByVisibleText(dataInt.getParents());
				waitForSeconds(2);
				Select students = new Select(StudentFormId);
				students.selectByVisibleText(dataInt.getStudent());
				waitForSeconds(1);
				Siblingdiscount.sendKeys(dataInt.getSiblingDiscount());
				waitForSeconds(1);
				//Siblingdiscountadd.click();
				
					
	}

}

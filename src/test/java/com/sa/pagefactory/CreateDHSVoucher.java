package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.DHSVoucherPageObjects;

public class CreateDHSVoucher extends DHSVoucherPageObjects {

	public CreateDHSVoucher(WebDriver driver) {
		super(driver);
		
	}

	public void createdhsvoucher(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				DHSVoucher.click();
				waitForSeconds(4);
				CreateDHSVoucher.click();
				waitForSeconds(3);
				Select stateID = new Select(StateID);
				stateID.selectByVisibleText(dataInt.getStateID());
				System.out.println(dataInt.getStateID());
				waitForSeconds(1);
				VocherNumber.sendKeys(dataInt.getVouchername());
				Amountperweek.sendKeys(dataInt.getAmountperweek());
				waitForSeconds(1);
				StartDate.click();
				systemdateselect();
				waitForSeconds(1);
				EndDate.click();
				futuredateselection();
				waitForSeconds(2);
				ISactive.click();
				waitForSeconds(1);
				//dhssubmit.click();
				
		
		
	}
	
	
}

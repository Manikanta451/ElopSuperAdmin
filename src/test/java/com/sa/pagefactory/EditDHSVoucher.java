package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.DHSVoucherPageObjects;

public class EditDHSVoucher extends DHSVoucherPageObjects {

	public EditDHSVoucher(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void DHSVoucheredit(DataInt dataInt)throws Exception{
		
					waitForSeconds(4);
					dhsEdit.click();
					waitForSeconds(4);
					Amountperweek.clear();
					waitForSeconds(1);
					Amountperweek.sendKeys(dataInt.getAmountperweek());
					waitForSeconds(2);
					dhsupdate.click();
		
	}

}

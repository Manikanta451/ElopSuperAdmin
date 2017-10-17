package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.DHSVoucherPageObjects;

public class DeleteDHSVoucher extends DHSVoucherPageObjects {

	public DeleteDHSVoucher(WebDriver driver) {
		super(driver);
		
	}

	public void deletevoucher()throws Exception{
		
				waitForSeconds(4);
				dhsdelete.click();
				waitForSeconds(2);
				checkAlert();
				
		
	}
	
	
}

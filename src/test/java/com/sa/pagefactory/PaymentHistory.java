package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.sa.pageobjects.PaymentHistoryPageObjects;

public class PaymentHistory extends PaymentHistoryPageObjects
{

	public PaymentHistory(WebDriver driver) {
		super(driver);
		
	}
	
	public void checkpaymenthistory() throws Exception{
		
				waitForSeconds(3);
				paymenthistory.click();
				waitForSeconds(7);
				Select paymenttype = new Select(PaymentType);
				paymenttype.selectByVisibleText("Cash Paid");
				waitForSeconds(5);
				paymenttype.selectByVisibleText("Credit Card");
				waitForSeconds(5);
				paymenttype.selectByVisibleText("All");
		
	}
	
	public void exporttoexcelpaymentrecords() throws Exception{
		
				waitForSeconds(6);
				if (export.isEnabled()) {
					export.click();
				}
	
	}

}

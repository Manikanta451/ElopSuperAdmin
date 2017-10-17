package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

public class PaymentorCreditReport extends LateCheckoutReport{

	public PaymentorCreditReport(WebDriver driver) {
		super(driver);
		
	}
	
	public void credit()throws Exception{
		
				waitForSeconds(5);
				paymentorcreditnreport.click();
				waitForSeconds(5);
				exporttoexcel();
	}

}

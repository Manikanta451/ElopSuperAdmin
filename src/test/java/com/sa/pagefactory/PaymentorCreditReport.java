package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentorCreditReport extends LateCheckoutReport{

	public PaymentorCreditReport(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[9]/a")
	public static WebElement paymentorcreditnreport;
	
	public void credit()throws Exception{
		
				waitForSeconds(5);
				paymentorcreditnreport.click();
				waitForSeconds(5);
				exporttoexcel();
	}

}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

import com.sa.pageobjects.ReportsPageObjects;

public class LateCheckoutReport extends ReportsPageObjects{

	public LateCheckoutReport(WebDriver driver) {
		super(driver);
		
	}
	
	public void latecheckout()throws Exception{
		
					waitForSeconds(5);
					clickreports.click();
					waitForSeconds(4);
					latechecoutreports.click();	
				}
	
	
	public void exporttoexcel() throws Exception{
		
					waitForSeconds(6);
					if (reportsexport.isEnabled()) {
						reportsexport.click();
					}
				}

	
	
	

}

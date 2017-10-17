package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

public class RevenueReport extends LateCheckoutReport{

	public RevenueReport(WebDriver driver) {
		super(driver);
		
	}
	
	public void revenue()throws Exception{
		
				waitForSeconds(5);
				revenuereports.click();
				waitForSeconds(5);
				exporttoexcel();
				
	}

}

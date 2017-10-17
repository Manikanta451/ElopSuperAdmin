package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

public class CACFPCountReport extends LateCheckoutReport {

	public CACFPCountReport(WebDriver driver) {
		super(driver);
		
	}

	public void cacfp()throws Exception{
		
				waitForSeconds(5);
				cacfpcountreport.click();
				waitForSeconds(5);
				exporttoexcel();
	}
	
}

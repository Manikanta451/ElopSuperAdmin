package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

public class DisallowedMealReport extends LateCheckoutReport{

	public DisallowedMealReport(WebDriver driver) {
		super(driver);
		
	}

	public void disallowedmeal()throws Exception{
		
				waitForSeconds(5);
				disallowedmealreports.click();
				waitForSeconds(5);
				exporttoexcel();
		
		
	}
	
}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;


public class ExcessMealReport extends LateCheckoutReport{

	public ExcessMealReport(WebDriver driver) {
		super(driver);
		
	}

	public void reportexcessmeal()throws Exception{
		
				waitForSeconds(5);
				excessmealreports.click();
				waitForSeconds(5);
				exporttoexcel();
	}
	
	
	
}


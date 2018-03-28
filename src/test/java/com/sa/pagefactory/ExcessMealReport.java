package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ExcessMealReport extends LateCheckoutReport{

	public ExcessMealReport(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[2]/a/span")
	public static WebElement excessmealreports;
	
	public void reportexcessmeal()throws Exception{
		
				waitForSeconds(5);
				excessmealreports.click();
				waitForSeconds(5);
				exporttoexcel();
	}
	
	
	
}


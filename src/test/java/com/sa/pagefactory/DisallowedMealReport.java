package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DisallowedMealReport extends CommonBase{

	public DisallowedMealReport(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[3]/a/span")
	public static WebElement disallowedmealreports;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div[1]/a/div/embed")
	public static WebElement reportsexport;

	public void disallowedmeal()throws Exception{
		
				waitForSeconds(5);
				disallowedmealreports.click();
				waitForSeconds(5);
				exporttoexcel();
		
		
	}
	
public void exporttoexcel() throws Exception{
		
		waitForSeconds(6);
		if (reportsexport.isEnabled()) {
			reportsexport.click();
		}
	}
	
}

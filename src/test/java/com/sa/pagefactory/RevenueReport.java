package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RevenueReport extends LateCheckoutReport{

	public RevenueReport(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[5]/a/span")
	public static WebElement revenuereports;
	
	public void revenue()throws Exception{
		
				waitForSeconds(5);
				revenuereports.click();
				waitForSeconds(5);
				exporttoexcel();
				
	}

}

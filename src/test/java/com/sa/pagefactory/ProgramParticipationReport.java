package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProgramParticipationReport extends LateCheckoutReport {

	public ProgramParticipationReport(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[8]/a/span")
	public static WebElement programparticipationreport;

	public void participation()throws Exception{
					
				waitForSeconds(5);
				programparticipationreport.click();
				waitForSeconds(5);
				exporttoexcel();
	}
	
	
}

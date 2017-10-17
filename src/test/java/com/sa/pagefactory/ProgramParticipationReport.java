package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

public class ProgramParticipationReport extends LateCheckoutReport {

	public ProgramParticipationReport(WebDriver driver) {
		super(driver);
		
	}

	public void participation()throws Exception{
					
				waitForSeconds(5);
				programparticipationreport.click();
				waitForSeconds(5);
				exporttoexcel();
	}
	
	
}

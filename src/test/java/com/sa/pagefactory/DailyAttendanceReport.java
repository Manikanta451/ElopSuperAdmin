package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DailyAttendanceReport extends LateCheckoutReport{

	public DailyAttendanceReport(WebDriver driver) {
		super(driver);
		
	}

	public void daily ()throws Exception{
		
				waitForSeconds(5);
				dailyattendancereport.click();
				waitForSeconds(5);
				Select sitename = new Select(Sitename);
				sitename.selectByVisibleText("Richland Elementary");
				waitForSeconds(1);
				search.click();
				downloadpdf(pdf);
	}
	
	public void downloadpdf(WebElement element)throws Exception{
		
				waitForSeconds(8);
				if (pdf.isDisplayed()) {
					pdf.click();
				}
				
	}
	
}

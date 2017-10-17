package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;

public class StudentAttendanceReport extends LateCheckoutReport {

	public StudentAttendanceReport(WebDriver driver) {
		super(driver);
		
	}

	public void attendance()throws Exception{
		
				waitForSeconds(5);
				studentattendancereports.click();
				waitForSeconds(5);
				exporttoexcel();
	}
	
}

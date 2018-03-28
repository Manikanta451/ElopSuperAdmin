package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StudentAttendanceReport extends LateCheckoutReport {

	public StudentAttendanceReport(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[6]/a/span")
	public static WebElement studentattendancereports;
	
	public void attendance()throws Exception{
		
				waitForSeconds(5);
				studentattendancereports.click();
				waitForSeconds(5);
				exporttoexcel();
	}
	
}

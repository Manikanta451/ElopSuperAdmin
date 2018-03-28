package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DailyAttendanceReport extends CommonBase{

	public DailyAttendanceReport(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[7]/a/span")
	public static WebElement dailyattendancereport;
	
	@FindBy(how = How.ID, using = "SiteId")
	public static WebElement Sitename;
	
	@FindBy(how = How.ID, using = "search")
	public static WebElement search;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div[1]/div/div[2]/a")
	public static WebElement pdf;
	

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

package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class ReportsPageObjects extends CommonBase {

	protected ReportsPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/a")
	public static WebElement clickreports;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[1]/a/span")
	public static WebElement latechecoutreports;
									 
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div[1]/a/div/embed")
	public static WebElement reportsexport;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[2]/a/span")
	public static WebElement excessmealreports;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[3]/a/span")
	public static WebElement disallowedmealreports;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[4]/a/span")
	public static WebElement cacfpcountreport	;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[5]/a/span")
	public static WebElement revenuereports;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[6]/a/span")
	public static WebElement studentattendancereports;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[7]/a/span")
	public static WebElement dailyattendancereport;
	
	@FindBy(how = How.ID, using = "SiteId")
	public static WebElement Sitename;
	
	@FindBy(how = How.ID, using = "search")
	public static WebElement search;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div[1]/div/div[2]/a")
	public static WebElement pdf;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[8]/a/span")
	public static WebElement programparticipationreport;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[9]/a")
	public static WebElement paymentorcreditnreport;

}

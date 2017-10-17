package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class SiteInfoPageObjects extends CommonBase{

	protected SiteInfoPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[19]/a")
	public static WebElement clicksiteinfo;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/p/a")
	public static WebElement createksiteinfo;
	
	@FindBy(how = How.ID, using = "SiteId")
	public static WebElement siteinfositename;
	
	@FindBy(how = How.ID, using = "SiteTypeId")
	public static WebElement siteinfoSiteTypeId;
	
	@FindBy(how = How.ID, using = "StartDate")
	public static WebElement StartDate;
	
	@FindBy(how = How.ID, using = "EndDate")
	public static WebElement EndDate;
	
	@FindBy(how = How.ID, using ="WeekStartTime")
	public static WebElement WeekStartTime;
	
	@FindBy(how = How.ID, using ="WeekStartAMPM")
	public static WebElement WeekStartAMPM;
	
	@FindBy(how = How.ID, using = "WeekEndTime")
	public static WebElement WeekEndTime;
	
	@FindBy(how = How.ID, using = "WeekEndAMPM")
	public static WebElement WeekEndAMPM;
	
	@FindBy(how = How.ID, using = "NoOfSpaces")
	public static WebElement Maxcapacity;
	
	@FindBy(how = How.ID, using = "MealsOrdered")
	public static WebElement MealsOrdered;
	
	@FindBy(how = How.ID, using = "WeeklyRate")
	public static WebElement SiteInfoWeeklyRate;
	
	@FindBy(how = How.ID, using = "LateFee")
	public static WebElement SiteinfoLateFee;
	
	@FindBy(how = How.ID, using = "RegistraionFee")
	public static WebElement SiteinfoRegistraionFee;
	
	@FindBy(how = How.ID, using = "Latefeeforeveryminute")
	public static WebElement SiteInfoLatefeeforeveryminute;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement Active;
	
	@FindBy(how = How.ID, using = "/html/body/div[3]/div[4]/div/div[3]/div/div/div[2]/div/div/form/div/div/div/div/div[12]/div/input")
	public static WebElement submitsireInfo;
	
	
	
	
	
	

}

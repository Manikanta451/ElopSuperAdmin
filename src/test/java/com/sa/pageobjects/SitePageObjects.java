package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class SitePageObjects  extends CommonBase {

	public SitePageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[6]/a")
	public static WebElement ElopSites;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/p/a")
	public static WebElement CreateSite;
	
	@FindBy(how = How.ID, using = "SiteName")
	public static WebElement SiteName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/input")
	public static WebElement beforeonly;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/input")
	public static WebElement afteronly;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/input")
	public static WebElement beforeandafteronly;
	
	@FindBy(how = How.XPATH, using = "	/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[2]/div/div/div[4]/input")
	public static WebElement summerenrichment;
	
	@FindBy(how = How.ID, using = "SiteTypeName")
	public static WebElement SiteType;
	
	@FindBy(how = How.ID, using = "Supervisor")
	public static WebElement SiteSupervisor;
	
	@FindBy(how = How.ID, using = "LocCode")
	public static WebElement SiteLocationCode;
	
	@FindBy(how = How.ID, using = "PhoneNumber")
	public static WebElement SitePhoneNumber;
	
	@FindBy(how = How.ID, using = "Address")
	public static WebElement SiteAddress;
	
	@FindBy(how = How.ID, using = "City")
	public static WebElement SiteCity;
	
	@FindBy(how = How.ID, using = "Zipcode")
	public static WebElement SiteZipcode;
	
	@FindBy(how = How.ID, using = "FaxNumber")
	public static WebElement SiteFaxNumber;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[12]/div/input")
	public static WebElement Sitesubmit;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a")
	public static WebElement editSite;
	
	@FindBy(how = How.XPATH, using = "	/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[12]/div/input")
	public static WebElement UpdateSite;
	
	@FindBy(how = How.XPATH, using = "	/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/button")
	public static WebElement DeleteSite;
	
	
}

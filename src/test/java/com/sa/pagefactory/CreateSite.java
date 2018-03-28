package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;

public class CreateSite extends CommonBase{

	public CreateSite(WebDriver driver) {
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
	
	
	public void createsitenames(DataInt dataInt) throws Exception{
		
		        waitForSeconds(5);
		        ElopSites.click();
		        waitForSeconds(3);
		        CreateSite.click();
		        waitForSeconds(4);
		        SiteName.sendKeys(dataInt.getSiteName());
		        waitForSeconds(1);
		        beforeonly.click();
		        afteronly.click();
		        beforeandafteronly.click();
		        waitForSeconds(2);
		        Select sitetype = new Select(SiteType);
		        sitetype.selectByVisibleText(dataInt.getSiteType());
				waitForSeconds(1);
		        SiteSupervisor.sendKeys(dataInt.getSiteSupervisor());
		        SiteLocationCode.sendKeys(dataInt.getSiteLocationCode());
		        SitePhoneNumber.sendKeys(dataInt.getSitePhoneNumber());
		        SiteAddress.sendKeys(dataInt.getSiteAddress());
		        waitForSeconds(1);
		        SiteCity.sendKeys(dataInt.getSiteCity());
		        SiteZipcode.sendKeys(dataInt.getSiteZipcode());
		        SiteFaxNumber.sendKeys(dataInt.getSiteFaxNumber());
		        waitForSeconds(2);
		       // Sitesubmit.click();
		        

		        
		        
		        
	}
	
	
}

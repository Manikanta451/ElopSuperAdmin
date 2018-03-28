package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;

public class CreateSiteUser extends CommonBase {

	public CreateSiteUser(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[7]/a")
	public static WebElement SiteUsers;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[1]/div/div/a")
	public static WebElement SiteUsersCreate;
	
	@FindBy(how = How.ID, using = "siteId")
	public static WebElement siteName;
	
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement SiteUserFirstName;
	
	@FindBy(how = How.ID, using = "MiddleName")
	public static WebElement SiteUserMiddleName;
	
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement SiteUserLastName;
	
	@FindBy(how = How.ID, using = "EmailId")
	public static WebElement SiteUserEmailId;
	
	@FindBy(how = How.ID, using = "PassWord")
	public static WebElement SiteuserPassWord;
	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	public static WebElement SiteUserConfirmPassword;
	
	@FindBy(how = How.ID, using = "PhoneNumber")
	public static WebElement SiteUserPhoneNumber;
	
	@FindBy(how = How.ID, using = "Address1")
	public static WebElement SiteUserAddress1;
	
	@FindBy(how = How.ID, using = "Address2")
	public static WebElement SiteuserAddress2;
	
	@FindBy(how = How.ID, using = "City")
	public static WebElement SiteUserCity;
	
	@FindBy(how = How.ID, using = "ZipCode")
	public static WebElement SiteUserZipCode;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[14]/div/input")
	public static WebElement SiteUserSubmit;

	
	public void siteusercreate(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				SiteUsers.click();
				waitForSeconds(3);
				SiteUsersCreate.click();
				waitForSeconds(3);
				Select sitename = new Select(siteName);
				sitename.selectByVisibleText(dataInt.getSchoolName());
				waitForSeconds(1);
				SiteUserFirstName.sendKeys(dataInt.getSiteUserFirstName());
				SiteUserMiddleName.sendKeys(dataInt.getSiteUserMiddleName());
				SiteUserLastName.sendKeys(dataInt.getSiteUserLastName());
				SiteUserEmailId.sendKeys(gettingEmailrandomly());
				SiteuserPassWord.sendKeys(dataInt.getSiteuserPassWord());
				SiteUserConfirmPassword.sendKeys(dataInt.getSiteuserPassWord());
				SiteUserPhoneNumber.sendKeys(dataInt.getSiteUserPhoneNumber());
				SiteUserAddress1.sendKeys(dataInt.getSiteUserAddress1());
				SiteuserAddress2.sendKeys(dataInt.getSiteuserAddress2());
				SiteUserCity.sendKeys(dataInt.getSiteUserCity());
				SiteUserZipCode.sendKeys(dataInt.getSiteUserZipCode());
				waitForSeconds(2);
				//SiteUserSubmit.click();
	}
	
	
	
	

}

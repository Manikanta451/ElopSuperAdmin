package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class SiteUsersPageObjects extends CommonBase{

	public  SiteUsersPageObjects(WebDriver driver) {
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
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[8]/a")
	public static WebElement SiteUseredit;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[11]/div/input")
	public static WebElement SiteUserUpdate;
	
	
	

}

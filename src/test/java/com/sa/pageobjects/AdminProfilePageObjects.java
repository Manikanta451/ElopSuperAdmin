package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.pagefactory.CommonBase;

public class AdminProfilePageObjects extends CommonBase {

	public AdminProfilePageObjects(WebDriver driver) {
		super(driver);
		
	}

	//--- My Profile---//
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/a/span")
	public static WebElement Admin;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/ul/li[1]/a")
	public static WebElement Adminmyprofile;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div[2]/div/div/a")
	public static WebElement Admineditprofile;
	
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement AdminFirstName;
	
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement AdminLastName;
	
	@FindBy(how = How.ID, using = "PhoneNumber")
	public static WebElement AdminPhoneNumber;
	
	@FindBy(how = How.ID, using = "Address1")
	public static WebElement AdminAddress1;
	
	@FindBy(how = How.ID, using = "Address2")
	public static WebElement AdminAddress2;
	
	@FindBy(how = How.ID, using = "City")
	public static WebElement AdminCity;
	
	@FindBy(how = How.ID, using = "ZipCode")
	public static WebElement AdminZipCode;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[10]/div/button")
	public static WebElement Adminprofileupdate;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/a/span")
	public static WebElement admin;
	
	//--- Change Passwrod---//
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/ul/li[2]/a")
	public static WebElement ChangePasswrod;
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement AdminPassword;
	
	@FindBy(how = How.ID, using = "NewPassword")
	public static WebElement AdminNewPassword;
	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	public static WebElement AdminConfirmPassword;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[4]/div/input")
	public static WebElement ChangeAdminpassword;
	
	//--- My Profile---//
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/ul/li[3]/a")
	public static WebElement AdminLogout;
	
	
	
	
	
}

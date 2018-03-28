package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class AdminProfile extends CommonBase {

	public AdminProfile(WebDriver driver) {
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
		
	
	    public void profile(DataInt dataInt)throws Exception{
		
				waitForSeconds(4);
				mouseOver(admin, Adminmyprofile);
				waitForSeconds(1);
				Adminmyprofile.click();
				waitForSeconds(3);
				Admineditprofile.click();
				waitForSeconds(4);
				AdminFirstName.clear();
				waitForSeconds(1);
				AdminFirstName.sendKeys(dataInt.getAdminFirstName());
				AdminLastName.clear();
				waitForSeconds(1);
				AdminLastName.sendKeys(dataInt.getAdminLastName());
				AdminPhoneNumber.clear();
				waitForSeconds(1);
				AdminPhoneNumber.sendKeys(dataInt.getAdminPhoneNumber());
				AdminAddress1.clear();
				waitForSeconds(1);
				AdminAddress1.sendKeys(dataInt.getAdminAddress1());
				AdminAddress2.clear();
				waitForSeconds(1);
				AdminAddress2.sendKeys(dataInt.getAdminAddress2());
				AdminCity.clear();
				waitForSeconds(1);
				AdminCity.sendKeys(dataInt.getAdminCity());
				AdminZipCode.clear();
				waitForSeconds(1);
				AdminZipCode.sendKeys(dataInt.getAdminZipCode());
				waitForSeconds(2);
				Adminprofileupdate.click();
				
				
	}
	
	

}

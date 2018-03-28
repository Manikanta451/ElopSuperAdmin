package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class CreateElopUser extends CommonBase {

	public CreateElopUser(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[4]/a")
	public static WebElement Elopusers;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[1]/div/div/a")
	public static WebElement CreateNewElopUser;
	
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement ElopUserFirstName;
	
	@FindBy(how = How.ID, using = "MiddleName")
	public static WebElement ElopUserMiddleName;
	
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement ElopUserLastName;
	
	@FindBy(how = How.ID, using = "EmailId")
	public static WebElement ElopUserEmailId;
	
	@FindBy(how = How.ID, using = "PassWord")
	public static WebElement ElopUserPassWord;
	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	public static WebElement ElopUserConfirmPassword;
	
	@FindBy(how = How.ID, using = "PhoneNumber")
	public static WebElement ElopUserPhoneNumber;
	
	@FindBy(how = How.ID, using = "Address1")
	public static WebElement ElopUserAddress1;
	
	@FindBy(how = How.ID, using = "Address2")
	public static WebElement ElopUserAddress2;
	
	@FindBy(how = How.ID, using = "City")
	public static WebElement ElopUserCity;
	
	@FindBy(how = How.ID, using = "ZipCode")
	public static WebElement ElopUserZipCode;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement ElopUserIsActive;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[14]/div/input")
	public static WebElement ElopUserSubmit;

	
	public void Createadmin (DataInt dataInt) throws Exception{
		
			waitForSeconds(4);
			Elopusers.click();
			waitForSeconds(3);
			CreateNewElopUser.click();
			waitForSeconds(2);
			ElopUserFirstName.sendKeys(dataInt.getElopUserFirstName());
			ElopUserMiddleName.sendKeys(dataInt.getElopUserMiddleName());
			ElopUserLastName.sendKeys(dataInt.getElopUserLastName());
			ElopUserEmailId.sendKeys(dataInt.getElopUserEmailId());
			ElopUserPassWord.sendKeys(dataInt.getElopUserPassWord());
			ElopUserConfirmPassword.sendKeys(dataInt.getElopUserPassWord());
			ElopUserPhoneNumber.sendKeys(dataInt.getElopUserPhoneNumber());
			ElopUserAddress1.sendKeys(dataInt.getElopUserAddress1());
			ElopUserAddress2.sendKeys(dataInt.getElopUserAddress2());
			ElopUserCity.sendKeys(dataInt.getElopUserCity());
			ElopUserZipCode.sendKeys(dataInt.getElopUserZipCode());
			waitForSeconds(1);
			ElopUserIsActive.click();
			waitForSeconds(2);
			//ElopUserSubmit.click();
	}	
}

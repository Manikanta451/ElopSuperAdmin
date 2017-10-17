package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class DHSVoucherPageObjects extends CommonBase {

	public DHSVoucherPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[10]/a/span")	  
	public  static WebElement DHSVoucher;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/p/a")	  
	public  static WebElement CreateDHSVoucher;
	
	@FindBy(how = How.ID, using = "StudentFormId")	  
	public  static WebElement StateID;
	
	@FindBy(how = How.ID, using = "VocherNumber")	  
	public  static WebElement VocherNumber;
	
	@FindBy(how = How.ID, using = "Amountperweek")	  
	public  static WebElement Amountperweek;
	
	@FindBy(how = How.ID, using = "StartDate")	  
	public  static WebElement StartDate;
	
	@FindBy(how = How.ID, using = "EndDate")	  
	public  static WebElement EndDate;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[6]/div/input[1]")	  
	public  static WebElement ISactive;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[7]/div/input")	  
	public  static WebElement dhssubmit;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr/td[8]/a")	  
	public  static WebElement dhsEdit;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[7]/div/input")	  
	public  static WebElement dhsupdate;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr/td[8]/button")	  
	public  static WebElement dhsdelete;
	
	
	
	
	
	
		
	
}

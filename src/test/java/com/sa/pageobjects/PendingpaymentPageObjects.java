package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class PendingpaymentPageObjects extends CommonBase{

	protected PendingpaymentPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[12]/a/span")
	public static WebElement creatependingpayment;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div[1]/a")
	public static WebElement createnewpayment;
	
	@FindBy(how = How.ID, using = "ParentId")
	public static WebElement ParentId;
	
	@FindBy(how = How.ID, using = "StudentFormId")
	public static WebElement StudentFormId;
	
	@FindBy(how = How.ID, using = "WeeklyStartDate")
	public static WebElement WeeklyStartDate;
	
	@FindBy(how = How.ID, using = "WeeklyEndDate")
	public static WebElement WeeklyEndDate;
	
	@FindBy(how = How.ID, using = "WeeklyFee")
	public static WebElement WeeklyFee;
	
	@FindBy(how = How.ID, using = "LateFee")
	public static WebElement LateFee;
	
	@FindBy(how = How.ID, using = "RegistationFee")
	public static WebElement RegistationFee;
	
	@FindBy(how = How.ID, using = "LateFeeMin")
	public static WebElement LateFeeMin;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[10]/div/input")
	public static WebElement submitpayment;
	
	
	
}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;

public class CreatePendingPayment  extends CommonBase{

	public  CreatePendingPayment(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[14]/a/span")
	public static WebElement pendingpayment;
	
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
	
	
	public void creatingpayments(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					pendingpayment.click();
					waitForSeconds(5);
					createnewpayment.click();
					waitForSeconds(3);
					Select parent = new Select(ParentId);
					parent.selectByVisibleText(dataInt.getParentId());
					waitForSeconds(1);
					Select student = new Select(StudentFormId);
					student.selectByVisibleText(dataInt.getStudentFormId());
					waitForSeconds(1);
					WeeklyStartDate.click();
					waitForSeconds(1);
					systemdateselect();
					waitForSeconds(1);
					WeeklyEndDate.click();
					waitForSeconds(1);
					expiryDate();
					waitForSeconds(1);
					WeeklyFee.sendKeys(dataInt.getWeeklyFee());
					LateFee.sendKeys(dataInt.getLateFee());
					RegistationFee.sendKeys(dataInt.getRegistationFee());
					LateFeeMin.sendKeys(dataInt.getLateFeeMin());
					waitForSeconds(3);
					//submitpayment.click();
		
	}
	
	
}

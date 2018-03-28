package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;

public class CreateDHSVoucher extends CommonBase {

	public CreateDHSVoucher(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[12]/a/span")	  
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
	
	
	public void createdhsvoucher(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				DHSVoucher.click();
				waitForSeconds(4);
				CreateDHSVoucher.click();
				waitForSeconds(3);
				Select stateID = new Select(StateID);
				stateID.selectByVisibleText(dataInt.getStateID());
				waitForSeconds(1);
				VocherNumber.sendKeys(dataInt.getVouchername());
				Amountperweek.sendKeys(dataInt.getAmountperweek());
				waitForSeconds(1);
				StartDate.click();
				systemdateselect();
				waitForSeconds(1);
				EndDate.click();
				expiryDate();
				waitForSeconds(2);
				ISactive.click();
				waitForSeconds(1);
				//dhssubmit.click();
				
		
		
	}
	
	
}

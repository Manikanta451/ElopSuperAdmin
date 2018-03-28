package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class EditDHSVoucher extends CommonBase {

	public EditDHSVoucher(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr/td[8]/a")	  
	public  static WebElement dhsEdit;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[7]/div/input")	  
	public  static WebElement dhsupdate;
	
	@FindBy(how = How.ID, using = "Amountperweek")	  
	public  static WebElement Amountperweek;
	
	public void DHSVoucheredit(DataInt dataInt)throws Exception{
		
					waitForSeconds(4);
					dhsEdit.click();
					waitForSeconds(4);
					Amountperweek.clear();
					waitForSeconds(1);
					Amountperweek.sendKeys(dataInt.getAmountperweek());
					waitForSeconds(2);
					dhsupdate.click();
		
	}

}

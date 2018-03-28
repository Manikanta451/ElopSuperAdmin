package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeleteDHSVoucher extends CommonBase {

	public DeleteDHSVoucher(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr/td[8]/button")	  
	public  static WebElement dhsdelete;
	
	public void deletevoucher()throws Exception{
		
				waitForSeconds(4);
				dhsdelete.click();
				waitForSeconds(2);
				checkAlert();
				
		
	}
	
	
}

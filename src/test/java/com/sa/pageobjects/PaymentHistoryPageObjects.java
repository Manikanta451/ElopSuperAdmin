package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.pagefactory.CommonBase;

public class PaymentHistoryPageObjects extends CommonBase{

	protected PaymentHistoryPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[11]/a/span")
	public static WebElement paymenthistory;
	
	@FindBy(how = How.ID, using = "PaymentTypeId")
	public static WebElement PaymentType;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/a/div/embed")
	public static WebElement export;  
	
	
}

package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class SiblingDiscountPageObjects extends CommonBase{

	protected SiblingDiscountPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[13]/a/span")
	public static WebElement Siblingdiscount;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/p/a")
	public static WebElement Siblingdiscountcreate;
	
	@FindBy(how = How.ID, using = "ParentId")
	public static WebElement ParentId;
	
	@FindBy(how = How.ID, using = "StudentFormId")
	public static WebElement StudentFormId;
	
	@FindBy(how = How.ID ,using = "Siblingdiscount")
	public static WebElement Siblingdiscountadd;
	
}

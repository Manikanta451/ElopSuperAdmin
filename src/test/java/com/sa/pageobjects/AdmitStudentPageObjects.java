package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.pagefactory.CommonBase;

public class AdmitStudentPageObjects extends CommonBase {

	public AdmitStudentPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[10]/a/span")
	public static WebElement AdmitStudent;
	
	@FindBy(how = How.ID,using = "CareId")
	public static WebElement Program;
	
	@FindBy(how = How.ID,using = "SiteId")
	public static WebElement SiteName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[3]/div/div/table/tbody/tr/td[9]/a")
	public static WebElement Admitstudentfromwl;
	
	
	
	
	

}

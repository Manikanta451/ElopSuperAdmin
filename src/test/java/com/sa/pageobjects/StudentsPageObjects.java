package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class StudentsPageObjects extends CommonBase {

	public StudentsPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[1]/div/ul/li[9]/a")
	public static WebElement Students;
	
	@FindBy(how = How.ID,using = "CareId")
	public static WebElement Program;
	
	@FindBy(how = How.ID,using = "ProcessType")
	public static WebElement Status;
	
	@FindBy(how = How.ID,using = "SiteId")
	public static WebElement SiteName;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[9]/a[1]")
	public static WebElement EditStudent;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div[2]/div/div/div[5]/div/input")
	public static WebElement UpdateStudent;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/a/div/embed")
	public static WebElement StudentsExport;
	
	
	

}

package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.pagefactory.CommonBase;

public class ParentsPageObjects extends CommonBase{

	public ParentsPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[1]/div/ul/li[8]/a")
	public static WebElement Parents;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[9]/a[1]")
	public static WebElement EditParent;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/ul/li[2]/a)")
	public static WebElement StudentsList;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/a")
	public static WebElement BacktoList;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div[1]/a/div/embed")
	public static WebElement PareentsExport;

}

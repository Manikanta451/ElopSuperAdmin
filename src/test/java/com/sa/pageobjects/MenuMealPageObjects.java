package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.pagefactory.CommonBase;

public class MenuMealPageObjects extends CommonBase {

	protected MenuMealPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[15]/a/span")
	public static WebElement menumeal;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")
	public static WebElement createmenumeal;
	
	@FindBy(how = How.ID, using = "Name")
	public static WebElement mealitem;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement IsActive;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/input")
	public static WebElement submitmenumeal;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")
	public static WebElement edittmenumeal;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/input")
	public static WebElement updatetmenumeal;
	
	
}

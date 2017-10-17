package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class WeekOffPageObjects extends CommonBase{

	protected WeekOffPageObjects(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[17]/a")
	public static WebElement weekoffclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")
	public static WebElement weekoffcreate;
	
	@FindBy(how = How.ID, using = "Date")
	public static WebElement Date;
	
	@FindBy(how = How.ID, using = "Title")
	public static WebElement Title;
	
	@FindBy(how = How.ID, using = "mceu_21")
	public static WebElement description;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/div")
	public static WebElement desc;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement active;
	
	@FindBy(how = How.ID, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[6]/div/input")
	public static WebElement submitweekoff;
	
	
	
}

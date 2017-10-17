package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.pagefactory.CommonBase;

public class MedicalConditionPageObjects extends CommonBase{

	protected MedicalConditionPageObjects(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[1]/div/ul/li[14]/a/span")
	public static WebElement medical;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")
	public static WebElement createmedical;
	
	@FindBy(how = How.ID,using = "ConditionName")
	public static WebElement ConditionName;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[2]/div/input[1]")
	public static WebElement medicalactive;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[3]/div/input")
	public static WebElement medicaladd;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")
	public static WebElement medicaledit;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[3]/div/input")
	public static WebElement medicalupdate;
	
	
	
	
	
	
	
}

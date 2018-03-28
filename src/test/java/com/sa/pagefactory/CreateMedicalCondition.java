package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CreateMedicalCondition extends CommonBase {

	public CreateMedicalCondition(WebDriver driver) {
		super(driver);
	}
	                                  
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[1]/div/ul/li[16]/a")
	public static WebElement medical;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")
	public static WebElement createmedical;
	
	@FindBy(how = How.ID,using = "ConditionName")
	public static WebElement ConditionName;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[2]/div/input[1]")
	public static WebElement medicalactive;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[3]/div/input")
	public static WebElement medicaladd;
	
	
	public void medicalcondition()throws Exception{
		
				waitForSeconds(5);
				medical.click();
				waitForSeconds(4);
				createmedical.click();
				waitForSeconds(4);
				ConditionName.sendKeys("Sample Medical");
				waitForSeconds(1);
				medicalactive.click();
				waitForSeconds(1);
				//medicaladd.click();
		
	}

}

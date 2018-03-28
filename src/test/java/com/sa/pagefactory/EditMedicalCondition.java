package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditMedicalCondition extends CreateMedicalCondition{

	public EditMedicalCondition(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")
	public static WebElement medicaledit;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[3]/div/input")
	public static WebElement medicalupdate;
	
	
	public void editmedical()throws Exception{
		
				waitForSeconds(5);
				medicaledit.click();
				waitForSeconds(4);
				ConditionName.clear();
				waitForSeconds(1);
				ConditionName.sendKeys("No known health problems");
				waitForSeconds(1);
				isactive(medicalactive);
				waitForSeconds(1);
				medicalupdate.click();
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
	
}

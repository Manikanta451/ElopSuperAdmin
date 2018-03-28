package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;

public class CreateSiblingDiscount extends CommonBase {

	public CreateSiblingDiscount(WebDriver driver) {
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
	
	public void Siblingdiscount(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				Siblingdiscount.click();
				waitForSeconds(3);
				Siblingdiscountcreate.click();
				waitForSeconds(3);
				Select parents = new Select(ParentId);
				parents.selectByVisibleText(dataInt.getParents());
				waitForSeconds(2);
				Select students = new Select(StudentFormId);
				students.selectByVisibleText(dataInt.getStudent());
				waitForSeconds(1);
				Siblingdiscount.sendKeys(dataInt.getSiblingDiscount());
				waitForSeconds(1);
				//Siblingdiscountadd.click();
				
					
	}

}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.datainitialization.DataInt;

public class CreateResourceVideoorDocument extends CommonBase{

	public CreateResourceVideoorDocument(WebDriver driver) {
		super(driver);
	
	}
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[20]/a")
	public static WebElement resorce;
	
	@FindBy(how = How.XPATH, using = "	/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/p/a")
	public static WebElement createresorce;
	
	@FindBy(how = How.ID, using = "VideoUrl")
	public static WebElement VideoUrl;
	
	@FindBy(how = How.ID, using = "Title")
	public static WebElement Title;
	
	@FindBy(how = How.XPATH, using = "//*[@id=mceu_41")
	public static WebElement ResourecDescription;
	
	@FindBy(how = How.ID, using = "DisplayOrder")
	public static WebElement DisplayOrder;
	
	public void resouce(DataInt dataInt)throws Exception{
		
		         waitForSeconds(4);
		         resorce.click();
		         waitForSeconds(3);
		         createresorce.click();
		         waitForSeconds(3);
		         VideoUrl.sendKeys(dataInt.getUrl());
		         Title.sendKeys(dataInt.getResourcetitle());
		         waitForSeconds(1);
		         senddescription(dataInt);
		         waitForSeconds(1);
		         DisplayOrder.sendKeys(dataInt.getDisplayOrder());
		         
		         
		
	}
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(ResourecDescription);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getHeaderImagedesc());
				actions.build().perform();
	}

}

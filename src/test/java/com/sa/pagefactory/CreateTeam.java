package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class CreateTeam extends CommonBase{

	public CreateTeam(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/a/span[1]")	  
	public  static WebElement contentmanagementclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/ul/li[4]/a/span")	  
	public  static WebElement aboutustreamclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div[1]/div/div/div/a")	  
	public  static WebElement aboutustreamcreate;
	
	@FindBy(how = How.ID, using = "Name")	  
	public  static WebElement TeamName;
	
	@FindBy(how = How.ID, using = "Desgination")	  
	public  static WebElement Desgination;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div[1]/div[3]/div/div")	  
	public  static WebElement Teamdescription;
	
	@FindBy(how = How.ID, using = "choose")	  
	public  static WebElement teamiamgeupload;
	
	@FindBy(how = How.ID, using = "AltTag")	  
	public  static WebElement TeamAltTag;
	
	@FindBy(how = How.ID, using = "DisplayOrder")	  
	public  static WebElement TeamDisplayOrder;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div[1]/div[7]/div/input")	  
	public  static WebElement teamSubmit;
	
	
	public void team(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				contentmanagementclick.click();
				waitForSeconds(4);
				aboutustreamclick.click();
				waitForSeconds(4);
				aboutustreamcreate.click();
				waitForSeconds(4);
				TeamName.sendKeys(dataInt.getTeamName());
				Desgination.sendKeys(dataInt.getDesgination());
				senddescription(dataInt);
				TeamAltTag.sendKeys(dataInt.getTeamAltTag());
				TeamDisplayOrder.sendKeys(dataInt.getTeamDisplayOrder());
				waitForSeconds(2);
				//teamSubmit.click();
		
		}
		
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(Teamdescription);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getHeaderImagedesc());
				actions.build().perform();
	}
	
	
}

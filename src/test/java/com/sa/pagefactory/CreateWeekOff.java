package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class CreateWeekOff extends CommonBase{

	public CreateWeekOff(WebDriver driver) {
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

	
	public void weekoff(DataInt dataInt )throws Exception{
				
				waitForSeconds(5);
				weekoffclick.click();
				waitForSeconds(4);
				weekoffcreate.click();
				waitForSeconds(5);
				Date.click();
				waitForSeconds(1);
				futuredateselection();
				waitForSeconds(1);
				Title.sendKeys(dataInt.getTitle());
				senddescription(dataInt);
				waitForSeconds(2);
				active.click();
				//submitweekoff.click();

			}
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(description);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getDescription());
				actions.build().perform();
			}
}

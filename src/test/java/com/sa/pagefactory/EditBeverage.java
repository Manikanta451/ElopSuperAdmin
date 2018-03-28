package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditBeverage extends CommonBase {

	public EditBeverage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.ID, using = "Beverage")
	public static WebElement Beverage;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[4]/a")
	public static WebElement editbeverage;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/input")
	public static WebElement updatebeverage;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement active;
	
	public void beverageedit()throws Exception{
		
				waitForSeconds(5);
				editbeverage.click();
				waitForSeconds(4);
				Beverage.sendKeys(" 100% Orange Juice ");
				waitForSeconds(1);
				isactive(active);
				waitForSeconds(1);
				updatebeverage.click();
				
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
}

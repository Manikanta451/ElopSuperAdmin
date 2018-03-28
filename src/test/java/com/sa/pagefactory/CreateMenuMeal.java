package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateMenuMeal extends CommonBase{

	public CreateMenuMeal(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[17]/a")
	public static WebElement menumeal;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")
	public static WebElement createmenumeal;
	
	@FindBy(how = How.ID, using = "Name")
	public static WebElement mealitem;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement IsActive;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/input")
	public static WebElement submitmenumeal;

	public void menumealadd()throws Exception{
		
				waitForSeconds(5);
				menumeal.click();
				waitForSeconds(4);
				createmenumeal.click();
				waitForSeconds(3);
				mealitem.sendKeys("Green Apple");
				isactive(IsActive);
				waitForSeconds(1);
				//submitmenumeal.click();
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
	
}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditMenuMeal  extends CreateMenuMeal{

	public EditMenuMeal(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")
	public static WebElement edittmenumeal;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/input")
	public static WebElement updatetmenumeal;
	
	public void menumealedit()throws Exception{
			
				waitForSeconds(4);
				edittmenumeal.click();
				waitForSeconds(4);
				mealitem.clear();
				waitForSeconds(1);
				mealitem.sendKeys("Grizzlies Grabber");
				waitForSeconds(1);
				isactive(IsActive);
				updatetmenumeal.click();
			
		
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
}

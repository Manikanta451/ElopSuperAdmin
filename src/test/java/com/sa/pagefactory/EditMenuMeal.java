package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sa.pageobjects.MenuMealPageObjects;

public class EditMenuMeal  extends MenuMealPageObjects{

	public EditMenuMeal(WebDriver driver) {
		super(driver);	
	}
	
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

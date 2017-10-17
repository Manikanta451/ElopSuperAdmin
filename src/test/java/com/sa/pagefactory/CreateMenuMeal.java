package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.sa.pageobjects.MenuMealPageObjects;

public class CreateMenuMeal extends MenuMealPageObjects{

	public CreateMenuMeal(WebDriver driver) {
		super(driver);
		
	}

	public void menumealadd()throws Exception{
		
				waitForSeconds(5);
				menumeal.click();
				waitForSeconds(4);
				createmenumeal.click();
				waitForSeconds(3);
				mealitem.sendKeys("Green Apple");
				isactive(IsActive);
				waitForSeconds(1);
				submitmenumeal.click();
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
	
}

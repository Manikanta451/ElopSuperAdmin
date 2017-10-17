package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.sa.pageobjects.BeveragePageObjects;

public class EditBeverage extends BeveragePageObjects {

	public EditBeverage(WebDriver driver) {
		super(driver);
		
	}
	
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

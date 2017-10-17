package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sa.pageobjects.BeveragePageObjects;

public class CreateBeverage extends BeveragePageObjects{

	public CreateBeverage(WebDriver driver) {
		super(driver);
		
	}

	public void beverage()throws Exception{
		
				waitForSeconds(5);
				beverageclick.click();
				waitForSeconds(4);
				createnewbeverage.click();
				waitForSeconds(3);
				Beverage.sendKeys("Pure Milk");
				waitForSeconds(1);
				isactive(active);
				addbeverage.click();
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
	
}

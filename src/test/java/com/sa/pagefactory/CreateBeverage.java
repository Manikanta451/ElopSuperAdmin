package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateBeverage extends CommonBase{

	public CreateBeverage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[18]/a")
	public static WebElement beverageclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")
	public static WebElement createnewbeverage;
	
	@FindBy(how = How.ID, using = "Beverage")
	public static WebElement Beverage;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement active;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/input")
	public static WebElement addbeverage;

	public void beverage()throws Exception{
		
				waitForSeconds(3);
				beverageclick.click();
				waitForSeconds(3);
				createnewbeverage.click();
				waitForSeconds(3);
				Beverage.sendKeys("Pure Milk");
				waitForSeconds(1);
				isactive(active);
				//addbeverage.click();
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
	
}

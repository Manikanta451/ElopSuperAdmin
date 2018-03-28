package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LateCheckoutReport extends CommonBase{

	public LateCheckoutReport(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div[1]/a/div/embed")
	public static WebElement reportsexport;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/a")
	public static WebElement clickreports;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[21]/ul/li[1]/a/span")
	public static WebElement latechecoutreports;
	
	public void latecheckout()throws Exception{
		
					waitForSeconds(5);
					clickreports.click();
					waitForSeconds(4);
					latechecoutreports.click();	
				}
	
	
	public void exporttoexcel() throws Exception{
		
					waitForSeconds(6);
					if (reportsexport.isEnabled()) {
						reportsexport.click();
					}
				}

	
	
	

}

package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomeAboutUs extends CommonBase {

	public HomeAboutUs(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/a/span[1]")	  
	public  static WebElement contentmanagementclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div[1]/div[7]/div/input")	  
	public  static WebElement homeabtusclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[5]/a")	  
	public  static WebElement homeabtusedit;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[8]/div/input")	  
	public  static WebElement homeabtusupdate;
	
	public void aboutus()throws Exception{
		
				waitForSeconds(5);
				contentmanagementclick.click();
				waitForSeconds(4);
				homeabtusclick.click();
				waitForSeconds(5);
				homeabtusedit.click();
				waitForSeconds(7);
				homeabtusupdate.click();
	}

}

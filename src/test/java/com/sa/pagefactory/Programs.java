package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Programs extends CommonBase{

	public Programs(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[20]/a/span")
	public static WebElement programclick;
	
	public void program()throws Exception{
		
				waitForSeconds(3);
				programclick.click();
	}
	
	
}

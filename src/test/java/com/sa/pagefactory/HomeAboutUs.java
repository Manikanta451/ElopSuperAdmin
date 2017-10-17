package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.ContentManagementPageObjects;

public class HomeAboutUs extends ContentManagementPageObjects {

	public HomeAboutUs(WebDriver driver) {
		super(driver);
	}
	
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

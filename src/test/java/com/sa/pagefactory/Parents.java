package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.ParentsPageObjects;

public class Parents extends ParentsPageObjects {

	public Parents(WebDriver driver) {
		super(driver);
		
	}
	
	public void parentslist()throws Exception {
		
		        waitForSeconds(5);
		        Parents.click();
		        waitForSeconds(8);
		        EditParent.click();
		        waitForSeconds(5);
		        StudentsList.click();
		        waitForSeconds(3);
		        BacktoList.click();
		        waitForSeconds(8);
		        PareentsExport.click();
		        
		        
	}

	
	
	
	
	
}

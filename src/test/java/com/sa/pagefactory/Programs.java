package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import com.sa.pageobjects.ProgramPagObjects;

public class Programs extends ProgramPagObjects{

	public Programs(WebDriver driver) {
		super(driver);
	}

	public void program()throws Exception{
		
				waitForSeconds(3);
				programclick.click();
	}
	
	
}

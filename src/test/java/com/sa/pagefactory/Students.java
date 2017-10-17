package com.sa.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.pageobjects.StudentsPageObjects;

public class Students extends StudentsPageObjects {

	public Students(WebDriver driver) {
		super(driver);
		
	}
	
	public void studentslist()throws Exception{
		
				waitForSeconds(4);
				Students.click();
				waitForSeconds(8);
				Select program = new Select(Program);
				program.selectByVisibleText("Before ONLY");
				waitForSeconds(1);
				Select status = new Select(Status);
				status.selectByVisibleText("Admitted");
				waitForSeconds(1);
				Select sitename = new Select(SiteName);
				sitename.selectByVisibleText("Alcy Elementary ");
				waitForSeconds(5);
				program.selectByVisibleText("ALL");
				waitForSeconds(1);
				status.selectByVisibleText("ALL");
				waitForSeconds(1);
				sitename.selectByVisibleText("ALL");
				waitForSeconds(5);
				EditStudent.click();
				waitForSeconds(5);
				checkAlert();
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)","");
				waitForSeconds(3);
				UpdateStudent.click();
				waitForSeconds(5);
				StudentsExport.click();
				
				
			
		
	}

}

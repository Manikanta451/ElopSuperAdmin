package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sa.pageobjects.AdmitStudentPageObjects;

public class AdmitStudent extends AdmitStudentPageObjects {

	public AdmitStudent(WebDriver driver) {
		super(driver);
		
	}
	
	public void admitstudentfromwl()throws Exception{
		
				waitForSeconds(5);
				AdmitStudent.click();
				waitForSeconds(6);
				Select program = new Select(Program);
				program.selectByVisibleText("Before ONLY");
				waitForSeconds(1);
				Select site = new Select(SiteName);
				site.selectByVisibleText("Alcy Elementary");
				waitForSeconds(2);
				program.selectByVisibleText("ALL");
				waitForSeconds(1);
				site.selectByVisibleText("ALL");
				waitForSeconds(4);
				admitbutton(Admitstudentfromwl);
				waitForSeconds(3);
				
		
	}
	
	public void admitbutton(WebElement element)throws Exception{
		
				waitForSeconds(8);
				if (Admitstudentfromwl.isDisplayed()) {
					Admitstudentfromwl.click();
				}
		
}

}

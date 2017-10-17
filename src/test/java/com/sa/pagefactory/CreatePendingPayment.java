package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.sa.datainitialization.DataInt;
import com.sa.pageobjects.PendingpaymentPageObjects;

public class CreatePendingPayment  extends PendingpaymentPageObjects{

	public  CreatePendingPayment(WebDriver driver) {
		super(driver);
	}

	public void creatingpayments(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					creatependingpayment.click();
					waitForSeconds(5);
					createnewpayment.click();
					waitForSeconds(3);
					Select parent = new Select(ParentId);
					parent.selectByVisibleText(dataInt.getParentId());
					waitForSeconds(1);
					Select student = new Select(StudentFormId);
					student.selectByVisibleText(dataInt.getStudentFormId());
					waitForSeconds(1);
					WeeklyStartDate.click();
					waitForSeconds(1);
					systemdateselect();
					waitForSeconds(1);
					WeeklyEndDate.click();
					waitForSeconds(1);
					futuredateselection();
					waitForSeconds(1);
					WeeklyFee.sendKeys(dataInt.getWeeklyFee());
					LateFee.sendKeys(dataInt.getLateFee());
					RegistationFee.sendKeys(dataInt.getRegistationFee());
					LateFeeMin.sendKeys(dataInt.getLateFeeMin());
					waitForSeconds(3);
					//submitpayment.click();
		
	}
	
	
}

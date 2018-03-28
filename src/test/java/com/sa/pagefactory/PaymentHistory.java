package com.sa.pagefactory;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PaymentHistory extends CommonBase{

	public PaymentHistory(WebDriver driver) {
		super(driver);
		
	}
										
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[13]/a/span")
	public static WebElement paymenthistory;
	
	@FindBy(how = How.ID, using = "PaymentTypeId")
	public static WebElement PaymentType;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/a/div/embed")
	public static WebElement export;  
	
	
	public void checkpaymenthistory() throws Exception{
		
				waitForSeconds(3);
				paymenthistory.click();
				waitForSeconds(7);
				Select paymenttype = new Select(PaymentType);
				paymenttype.selectByVisibleText("Cash Paid");
				waitForSeconds(5);
				paymenttype.selectByVisibleText("Credit Card");
				waitForSeconds(5);
				paymenttype.selectByVisibleText("All");
		
	}
	
	public void exporttoexcelpaymentrecords() throws Exception{
		
				waitForSeconds(6);
				if (export.isDisplayed()) {
					export.click();
					saveexportexcelfile();
				}
	
	}
	
	public void saveexportexcelfile() throws Exception{
		
				waitForSeconds(2);
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

	}

}

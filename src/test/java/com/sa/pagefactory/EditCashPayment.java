package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditCashPayment extends CreatePendingPayment{

	public EditCashPayment(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "CashPaidDate")
	public static WebElement CashPaidDate;
	
	@FindBy(how = How.ID, using = "Comments")
	public static WebElement Comments;
	
	@FindBy(how = How.ID, using = "Submit")
	public static WebElement Update;
	
	
	
	public void updatecashreceipt()throws Exception{
		
					waitForSeconds(2);
					pendingpayment.click();
					waitForSeconds(3);
					webtablehandle();
					CashPaidDate.click();
					systemdateselect();
					waitForSeconds(1);
					Comments.click();
					Comments.sendKeys("Paid By cash");
					waitForSeconds(1);
					//Update.click();
					
				
				
				
	}
	
	public void webtablehandle()throws Exception{

					boolean breakIt = true;
					while (true) {
					breakIt = true;
					try {						
					WebElement mytable = driver.findElement(By.id("sample_List12"));
					List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
					int rows_count = rows_table.size();
					for (int row =0; row < rows_count; row++) {
					List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
					int columns_count = Columns_row.size();
					//System.out.println("Number of cells In Row " + row + " are " + columns_count);
					 for (int column = 0; column < columns_count; column++) {
						 /*String celtext = Columns_row.get(column).getText();
						 System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);*/
				    	if (row == 1 && column == 9) {
				   	List < WebElement > tags_row = Columns_row.get(9).findElements(By.tagName("a"));
				   	Iterator<WebElement> iterator = tags_row.iterator();
				   	  	while (iterator.hasNext()) {
				   	  WebElement next = iterator.next();
				   	  if(next.getAttribute("href").contains("CashPaymentEdit")) {
				   	  next.click();
				                  break;
			      		              }
				   	  			}
				    		}
				    	}
			         }
			       } catch (Exception e) {
			          if (e.getMessage().contains("element is not attached")) {
			           breakIt = false;
			        }
			     }
			       if (breakIt) {
			         break;
			      }
			    }	
			}
	
	
}

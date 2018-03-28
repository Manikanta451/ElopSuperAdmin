package com.sa.pagefactory;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApprovePaymentorCredit extends CommonBase {

	public ApprovePaymentorCredit(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[5]/a/span")
	public static WebElement Applypayment;
	
	
	
	public void paymentcredit()throws Exception{
		
		        waitForSeconds(3);
		        Applypayment.click();
		        webtablehandle();
		       
		
		
		
	}
	
	public void webtablehandle()throws Exception{

				boolean breakIt = true;
				while (true) {
				breakIt = true;
				try {
				WebElement mytable = driver.findElement(By.id("sample_StudentVocher"));
				List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
				int rows_count = rows_table.size();
				for (int row =0; row < rows_count; row++) {
				List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
				int columns_count = Columns_row.size();
				System.out.println("Number of cells In Row " + row + " are " + columns_count);
				 for (int column = 0; column < columns_count; column++) {
					String celtext = Columns_row.get(column).getText();
				    System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
				    WebElement approve=driver.findElement(By.id("AcceptAll"));
			    	if (row == 1 && column == 5) {
			    		approve.isDisplayed();
			    		approve.click();
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

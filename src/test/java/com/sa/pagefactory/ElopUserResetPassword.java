package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElopUserResetPassword extends CreateElopUser {

	public ElopUserResetPassword(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void resetpassword()throws Exception{
		
		        waitForSeconds(3);
		        Elopusers.click();
		        waitForSeconds(3);
		        webtablehandle();
		        
	}
	
	public void webtablehandle()throws Exception{

		try {
				WebElement mytable = driver.findElement(By.id("Sample_centerlist"));
				List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
				int rows_count = rows_table.size();
				    for (int row =0; row < rows_count; row++) {
				List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
				int columns_count = Columns_row.size();
					for (int column = 0; column < columns_count; column++) {
			    	   if (row == 1 && column == 7) {
			   	List < WebElement > tags_row = Columns_row.get(7).findElements(By.tagName("a"));
			   	Iterator<WebElement> iterator = tags_row.iterator();
			   	 	while (iterator.hasNext()) {
			   	  WebElement next = iterator.next();
			   	     if(next.getAttribute("href").contains("AdminResetPassword")) {
			   	         next.click();
			   	            break;
		      		              }		   	
			   	  			}
	    		        }    	
			    	}
		         }
		       } catch (Exception e) {	
		    	   System.out.println(e.getMessage());
		        }
		    }						
}
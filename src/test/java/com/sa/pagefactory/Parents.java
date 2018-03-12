package com.sa.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sa.pageobjects.ParentsPageObjects;

public class Parents extends ParentsPageObjects {

	public Parents(WebDriver driver) {
		super(driver);
		
	}
	
	public void parentslist()throws Exception {
		
		        waitForSeconds(3);
		        Parents.click();
		        waitForSeconds(1);
		        webtablehandle();
		       /* EditParent.click();
		        waitForSeconds(5);
		        StudentsList.click();
		        waitForSeconds(3);
		        BacktoList.click();
		        waitForSeconds(8);
		        PareentsExport.click();*/
		        
		        
	}

	public void webtablehandle()throws Exception{
		
		boolean breakIt = true;
        while (true) {
        breakIt = true;
        try {
        	WebElement mytable = driver.findElement(By.id("Sample_parentlist"));
			List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
			int rows_count = rows_table.size();
			for (int row = 0; row < rows_count; row++) {
			List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
	        int columns_count = Columns_row.size();
	        //System.out.println("Number of cells In Row " + row + " are " + columns_count);
	        for (int column = 0; column < columns_count; column++) {
	       // String celtext = Columns_row.get(column).getText();
	        //System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	        	if(row==2 && column==7){
    	        	EditParent.click();
    	        	
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
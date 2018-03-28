package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AdmitStudent extends CommonBase {

	public AdmitStudent(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[10]/a/span")
	public static WebElement AdmitStudent;
	
	
	
	public void admitstudentfromwl()throws Exception{
		
				waitForSeconds(5);
				AdmitStudent.click();
				waitForSeconds(10);
				statuschange();
				
	   }
	
	public void statuschange()throws Exception{
		
		

			boolean breakIt = true;
			while (true) {
			breakIt = true;
			try {
				System.out.println("                      ");
			WebElement mytable = driver.findElement(By.id("sample_List"));
			List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
			int rows_count = rows_table.size();
			for (int row =0; row < rows_count; row++) {
			List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			int columns_count = Columns_row.size();
			//System.out.println("Number of cells In Row " + row + " are " + columns_count);
				for (int column = 0; column < columns_count; column++) {
		    //String celtext = Columns_row.get(column).getText();
		    //System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
				
		    	if (row == 1 && column == 7) {
		   	List < WebElement > tags_row = Columns_row.get(7).findElements(By.tagName("a"));
		   	System.out.println(tags_row);
		   	Iterator<WebElement> iterator = tags_row.iterator();
		   	  	while (iterator.hasNext()) {
		   	  WebElement next = iterator.next();
		   	  if(next.getAttribute("href").contains("javascript:void(0);")) {
		   	  next.click();
		   	  waitForSeconds(1);
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



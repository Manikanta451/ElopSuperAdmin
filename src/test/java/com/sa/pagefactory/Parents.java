package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Parents extends CommonBase {

	public Parents(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[1]/div/ul/li[8]/a/span")
	public static WebElement Parents;
	
	@FindBy(how = How.CLASS_NAME,using = "Iconedit")
	public static WebElement EditParent;
									  
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/ul/li[2]/a)")
	public static WebElement StudentsList;
									  
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/a")
	public static WebElement BacktoList;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div[1]/a/div/embed")
	public static WebElement PareentsExport;
	
	public void parentslist()throws Exception {
		
		        waitForSeconds(3);
		        Parents.click();
		        waitForSeconds(8);
		        webtablehandle();
		        tabhandle();
		        waitForSeconds(3);		       
		        BacktoList.click();
		        /*waitForSeconds(8);
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
				for (int row =0; row < rows_count; row++) {
				List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
				int columns_count = Columns_row.size();
				//System.out.println("Number of cells In Row " + row + " are " + columns_count);
					for (int column = 0; column < columns_count; column++) {
			    /*String celtext = Columns_row.get(column).getText();
			    System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);*/
			    	if (row == 5 && column == 7) {
			   	List < WebElement > tags_row = Columns_row.get(7).findElements(By.tagName("a"));
			   	Iterator<WebElement> iterator = tags_row.iterator();
			   	  	while (iterator.hasNext()) {
			   	  WebElement next = iterator.next();
			   	  if(next.getAttribute("href").contains("Edit")) {
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
    
    public void tabhandle()throws Exception{
    	
    	        try {
					waitForSeconds(2);
					WebElement tab = driver.findElement(By.cssSelector(".portlet-body.form"));
					List < WebElement > rows_table = tab.findElements(By.tagName("a"));
					Iterator<WebElement> iterator = rows_table.iterator();
			   	  	while (iterator.hasNext()) {
			   	        WebElement next = iterator.next();			   	        
			   	        if(next.getAttribute("href").contains("#tab_StudentList")) {
			   	           next.click();
			                  break;
	          		              }
			   	  	}
				} catch (Exception e) {
					e.printStackTrace();
				}
           }
    
        public void export()throws Exception{
        	
        	       waitForSeconds(5);
        	       if (PareentsExport.isEnabled()) {
        	    	   PareentsExport.click();
					}else{
						System.out.println("Export to Excel button is not enabled please enable in your browser");
					}
        }
}

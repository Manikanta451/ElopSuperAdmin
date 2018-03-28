package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.datainitialization.DataInt;

public class EditDHSVoucher extends CreateDHSVoucher {

	public EditDHSVoucher(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr/td[8]/a")	  
	public  static WebElement dhsEdit;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[7]/div/input")	  
	public  static WebElement dhsupdate;
	
	@FindBy(how = How.ID, using = "Amountperweek")	  
	public  static WebElement Amountperweek;
	
	public void DHSVoucheredit(DataInt dataInt)throws Exception{
		
					DHSVoucher.click();
					waitForSeconds(8);
					webtablehandle();					
					waitForSeconds(1);
					Amountperweek.clear();
					waitForSeconds(1);
					Amountperweek.sendKeys(dataInt.getAmountperweek());
					waitForSeconds(2);
					dhsupdate.click();
		
	         }

	public void webtablehandle()throws Exception{

					boolean breakIt = true;
					while (true) {
					breakIt = true;
					try {						
					WebElement mytable = driver.findElement(By.id("sample_CourseList"));
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
	
}

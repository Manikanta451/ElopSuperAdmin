package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditMenuMeal  extends CreateMenuMeal{

	public EditMenuMeal(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")
	public static WebElement edittmenumeal;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/input")
	public static WebElement updatetmenumeal;
	
	public void menumealedit()throws Exception{
			
				waitForSeconds(4);
				menumeal.click();
				waitForSeconds(2);
				webtablehandle();
				waitForSeconds(1);
				mealitem.clear();
				waitForSeconds(1);
				mealitem.sendKeys("Grizzlies Grabber");
				waitForSeconds(1);
				isactive(IsActive);
				//updatetmenumeal.click();
			
		
	}
	
	public void isactive(WebElement element)throws Exception {
		
				if (element.isSelected()) {
				element.click();	
				}else{
				element.click();	
				}		
			}
	
	public void webtablehandle()throws Exception{

				boolean breakIt = true;
				while (true) {
				breakIt = true;
				try {						
				WebElement mytable = driver.findElement(By.id("sample_editable_Meals1_reordering"));
				List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
				int rows_count = rows_table.size();
				for (int row =0; row < rows_count; row++) {
				List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
				int columns_count = Columns_row.size();
				System.out.println("Number of cells In Row " + row + " are " + columns_count);
				 for (int column = 0; column < columns_count; column++) {
					 String celtext = Columns_row.get(column).getText();
					 System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			    	if (row == 1 && column == 3) {
			   	List < WebElement > tags_row = Columns_row.get(3).findElements(By.tagName("a"));
			   	Iterator<WebElement> iterator = tags_row.iterator();
			   	  	while (iterator.hasNext()) {
			   	  WebElement next = iterator.next();
			   	  if(next.getAttribute("href").contains("EditMealitem")) {
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



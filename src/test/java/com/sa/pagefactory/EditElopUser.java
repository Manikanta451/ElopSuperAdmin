package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class EditElopUser  extends CreateElopUser{

	public EditElopUser(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[11]/div/input")
	public static WebElement ElopUserUpdate;
	
	public void  editelopuser(DataInt dataInt) throws Exception{
		
				waitForSeconds(3);
				Elopusers.click();
				waitForSeconds(2);
				webtablehandle();
				waitForSeconds(1);
				ElopUserFirstName.clear();
				waitForSeconds(1);
				ElopUserFirstName.sendKeys(dataInt.getElopUserFirstName());
				waitForSeconds(1);
				ElopUserLastName.clear();
				waitForSeconds(1);
				ElopUserLastName.sendKeys(dataInt.getElopUserLastName());
				ElopUserPhoneNumber.clear();
				waitForSeconds(1);
				ElopUserPhoneNumber.sendKeys(dataInt.getElopUserPhoneNumber());
				waitForSeconds(1);
				ElopUserAddress1.clear();
				waitForSeconds(1);
				ElopUserAddress1.sendKeys(dataInt.getElopUserAddress1());
				waitForSeconds(1);
				ElopUserAddress2.clear();
				waitForSeconds(1);
				ElopUserAddress2.sendKeys(dataInt.getElopUserAddress2());
				waitForSeconds(1);
				ElopUserCity.clear();
				waitForSeconds(1);
				ElopUserCity.sendKeys(dataInt.getElopUserCity());
				waitForSeconds(1);
				ElopUserZipCode.clear();
				waitForSeconds(1);
				ElopUserZipCode.sendKeys(dataInt.getElopUserZipCode());
				waitForSeconds(3);
				ElopUserUpdate.click();
				
	}
	
	public void webtablehandle()throws Exception{

				boolean breakIt = true;
				while (true) {
				breakIt = true;
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

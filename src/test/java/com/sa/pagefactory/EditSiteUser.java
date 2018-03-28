package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.datainitialization.DataInt;

public class EditSiteUser extends CreateSiteUser{

	public EditSiteUser(WebDriver driver) {
		super(driver);
	}

	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[11]/div/input")
	public static WebElement SiteUserUpdate;
	
	public void siteuseredit(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					SiteUsers.click();
					webtablehandle();
					SiteUserFirstName.clear();
					waitForSeconds(1);
					SiteUserFirstName.sendKeys(dataInt.getSiteUserFirstName());
					waitForSeconds(1);
					SiteUserLastName.clear();
					waitForSeconds(1);
					SiteUserLastName.sendKeys(dataInt.getSiteUserLastName());
					waitForSeconds(1);
					SiteUserPhoneNumber.clear();
					waitForSeconds(1);
					SiteUserPhoneNumber.sendKeys(dataInt.getSiteUserPhoneNumber());
					waitForSeconds(1);
					SiteUserAddress1.clear();
					waitForSeconds(1);
					SiteUserAddress1.sendKeys(dataInt.getSiteUserAddress1());
					waitForSeconds(1);
					SiteuserAddress2.clear();
					waitForSeconds(1);
					SiteuserAddress2.sendKeys(dataInt.getSiteuserAddress2());
					waitForSeconds(1);
					SiteUserCity.clear();
					waitForSeconds(1);
					SiteUserCity.sendKeys(dataInt.getSiteUserCity());
					SiteUserZipCode.clear();
					waitForSeconds(1);
					SiteUserZipCode.sendKeys(dataInt.getSiteUserZipCode());
					waitForSeconds(2);
					//SiteUserUpdate.click();
					
		
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
				   	  if(next.getAttribute("href").contains("EditSite")) {
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

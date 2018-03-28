package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.datainitialization.DataInt;

public class EditSite extends CreateSite{

	public EditSite(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(how = How.XPATH, using = "	/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[12]/div/input")
	public static WebElement UpdateSite;
	
	public void editsites(DataInt dataInt)throws Exception{
				
				waitForSeconds(5);
				ElopSites.click();
				waitForSeconds(4);
				webtablehandle();
				waitForSeconds(1);
				SiteName.clear();
				waitForSeconds(1);
				SiteName.sendKeys(dataInt.getSiteName());
		        waitForSeconds(1);
		        SiteSupervisor.clear();
		        waitForSeconds(1);
		        SiteSupervisor.sendKeys(dataInt.getSiteSupervisor());
		        waitForSeconds(1);
		        SiteLocationCode.clear();
		        waitForSeconds(1);
		        SiteLocationCode.sendKeys(dataInt.getSiteLocationCode());
		        waitForSeconds(1);
		        SitePhoneNumber.clear();
		        waitForSeconds(1);
		        SitePhoneNumber.sendKeys(dataInt.getSitePhoneNumber());
		        waitForSeconds(1);
		        SiteAddress.clear();
		        waitForSeconds(1);
		        SiteAddress.sendKeys(dataInt.getSiteAddress());
		        waitForSeconds(1);
		        SiteCity.clear();
		        waitForSeconds(1);
		        SiteCity.sendKeys(dataInt.getSiteCity());
		        waitForSeconds(1);
		        SiteZipcode.clear();
		        waitForSeconds(1);
		        SiteZipcode.sendKeys(dataInt.getSiteZipcode());
		        waitForSeconds(1);
		        SiteFaxNumber.clear();
		        waitForSeconds(1);
		        SiteFaxNumber.sendKeys(dataInt.getSiteFaxNumber());
		        waitForSeconds(2);
		        UpdateSite.click();	
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
				System.out.println("Number of cells In Row " + row + " are " + columns_count);
				 for (int column = 0; column < columns_count; column++) {
					 String celtext = Columns_row.get(column).getText();
					 System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			    	if (row == 1 && column == 6) {
			   	List < WebElement > tags_row = Columns_row.get(6).findElements(By.tagName("a"));
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

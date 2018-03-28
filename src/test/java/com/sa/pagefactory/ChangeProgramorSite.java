package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangeProgramorSite extends CommonBase{

	public ChangeProgramorSite(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[11]/a/span")	  
	public  static WebElement Changeprogramsite;
	
	@FindBy(how = How.ID,using = "CareId")
	public static WebElement Program;
	
	@FindBy(how = How.ID,using = "ProcessType")
	public static WebElement Status;
	
	@FindBy(how = How.ID,using = "SiteId")
	public static WebElement SiteName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/a/div/embed")	  
	public  static WebElement ExportChangeprogramsite;
	
	
	@FindBy(how = How.ID, using = "ancUpdateStudentRecord")	  
	public  static WebElement Updaterogramsite;
	
	public void progrmorsite() throws Exception{
		
						waitForSeconds(2);
						Changeprogramsite.click();
						waitForSeconds(9);
						webtablehandle();
						Updaterogramsite.click();
						waitForSeconds(2);
						checkAlert();
				
	}
	
	public void webtablehandle()throws Exception{

						boolean breakIt = true;
						while (true) {
						breakIt = true;
						try {
						WebElement mytable = driver.findElement(By.id("sample_List"));
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
					   	  if(next.getAttribute("href").contains("EditProgramsitenamechange")) {
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

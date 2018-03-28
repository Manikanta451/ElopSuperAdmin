package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DeleteSite  extends CommonBase{

	public DeleteSite(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[6]/a")
	public static WebElement ElopSites;
	
	
	public void sitedelete()throws Exception{
		
				      waitForSeconds(3);
				      ElopSites.click();
				      tablehandle();
				
	}
	
	public void tablehandle()throws Exception{
		
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
				       			System.out.println("loop start");
				      List < WebElement > tags_row = Columns_row.get(6).findElements(By.tagName("a"));
				   	  Iterator<WebElement> iterator = tags_row.iterator();
				   	  String[] delId;
				   	  while (iterator.hasNext()) {
				   		  System.out.println("whileloopstart");
				   	  WebElement next = iterator.next();
				   	  if(next.getAttribute("href").contains("Edit")) {
				   	  String getId =  next.getAttribute("href");
				   	  delId = getId.split("Id=");
				   	  System.out.println(delId[1]);
				   	    //*[@id="95"]/td[7]/button
				   	//String dynamic = "//*[@id=\"commond_".concat(delId[1]).concat("\"]/button");		 
				   	String dynamic = "//*[@id=\"".concat(delId[1]).concat("\"]/td[7]/button");		 
				   	  System.out.println(dynamic);
				   	  driver.findElement(By.xpath(dynamic)).click();
				   	     }
				   	     	break;	 
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
				      checkAlert();
				}
				
}

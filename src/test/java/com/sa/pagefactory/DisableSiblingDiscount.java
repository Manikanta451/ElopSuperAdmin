package com.sa.pagefactory;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisableSiblingDiscount extends CreateSiblingDiscount {

	public DisableSiblingDiscount(WebDriver driver) {
		super(driver);
	}
	
	public void inActive()throws Exception{
		
						
					  waitForSeconds(3);
					  Siblingdiscount.click();
					  waitForSeconds(2);
					  tablehandle();
					
					
		
		
	}

	public void tablehandle()throws Exception{
		
					  boolean breakIt = true;
				      while (true) {
				      breakIt = true;
				      try {
				      WebElement mytable = driver.findElement(By.id("sible_list"));
				      List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
				      int rows_count = rows_table.size();
				      for (int row =0; row < rows_count; row++) {
				      List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
				      int columns_count = Columns_row.size();
				      //System.out.println("Number of cells In Row " + row + " are " + columns_count);
				      for (int column = 0; column < columns_count; column++) {
				     // String celtext = Columns_row.get(column).getText();
				      //System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
				       		if (row == 1 && column == 5) {				       			
				      List < WebElement > tags_row = Columns_row.get(5).findElements(By.tagName("a"));
				   	  Iterator<WebElement> iterator = tags_row.iterator();
				   	  String[] delId;
				   	  while (iterator.hasNext()) {
				   	  WebElement next = iterator.next();
				   	  if(next.getAttribute("href").contains("SiblingDiscoundEdit")) {
				   	  String getId =  next.getAttribute("href");
				   	  delId = getId.split("Id=");
				   	  //System.out.println(delId[1]);	
				   	  String dynamic = "//*[@id=\"comond_".concat(delId[1]).concat("\"]/button");		   	  
				   	  //System.out.println(dynamic);
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
				      
				}
}

package com.sa.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class CreateWeekOff extends CommonBase{

	public CreateWeekOff(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[19]/a")
	public static WebElement weekoffclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")
	public static WebElement weekoffcreate;
	
	@FindBy(how = How.ID, using = "Date")
	public static WebElement Date;
	
	@FindBy(how = How.ID, using = "Title")
	public static WebElement Title;
	
	@FindBy(how = How.ID, using = "mceu_21")
	public static WebElement description;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[3]/div/div")
	public static WebElement desc;
	
	@FindBy(how = How.ID, using = "IsActive")
	public static WebElement active;
	
	@FindBy(how = How.ID, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[6]/div/input")
	public static WebElement submitweekoff;

	
	public void weekoff(DataInt dataInt )throws Exception{
				
				waitForSeconds(4);
				weekoffclick.click();
				waitForSeconds(3);
				weekoffcreate.click();
				waitForSeconds(4);
				Date.click();
				waitForSeconds(1);
				expiryDate();
				waitForSeconds(1);
				Title.sendKeys(dataInt.getTitle());
				senddescription(dataInt);
				waitForSeconds(2);
				active.click();
				//submitweekoff.click();

			}
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(description);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getDescription());
				actions.build().perform();
			}
	
	public void expiryDate() throws InterruptedException{
		
		try {
			  dateNotFound = true;						 
			  //Set your expected date, month and year.  
			  expDate = "8";
			  expMonth= 10;
			  expYear = 2018;
			  
			  //This loop will be executed continuously till dateNotFound Is true.
			  while(dateNotFound){
			   //Retrieve current selected month name from date picker popup.
			   calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			   System.out.println(calMonth);
			   //Retrieve current selected year name from date picker popup.
			   calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			   System.out.println(calYear);
			   //If current selected month and year are same as expected month and year then go Inside this condition.
			   if(monthList.indexOf(calMonth)+1 == expMonth && (expYear == Integer.parseInt(calYear))){						   
			    //Call selectDate function with date to select and set dateNotFound flag to false.
			    selectDate(expDate);
			    dateNotFound = false;
			    }
			   //If current selected month and year are less than expected month and year then go Inside this condition.
			   else if(monthList.indexOf(calMonth)+1 < expMonth && (expYear == Integer.parseInt(calYear)) || expYear > Integer.parseInt(calYear))
			   {
			    //Click on next button of date picker.
			    driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			   }
			   //If current selected month and year are greater than expected month and year then go Inside this condition.
			   else if(monthList.indexOf(calMonth)+1 > expMonth && (expYear == Integer.parseInt(calYear)) || expYear < Integer.parseInt(calYear))
			   {
			    //Click on previous button of date picker.
			    driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			   }
			  }
			  
		} catch (Exception e) {
			    e.printStackTrace();
			}
		 } 
		 
	public void selectDate(String date){
		 WebElement datePicker = driver.findElement(By.id("ui-datepicker-div")); 
		  noOfColumns=datePicker.findElements(By.tagName("td"));

		  //Loop will rotate till expected date not found.
		  for (WebElement cell: noOfColumns){
		   //Select the date from date picker when condition match.
		   if (cell.getText().equals(date)){
		    cell.findElement(By.linkText(date)).click();
		    break;
		   }
		  }
		 } 	
}

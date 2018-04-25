package com.sa.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Students extends CommonBase {

	public Students(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[1]/div/ul/li[9]/a")
	public static WebElement Students;
	
	@FindBy(how = How.ID, using = "CareId")
	public static WebElement program;

	@FindBy(how = How.ID, using = "ProcessType")
	public static WebElement status;
	
	@FindBy(how = How.ID,using = "CareId")
	public static WebElement Program;
	
	@FindBy(how = How.ID,using = "ProcessType")
	public static WebElement Status;
	
	@FindBy(how = How.ID,using = "SiteId")
	public static WebElement SiteName;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[9]/a[1]")
	public static WebElement EditStudent;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/div/div/form/div/div[2]/div/div/div[5]/div/input")
	public static WebElement UpdateStudent;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/a/div/embed")
	public static WebElement StudentsExport;
	
	@SuppressWarnings("unused")
	public void studentslist()throws Exception{
		
				waitForSeconds(4);
				Students.click();
				waitForSeconds(8);
				Select dd1 = new Select(program);	
				 List<WebElement> progrmValue = dd1.getOptions();
				 Select dd2 = new Select(SiteName);	
				 List<WebElement> sitename = dd2.getOptions();
				 for(WebElement we:sitename)  {  
				      for (int i=0; i<progrmValue.size(); i++){
				   	  
				          if (we.getText().equals(progrmValue.get(i).getText())){
				          System.out.println("Matched");
				          
				          } else {
				       	  System.out.println("Not Matched");
				          }
				          break;
				   	  
				   	  
				       }
				
				/*Select program = new Select(Program);
				program.selectByVisibleText("Before ONLY");
				waitForSeconds(1);
				Select status = new Select(Status);
				status.selectByVisibleText("Admitted");
				waitForSeconds(1);
				Select sitename = new Select(SiteName);
				sitename.selectByVisibleText("Alcy Elementary ");
				waitForSeconds(5);
				program.selectByVisibleText("ALL");
				waitForSeconds(1);
				status.selectByVisibleText("ALL");
				waitForSeconds(1);
				sitename.selectByVisibleText("ALL");
				waitForSeconds(5);
				EditStudent.click();
				waitForSeconds(5);
				checkAlert();
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)","");
				waitForSeconds(3);
				UpdateStudent.click();
				waitForSeconds(5);
				StudentsExport.click();
	
*/	}

  }
}
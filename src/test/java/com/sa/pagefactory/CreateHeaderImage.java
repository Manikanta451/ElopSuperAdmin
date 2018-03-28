package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class CreateHeaderImage extends CommonBase {

	public CreateHeaderImage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/a/span[1]")	  
	public  static WebElement contentmanagementclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/ul/li[1]/a/span")	  
	public  static WebElement headerimageclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")	  
	public  static WebElement headerimagecreate;
	
	@FindBy(how = How.ID, using = "HeaderImage_Title")	  
	public  static WebElement HeaderImageTitle;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[2]/div/div")	  
	public  static WebElement HeaderImagedesc;
	
	@FindBy(how = How.ID, using = "choose")	  
	public  static WebElement HeaderImageupload;
	
	@FindBy(how = How.ID, using = "HeaderImage_AltTag")	  
	public  static WebElement HeaderImageAltTag;
	
	@FindBy(how = How.ID, using = "HeaderImage_ButtonText")	  
	public  static WebElement HeaderImageButtonText;
	
	@FindBy(how = How.ID, using = "HeaderImage_Url")	  
	public  static WebElement HeaderImageUrl;
	
	@FindBy(how = How.ID, using = "HeaderImage_Ordering")	  
	public  static WebElement HeaderImageOrdering;
	
	@FindBy(how = How.ID, using = "HeaderImage_Opennewwindow")	  
	public  static WebElement HeaderImageOpennewwindow;
	
	@FindBy(how = How.ID, using = "HeaderImage_Active")	  
	public  static WebElement HeaderImageActive;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[11]/div/input")	  
	public  static WebElement HeaderImagesubmit;
	
	
	public void headerimages(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					contentmanagementclick.click();
					waitForSeconds(4);
					headerimageclick.click();
					waitForSeconds(4);
					HeaderImageTitle.sendKeys(dataInt.getHeaderImageTitle());
					waitForSeconds(1);
					senddescription(dataInt);
					waitForSeconds(3);
					HeaderImageupload.click();
					waitForSeconds(1);
					fileupload(imagepath + "\\images\\headerelop.jpg");
					HeaderImageAltTag.sendKeys(dataInt.getHeaderImageAltTag());
					HeaderImageButtonText.sendKeys(dataInt.getHeaderImageButtonText());
					HeaderImageUrl.sendKeys(dataInt.getHeaderImageUrl());
					HeaderImageOrdering.sendKeys(dataInt.getHeaderImageOrdering());
					HeaderImageOpennewwindow.click();
					HeaderImageActive.click();
					waitForSeconds(3);
					//HeaderImagesubmit.click();
			}

	public void senddescription(DataInt dataInt)throws Exception{
					Actions actions = new Actions(driver);
					actions.moveToElement(HeaderImagedesc);
					actions.click();
					waitForSeconds(2);
					actions.sendKeys(dataInt.getHeaderImagedesc());
					actions.build().perform();
				}
		
	
}

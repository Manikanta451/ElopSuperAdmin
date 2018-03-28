package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class CreateNewsandEvents extends CommonBase{

	public CreateNewsandEvents(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/a/span[1]")	  
	public  static WebElement contentmanagementclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/ul/li[3]/a")	  
	public  static WebElement newsandeventsclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div[1]/div/div/div/a")	  
	public  static WebElement newsandeventscreate;
	
	@FindBy(how = How.ID, using = "Title")	  
	public  static WebElement NewsTitle;
	
	@FindBy(how = How.ID, using = "ShortDescription")	  
	public  static WebElement NewsShortDescription;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/form/div/div/div[2]/div/div/div/div[3]/div/div")	  
	public  static WebElement Newsdescription;
	
	@FindBy(how = How.ID, using = "choose")	  
	public  static WebElement newsimageupload;
	
	@FindBy(how = How.ID, using = "ImageAltTag")	  
	public  static WebElement NewsImageAltTag;
	
	@FindBy(how = How.ID, using = "Postdate")	  
	public  static WebElement Postdate;
	
	@FindBy(how = How.ID, using = "Active")	  
	public  static WebElement newsActive;
	
	@FindBy(how = How.ID, using = "MetaTitle")	  
	public  static WebElement NewsMetaTitle;
	
	@FindBy(how = How.ID, using = "Metakeywords")	  
	public  static WebElement NewsMetakeywords;
	
	@FindBy(how = How.ID, using = "Metadescription")	  
	public  static WebElement NewsMetadescription;
	
	@FindBy(how = How.ID, using = "headerSubmit")	  
	public  static WebElement newsSubmit;
	

	public void newsevents(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				contentmanagementclick.click();
				waitForSeconds(4);
				newsandeventsclick.click();
				waitForSeconds(4);
				newsandeventscreate.click();
				waitForSeconds(4);
				NewsTitle.sendKeys(dataInt.getNewsTitle());
				NewsShortDescription.sendKeys(dataInt.getNewsShortDescription());
				senddescription(dataInt);
				newsimageupload.click();
				waitForSeconds(1);
				fileupload(imagepath + "\\images\\News.jpg");
				NewsImageAltTag.sendKeys(dataInt.getNewsImageAltTag());
				Postdate.click();
				waitForSeconds(1);
				systemdateselect();
				newsActive.click();
				NewsMetaTitle.sendKeys(dataInt.getNewsMetaTitle());
				NewsMetakeywords.sendKeys(dataInt.getNewsMetakeywords());
				NewsMetadescription.sendKeys(dataInt.getNewsMetadescription());
				waitForSeconds(3);
				//newsSubmit.click();
				
				
		}
				
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(Newsdescription);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getHeaderImagedesc());
				actions.build().perform();
	}
	
	
}

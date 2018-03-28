package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class CreatePage extends CommonBase {

	public CreatePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/a/span[1]")	  
	public  static WebElement contentmanagementclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/ul/li[2]/a")	  
	public  static WebElement pageclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div/div[2]/div[1]/div/div/div/a")	  
	public  static WebElement pagecreate;
	
	@FindBy(how = How.ID, using = "FriendlyUrl")	  
	public  static WebElement pagefriendlyUrl;
	
	@FindBy(how = How.ID, using = "Title")	  
	public  static WebElement pageTitle;
	
	@FindBy(how = How.ID, using = "Name")	  
	public  static WebElement MenuName;
	
	@FindBy(how = How.ID, using = "HeaderImage")	  
	public  static WebElement BannerImageupload;
	
	@FindBy(how = How.ID, using = "HeaderimageAltTag")	  
	public  static WebElement BannerimageAltTag;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div/form/div/div[7]/div/div")	  
	public  static WebElement Bannerimagedesc;
	
	@FindBy(how = How.ID, using = "MetaTitle")	  
	public  static WebElement PageMetaTitle;
	
	@FindBy(how = How.ID, using = "MetaKeywords")	  
	public  static WebElement PageMetaKeywords;
	
	@FindBy(how = How.ID, using = "MetaDescription")	  
	public  static WebElement PageMetaDescription;
	
	@FindBy(how = How.ID, using = "IsStandalonepage")	  
	public  static WebElement Standalonepage;
	
	@FindBy(how = How.ID, using = "PageOrder")	  
	public  static WebElement PageOrder;
	
	@FindBy(how = How.ID, using = "IsActive")	  
	public  static WebElement bannerIsActive;
	
	@FindBy(how = How.ID, using = "pagesumbitid")	  
	public  static WebElement pagesubmit;


	public void pages(DataInt dataInt)throws Exception{
		
					waitForSeconds(5);
					contentmanagementclick.click();
					waitForSeconds(4);
					pageclick.click();
					waitForSeconds(4);
					pagecreate.click();
					pagefriendlyUrl.sendKeys(dataInt.getPagefriendlyUrl());
					pageTitle.sendKeys(dataInt.getPageTitle());
					MenuName.sendKeys(dataInt.getMenuName());
					BannerImageupload.click();
					waitForSeconds(1);
					fileupload(imagepath + "\\images\\greaterscsbanner.jpg");
					BannerimageAltTag.sendKeys(dataInt.getBannerimageAltTag());
					senddescription(dataInt);
					PageMetaTitle.sendKeys(dataInt.getPageMetaTitle());
					PageMetaKeywords.sendKeys(dataInt.getPageMetaKeywords());
					PageMetaDescription.sendKeys(dataInt.getPageMetaDescription());
					Standalonepage.click();
					PageOrder.sendKeys(dataInt.getPageOrder());
					bannerIsActive.click();
					waitForSeconds(3);
					//pagesubmit.click();
		
		
			}
	public void senddescription(DataInt dataInt)throws Exception{
					Actions actions = new Actions(driver);
					actions.moveToElement(Bannerimagedesc);
					actions.click();
					waitForSeconds(2);
					actions.sendKeys(dataInt.getHeaderImagedesc());
					actions.build().perform();
	}
}

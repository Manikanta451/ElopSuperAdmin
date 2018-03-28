package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class SocialSettings extends CommonBase{

	public SocialSettings(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/a/span[1]")	  
	public  static WebElement contentmanagementclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/ul/li[6]/a")	  
	public  static WebElement socialsettingsclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div[11]/div/a")	  
	public  static WebElement socialsettingsedit;
	
	@FindBy(how = How.ID, using = "Facebook")	  
	public  static WebElement Facebook;
	
	@FindBy(how = How.ID, using = "twitter")	  
	public  static WebElement twitter;
	
	@FindBy(how = How.ID, using = "Instagram")	  
	public  static WebElement Instagram;
	
	@FindBy(how = How.ID, using = "Pinterest")	  
	public  static WebElement Pinterest;
	
	@FindBy(how = How.ID, using = "Youtube")	  
	public  static WebElement Youtube;
	
	@FindBy(how = How.ID, using = "GooglePLUS")	  
	public  static WebElement GooglePLUS;
	
	@FindBy(how = How.ID, using = "Google_Analystic")	  
	public  static WebElement GoogleAnalystic;
	
	@FindBy(how = How.ID, using = "MetaTag_Title")	  
	public  static WebElement SocialMetaTitle;
	
	@FindBy(how = How.ID, using = "MetaTag_Keyword")	  
	public  static WebElement SocialMetaKeyword;
	
	@FindBy(how = How.ID, using = "MetaTag_Desc")	  
	public  static WebElement SocialMetaDesc;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[12]/div/input")	  
	public  static WebElement socialsettingsupdate;

	
	public void settings(DataInt dataInt)throws Exception{
		
				waitForSeconds(5);
				contentmanagementclick.click();
				waitForSeconds(4);
				socialsettingsclick.click();
				waitForSeconds(4);
				socialsettingsedit.click();
				waitForSeconds(4);
				Facebook.clear();
				waitForSeconds(1);
				Facebook.sendKeys(dataInt.getFacebook());
				twitter.clear();
				waitForSeconds(1);
				twitter.sendKeys(dataInt.getTwitter());
				Instagram.clear();
				waitForSeconds(1);
				Instagram.sendKeys(dataInt.getInstagram());
				Pinterest.clear();
				waitForSeconds(1);
				Pinterest.sendKeys(dataInt.getPinterest());
				Youtube.clear();
				waitForSeconds(1);
				Youtube.sendKeys(dataInt.getYoutube());
				GooglePLUS.clear();
				waitForSeconds(1);
				GooglePLUS.sendKeys(dataInt.getGooglePLUS());
				SocialMetaTitle.clear();
				waitForSeconds(1);
				SocialMetaTitle.sendKeys(dataInt.getSocialMetaTitle());
				SocialMetaKeyword.clear();
				waitForSeconds(1);
				SocialMetaKeyword.sendKeys(dataInt.getSocialMetaKeyword());
				SocialMetaDesc.clear();
				waitForSeconds(1);
				SocialMetaDesc.sendKeys(dataInt.getSocialMetaDesc());
				waitForSeconds(3);
				socialsettingsupdate.click();
				
	}

}

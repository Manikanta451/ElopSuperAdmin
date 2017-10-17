package com.sa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sa.pagefactory.CommonBase;

public class ContentManagementPageObjects extends CommonBase{

	public ContentManagementPageObjects(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/a/span[1]")	  
	public  static WebElement contentmanagementclick;
	
	//---Header Image---//
	
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
	
	//--- Page---//
	
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
	
	
	//--- News and Events---//
	
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
	
	//--- About Us Team---//
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/ul/li[22]/ul/li[4]/a/span")	  
	public  static WebElement aboutustreamclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div[1]/div/div/div/a")	  
	public  static WebElement aboutustreamcreate;
	
	@FindBy(how = How.ID, using = "Name")	  
	public  static WebElement TeamName;
	
	@FindBy(how = How.ID, using = "Desgination")	  
	public  static WebElement Desgination;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div[1]/div[3]/div/div")	  
	public  static WebElement Teamdescription;
	
	@FindBy(how = How.ID, using = "choose")	  
	public  static WebElement teamiamgeupload;
	
	@FindBy(how = How.ID, using = "AltTag")	  
	public  static WebElement TeamAltTag;
	
	@FindBy(how = How.ID, using = "DisplayOrder")	  
	public  static WebElement TeamDisplayOrder;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div[1]/div[7]/div/input")	  
	public  static WebElement teamSubmit;
	
	
	//--- Home Aount Us---//
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div[1]/div[7]/div/input")	  
	public  static WebElement homeabtusclick;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/div/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[5]/a")	  
	public  static WebElement homeabtusedit;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[8]/div/input")	  
	public  static WebElement homeabtusupdate;
	
	
	//--- Social Settings---//
	
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
	
	
}

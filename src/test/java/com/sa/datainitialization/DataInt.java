package com.sa.datainitialization;

import java.io.Serializable;

public class DataInt implements Serializable {

	
	private static final long serialVersionUID = -5841500346110682370L;
	
		
	
			// ---Login------//
					
					public String Email ="";
					
					public String Password ="";
					
					
			//----- Elop User ------//
					
					public String ElopUserFirstName ="";
					
					public String ElopUserMiddleName ="";

					public String ElopUserLastName ="";

					public String ElopUserEmailId ="";
					
					public String ElopUserPassWord ="";
					
					public String ElopUserPhoneNumber ="";
					
					public String ElopUserAddress1 ="";
					
					public String ElopUserAddress2 ="";
					
					public String ElopUserCity ="";
					
					public String ElopUserZipCode ="";

		//----- Site-----//
					
					public String SiteName ="";
					
					public String SiteType ="";
					
					public String SiteSupervisor ="";
					
					public String SiteLocationCode ="";
					
					public String SitePhoneNumber ="";
					
					public String SiteAddress ="";
					
					public String SiteCity ="";
					
					public String SiteZipcode ="";
					
					public String SiteFaxNumber ="";
					
		//------ SiteUser-----//
					
					public String SchoolName ="";
					
					public String SiteUserFirstName ="";
					
					public String SiteUserMiddleName ="";
					
					public String SiteUserLastName ="";
					
					public String SiteuserPassWord ="";
					
					public String SiteUserPhoneNumber ="";
					
					public String SiteUserAddress1 ="";
					
					public String SiteuserAddress2 ="";
					
					public String SiteUserCity ="";
					
					public String SiteUserZipCode ="";
					
		//---- DHS Voucher----//
				
					public String StateID="";
					
					public String Vouchername ="";
					
					public String Amountperweek ="";
					
		//--- Pending Payments----//
					
					public String ParentId="";
					
					public String StudentFormId="";
					
					public String WeeklyFee="";
					
					public String LateFee="";
					
					public String RegistationFee="";
					
					public String LateFeeMin="";
					
		//----- SiblingDIscount-----//
					
					public String Parents="";
					
					public String Student="";
					
					public String SiblingDiscount="";
					
		//----- WeekOff------//
					
					public String Title="";
					
					public String Description="";
					
					
		//---- Site Info-----//
					
					public String siteinfositename="";
					
					public String siteinfoSiteTypeId="";
					
					public String WeekStartTime="";
					
					public String WeekStartAMPM="";
					
					public String WeekEndTime="";
					
					public String WeekEndAMPM="";
					
					public String Maxcapacity="";
					
					public String MealsOrdered="";
					
					public String SiteInfoWeeklyRate="";
					
					public String SiteinfoLateFee="";
					
					public String SiteinfoRegistraionFee="";
					
					public String SiteInfoLatefeeforeveryminute="";
					
		//--- Content Management ---//
					
					public String HeaderImageTitle="";
					
					public String HeaderImagedesc="";
					
					public String HeaderImageAltTag="";
					
					public String HeaderImageButtonText="";
					
					public String HeaderImageUrl="";
					
					public String HeaderImageOrdering="";
					
					public String PagefriendlyUrl="";
					
					public String PageTitle="";
					
					public String MenuName="";
					
					public String BannerimageAltTag="";
					
					public String Bannerimagedesc="";
					
					public String PageMetaTitle="";
					
					public String PageMetaKeywords="";
					
					public String PageMetaDescription="";
					
					public String PageOrder="";
					
					public String NewsTitle="";
					
					public String NewsShortDescription="";
					
					public String Newsdescription="";
					
					public String NewsImageAltTag="";
					
					public String NewsMetaTitle="";
					
					public String NewsMetakeywords="";
					
					public String NewsMetadescription="";
					
					public String TeamName="";
					
					public String Desgination="";
					
					public String Teamdescription="";
					
					public String TeamAltTag="";
					
					public String TeamDisplayOrder="";
					
					public String Facebook="";
					
					public String Twitter="";
					
					public String Instagram="";
					
					public String Pinterest="";
					
					public String Youtube="";
					
					public String GooglePLUS="";
					
					public String GoogleAnalystic="";
					
					public String SocialMetaTitle="";
					
					public String SocialMetaKeyword="";
					
					public String SocialMetaDesc="";
					
		//--- Admin Profile ---//
					
					public String AdminFirstName="";
					
					public String AdminLastName="";
					
					public String AdminPhoneNumber="";
					
					public String AdminAddress1="";
					
					public String AdminAddress2="";
					
					public String AdminCity="";
					
					public String AdminZipCode="";
					
					public String AdminPassword="";
					
					public String AdminNewPassword="";
					
					public String AdminConfirmPassword="";
					
					
					
					
					
					
	     //----Login Getter and  Setters-------//			
	 				
					
					
					public String getEmail() {
						return Email;
					}
					
					public void setEmail(String email) {
						Email = email;
					}
					public String getPassword() {
						return Password;
					}
					public void setPassword(String password) {
						Password = password;
					}
					
		 //----- Elop User Getter&Setter Methods ------//		
	 				
					public String getElopUserFirstName() {
						return ElopUserFirstName;
					}
					public void setElopUserFirstName(String elopUserFirstName) {
						ElopUserFirstName = elopUserFirstName;
					}
					public String getElopUserMiddleName() {
						return ElopUserMiddleName;
					}
					public void setElopUserMiddleName(String elopUserMiddleName) {
						ElopUserMiddleName = elopUserMiddleName;
					}
					public String getElopUserLastName() {
						return ElopUserLastName;
					}
					public void setElopUserLastName(String elopUserLastName) {
						ElopUserLastName = elopUserLastName;
					}
					public String getElopUserEmailId() {
						return ElopUserEmailId;
					}
					public void setElopUserEmailId(String elopUserEmailId) {
						ElopUserEmailId = elopUserEmailId;
					}
					public String getElopUserPassWord() {
						return ElopUserPassWord;
					}
					public void setElopUserPassWord(String elopUserPassWord) {
						ElopUserPassWord = elopUserPassWord;
					}
					public String getElopUserPhoneNumber() {
						return ElopUserPhoneNumber;
					}
					public void setElopUserPhoneNumber(String elopUserPhoneNumber) {
						ElopUserPhoneNumber = elopUserPhoneNumber;
					}
					public String getElopUserAddress1() {
						return ElopUserAddress1;
					}
					public void setElopUserAddress1(String elopUserAddress1) {
						ElopUserAddress1 = elopUserAddress1;
					}
					public String getElopUserAddress2() {
						return ElopUserAddress2;
					}
					public void setElopUserAddress2(String elopUserAddress2) {
						ElopUserAddress2 = elopUserAddress2;
					}
					public String getElopUserCity() {
						return ElopUserCity;
					}
					public void setElopUserCity(String elopUserCity) {
						ElopUserCity = elopUserCity;
					}
					public String getElopUserZipCode() {
						return ElopUserZipCode;
					}
					public void setElopUserZipCode(String elopUserZipCode) {
						ElopUserZipCode = elopUserZipCode;
					}
					
		// ----Site Getter and Setter Methods----//
					
					public String getSiteName() {
						return SiteName;
					}
					public void setSiteName(String siteName) {
						SiteName = siteName;
					}
					public String getSiteType() {
						return SiteType;
					}
					public void setSiteType(String siteType) {
						SiteType = siteType;
					}
					public String getSiteSupervisor() {
						return SiteSupervisor;
					}
					public void setSiteSupervisor(String siteSupervisor) {
						SiteSupervisor = siteSupervisor;
					}
					public String getSiteLocationCode() {
						return SiteLocationCode;
					}
					public void setSiteLocationCode(String siteLocationCode) {
						SiteLocationCode = siteLocationCode;
					}
					public String getSitePhoneNumber() {
						return SitePhoneNumber;
					}
					public void setSitePhoneNumber(String sitePhoneNumber) {
						SitePhoneNumber = sitePhoneNumber;
					}
					public String getSiteAddress() {
						return SiteAddress;
					}
					public void setSiteAddress(String siteAddress) {
						SiteAddress = siteAddress;
					}
					public String getSiteCity() {
						return SiteCity;
					}
					public void setSiteCity(String siteCity) {
						SiteCity = siteCity;
					}
					public String getSiteZipcode() {
						return SiteZipcode;
					}
					public void setSiteZipcode(String siteZipcode) {
						SiteZipcode = siteZipcode;
					}
					public String getSiteFaxNumber() {
						return SiteFaxNumber;
					}
					public void setSiteFaxNumber(String siteFaxNumber) {
						SiteFaxNumber = siteFaxNumber;
					}
					
					
	//----- SiteUser Getter&Setter Methods----//
					
					public String getSchoolName() {
						return SchoolName;
					}
					public void setSchoolName(String schoolName) {
						SchoolName = schoolName;
					}
					public String getSiteUserFirstName() {
						return SiteUserFirstName;
					}
					public void setSiteUserFirstName(String siteUserFirstName) {
						SiteUserFirstName = siteUserFirstName;
					}
					public String getSiteUserMiddleName() {
						return SiteUserMiddleName;
					}
					public void setSiteUserMiddleName(String siteUserMiddleName) {
						SiteUserMiddleName = siteUserMiddleName;
					}
					public String getSiteUserLastName() {
						return SiteUserLastName;
					}
					public void setSiteUserLastName(String siteUserLastName) {
						SiteUserLastName = siteUserLastName;
					}
					public String getSiteuserPassWord() {
						return SiteuserPassWord;
					}
					public void setSiteuserPassWord(String siteuserPassWord) {
						SiteuserPassWord = siteuserPassWord;
					}
					public String getSiteUserPhoneNumber() {
						return SiteUserPhoneNumber;
					}
					public void setSiteUserPhoneNumber(String siteUserPhoneNumber) {
						SiteUserPhoneNumber = siteUserPhoneNumber;
					}
					public String getSiteUserAddress1() {
						return SiteUserAddress1;
					}
					public void setSiteUserAddress1(String siteUserAddress1) {
						SiteUserAddress1 = siteUserAddress1;
					}
					public String getSiteuserAddress2() {
						return SiteuserAddress2;
					}
					public void setSiteuserAddress2(String siteuserAddress2) {
						SiteuserAddress2 = siteuserAddress2;
					}
					public String getSiteUserCity() {
						return SiteUserCity;
					}
					public void setSiteUserCity(String siteUserCity) {
						SiteUserCity = siteUserCity;
					}
					public String getSiteUserZipCode() {
						return SiteUserZipCode;
					}
					public void setSiteUserZipCode(String siteUserZipCode) {
						SiteUserZipCode = siteUserZipCode;
					}
					
		//------ DHS Voucher getter &Setter Methods------//
					
					
					public String getStateID() {
						return StateID;
					}
					public void setStateID(String stateID) {
						StateID = stateID;
					}
					public String getVouchername() {
						return Vouchername;
					}
					public void setVouchername(String vouchername) {
						Vouchername = vouchername;
					}
					public String getAmountperweek() {
						return Amountperweek;
					}
					public void setAmountperweek(String amountperweek) {
						Amountperweek = amountperweek;
					}
	  //--------- Pending payment Getter & setter Methods-------//
					
					
					public String getParentId() {
						return ParentId;
					}
					public void setParentId(String parentId) {
						ParentId = parentId;
					}
					public String getStudentFormId() {
						return StudentFormId;
					}
					public void setStudentFormId(String studentFormId) {
						StudentFormId = studentFormId;
					}
					public String getWeeklyFee() {
						return WeeklyFee;
					}
					public void setWeeklyFee(String weeklyFee) {
						WeeklyFee = weeklyFee;
					}
					public String getLateFee() {
						return LateFee;
					}
					public void setLateFee(String lateFee) {
						LateFee = lateFee;
					}
					public String getRegistationFee() {
						return RegistationFee;
					}
					public void setRegistationFee(String registationFee) {
						RegistationFee = registationFee;
					}
					public String getLateFeeMin() {
						return LateFeeMin;
					}
					public void setLateFeeMin(String lateFeeMin) {
						LateFeeMin = lateFeeMin;
					}
					
					
			// ---Sibling Discount Getter & Setter Methods---//
					
					
					public String getParents() {
						return Parents;
					}
					public void setParents(String parents) {
						Parents = parents;
					}
					public String getStudent() {
						return Student;
					}
					public void setStudent(String student) {
						Student = student;
					}
					public String getSiblingDiscount() {
						return SiblingDiscount;
					}
					public void setSiblingDiscount(String siblingDiscount) {
						SiblingDiscount = siblingDiscount;
					}
					
					
			// --WeekOff Getter & Setter Methods ---//
					
					
					public String getTitle() {
						return Title;
					}
					public void setTitle(String title) {
						Title = title;
					}
					public String getDescription() {
						return Description;
					}
					public void setDescription(String description) {
						Description = description;
					}
					
			//---- Site Info Getter & setter Methods---//
					
					
					public String getSiteinfositename() {
						return siteinfositename;
					}
					public void setSiteinfositename(String siteinfositename) {
						this.siteinfositename = siteinfositename;
					}
					public String getSiteinfoSiteTypeId() {
						return siteinfoSiteTypeId;
					}
					public void setSiteinfoSiteTypeId(String siteinfoSiteTypeId) {
						this.siteinfoSiteTypeId = siteinfoSiteTypeId;
					}
					public String getWeekStartTime() {
						return WeekStartTime;
					}
					public void setWeekStartTime(String weekStartTime) {
						WeekStartTime = weekStartTime;
					}
					public String getWeekStartAMPM() {
						return WeekStartAMPM;
					}
					public void setWeekStartAMPM(String weekStartAMPM) {
						WeekStartAMPM = weekStartAMPM;
					}
					public String getWeekEndTime() {
						return WeekEndTime;
					}
					public void setWeekEndTime(String weekEndTime) {
						WeekEndTime = weekEndTime;
					}
					public String getWeekEndAMPM() {
						return WeekEndAMPM;
					}
					public void setWeekEndAMPM(String weekEndAMPM) {
						WeekEndAMPM = weekEndAMPM;
					}
					public String getMaxcapacity() {
						return Maxcapacity;
					}
					public void setMaxcapacity(String maxcapacity) {
						Maxcapacity = maxcapacity;
					}
					public String getMealsOrdered() {
						return MealsOrdered;
					}
					public void setMealsOrdered(String mealsOrdered) {
						MealsOrdered = mealsOrdered;
					}
					public String getSiteInfoWeeklyRate() {
						return SiteInfoWeeklyRate;
					}
					public void setSiteInfoWeeklyRate(String siteInfoWeeklyRate) {
						SiteInfoWeeklyRate = siteInfoWeeklyRate;
					}
					public String getSiteinfoLateFee() {
						return SiteinfoLateFee;
					}
					public void setSiteinfoLateFee(String siteinfoLateFee) {
						SiteinfoLateFee = siteinfoLateFee;
					}
					public String getSiteinfoRegistraionFee() {
						return SiteinfoRegistraionFee;
					}
					public void setSiteinfoRegistraionFee(String siteinfoRegistraionFee) {
						SiteinfoRegistraionFee = siteinfoRegistraionFee;
					}
					public String getSiteInfoLatefeeforeveryminute() {
						return SiteInfoLatefeeforeveryminute;
					}
					public void setSiteInfoLatefeeforeveryminute(
							String siteInfoLatefeeforeveryminute) {
						SiteInfoLatefeeforeveryminute = siteInfoLatefeeforeveryminute;
					}
					
					
			//--- ContentManagement Getter and setter Methods---//
					
					
					public String getHeaderImageTitle() {
						return HeaderImageTitle;
					}
					public void setHeaderImageTitle(String headerImageTitle) {
						HeaderImageTitle = headerImageTitle;
					}
					public String getHeaderImagedesc() {
						return HeaderImagedesc;
					}
					public void setHeaderImagedesc(String headerImagedesc) {
						HeaderImagedesc = headerImagedesc;
					}
					public String getHeaderImageAltTag() {
						return HeaderImageAltTag;
					}
					public void setHeaderImageAltTag(String headerImageAltTag) {
						HeaderImageAltTag = headerImageAltTag;
					}
					public String getHeaderImageButtonText() {
						return HeaderImageButtonText;
					}
					public void setHeaderImageButtonText(String headerImageButtonText) {
						HeaderImageButtonText = headerImageButtonText;
					}
					public String getHeaderImageUrl() {
						return HeaderImageUrl;
					}
					public void setHeaderImageUrl(String headerImageUrl) {
						HeaderImageUrl = headerImageUrl;
					}
					public String getHeaderImageOrdering() {
						return HeaderImageOrdering;
					}
					public void setHeaderImageOrdering(String headerImageOrdering) {
						HeaderImageOrdering = headerImageOrdering;
					}
					public String getPagefriendlyUrl() {
						return PagefriendlyUrl;
					}
					public void setPagefriendlyUrl(String pagefriendlyUrl) {
						PagefriendlyUrl = pagefriendlyUrl;
					}
					public String getPageTitle() {
						return PageTitle;
					}
					public void setPageTitle(String pageTitle) {
						PageTitle = pageTitle;
					}
					public String getMenuName() {
						return MenuName;
					}
					public void setMenuName(String menuName) {
						MenuName = menuName;
					}
					public String getBannerimageAltTag() {
						return BannerimageAltTag;
					}
					public void setBannerimageAltTag(String bannerimageAltTag) {
						BannerimageAltTag = bannerimageAltTag;
					}
					public String getBannerimagedesc() {
						return Bannerimagedesc;
					}
					public void setBannerimagedesc(String bannerimagedesc) {
						Bannerimagedesc = bannerimagedesc;
					}
					public String getPageMetaTitle() {
						return PageMetaTitle;
					}
					public void setPageMetaTitle(String pageMetaTitle) {
						PageMetaTitle = pageMetaTitle;
					}
					public String getPageMetaKeywords() {
						return PageMetaKeywords;
					}
					public void setPageMetaKeywords(String pageMetaKeywords) {
						PageMetaKeywords = pageMetaKeywords;
					}
					public String getPageMetaDescription() {
						return PageMetaDescription;
					}
					public void setPageMetaDescription(String pageMetaDescription) {
						PageMetaDescription = pageMetaDescription;
					}
					public String getPageOrder() {
						return PageOrder;
					}
					public void setPageOrder(String pageOrder) {
						PageOrder = pageOrder;
					}
					public String getNewsTitle() {
						return NewsTitle;
					}
					public void setNewsTitle(String newsTitle) {
						NewsTitle = newsTitle;
					}
					public String getNewsShortDescription() {
						return NewsShortDescription;
					}
					public void setNewsShortDescription(String newsShortDescription) {
						NewsShortDescription = newsShortDescription;
					}
					public String getNewsdescription() {
						return Newsdescription;
					}
					public void setNewsdescription(String newsdescription) {
						Newsdescription = newsdescription;
					}
					public String getNewsImageAltTag() {
						return NewsImageAltTag;
					}
					public void setNewsImageAltTag(String newsImageAltTag) {
						NewsImageAltTag = newsImageAltTag;
					}
					public String getNewsMetaTitle() {
						return NewsMetaTitle;
					}
					public void setNewsMetaTitle(String newsMetaTitle) {
						NewsMetaTitle = newsMetaTitle;
					}
					public String getNewsMetakeywords() {
						return NewsMetakeywords;
					}
					public void setNewsMetakeywords(String newsMetakeywords) {
						NewsMetakeywords = newsMetakeywords;
					}
					public String getNewsMetadescription() {
						return NewsMetadescription;
					}
					public void setNewsMetadescription(String newsMetadescription) {
						NewsMetadescription = newsMetadescription;
					}
					public String getTeamName() {
						return TeamName;
					}
					public void setTeamName(String teamName) {
						TeamName = teamName;
					}
					public String getDesgination() {
						return Desgination;
					}
					public void setDesgination(String desgination) {
						Desgination = desgination;
					}
					public String getTeamdescription() {
						return Teamdescription;
					}
					public void setTeamdescription(String teamdescription) {
						Teamdescription = teamdescription;
					}
					public String getTeamAltTag() {
						return TeamAltTag;
					}
					public void setTeamAltTag(String teamAltTag) {
						TeamAltTag = teamAltTag;
					}
					public String getTeamDisplayOrder() {
						return TeamDisplayOrder;
					}
					public void setTeamDisplayOrder(String teamDisplayOrder) {
						TeamDisplayOrder = teamDisplayOrder;
					}
					public String getFacebook() {
						return Facebook;
					}
					public void setFacebook(String facebook) {
						Facebook = facebook;
					}
					public String getTwitter() {
						return Twitter;
					}
					public void setTwitter(String twitter) {
						Twitter = twitter;
					}
					public String getInstagram() {
						return Instagram;
					}
					public void setInstagram(String instagram) {
						Instagram = instagram;
					}
					public String getPinterest() {
						return Pinterest;
					}
					public void setPinterest(String pinterest) {
						Pinterest = pinterest;
					}
					public String getYoutube() {
						return Youtube;
					}
					public void setYoutube(String youtube) {
						Youtube = youtube;
					}
					public String getGooglePLUS() {
						return GooglePLUS;
					}
					public void setGooglePLUS(String googlePLUS) {
						GooglePLUS = googlePLUS;
					}
					public String getGoogleAnalystic() {
						return GoogleAnalystic;
					}
					public void setGoogleAnalystic(String googleAnalystic) {
						GoogleAnalystic = googleAnalystic;
					}
					public String getSocialMetaTitle() {
						return SocialMetaTitle;
					}
					public void setSocialMetaTitle(String socialMetaTitle) {
						SocialMetaTitle = socialMetaTitle;
					}
					public String getSocialMetaKeyword() {
						return SocialMetaKeyword;
					}
					public void setSocialMetaKeyword(String socialMetaKeyword) {
						SocialMetaKeyword = socialMetaKeyword;
					}
					public String getSocialMetaDesc() {
						return SocialMetaDesc;
					}
					public void setSocialMetaDesc(String socialMetaDesc) {
						SocialMetaDesc = socialMetaDesc;
					}
					
		 //--- Admin Profile Getter & setter Methods---//
					
					public String getAdminFirstName() {
						return AdminFirstName;
					}

					public void setAdminFirstName(String adminFirstName) {
						AdminFirstName = adminFirstName;
					}

					public String getAdminLastName() {
						return AdminLastName;
					}

					public void setAdminLastName(String adminLastName) {
						AdminLastName = adminLastName;
					}

					public String getAdminPhoneNumber() {
						return AdminPhoneNumber;
					}

					public void setAdminPhoneNumber(String adminPhoneNumber) {
						AdminPhoneNumber = adminPhoneNumber;
					}

					public String getAdminAddress1() {
						return AdminAddress1;
					}

					public void setAdminAddress1(String adminAddress1) {
						AdminAddress1 = adminAddress1;
					}

					public String getAdminAddress2() {
						return AdminAddress2;
					}

					public void setAdminAddress2(String adminAddress2) {
						AdminAddress2 = adminAddress2;
					}

					public String getAdminCity() {
						return AdminCity;
					}

					public void setAdminCity(String adminCity) {
						AdminCity = adminCity;
					}

					public String getAdminZipCode() {
						return AdminZipCode;
					}

					public void setAdminZipCode(String adminZipCode) {
						AdminZipCode = adminZipCode;
					}

					public String getAdminPassword() {
						return AdminPassword;
					}

					public void setAdminPassword(String adminPassword) {
						AdminPassword = adminPassword;
					}

					public String getAdminNewPassword() {
						return AdminNewPassword;
					}

					public void setAdminNewPassword(String adminNewPassword) {
						AdminNewPassword = adminNewPassword;
					}

					public String getAdminConfirmPassword() {
						return AdminConfirmPassword;
					}

					public void setAdminConfirmPassword(String adminConfirmPassword) {
						AdminConfirmPassword = adminConfirmPassword;
					}

}	
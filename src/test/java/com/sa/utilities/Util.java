package com.sa.utilities;

import java.util.LinkedList;
import org.testng.Assert;
import com.sa.datainitialization.DataInt;

/**
 * 
 * 
 * This Class is to read and set all the xlsx file data to the getter/setter methods
 * 
 * 
 * 
 * 
 */

public class Util {


public static String excep;


		public static LinkedList<Object[]> getLoginData(String sheetName1,Xls_Reader xls) {
		
			LinkedList<Object[]> logindata = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Login")) {
		
						dataInitialization.setEmail(xls.getCellData(sheetName1, 1, i));
						dataInitialization.setPassword(xls.getCellData(sheetName1, 2, i));
						obj[0] = dataInitialization;
						logindata.add(obj);
					}
				}
		
					} catch (Exception e) {
						 excep=e.toString();
						 Assert.fail(excep);
						 e.printStackTrace();
				
					}
				return logindata;
		
		    }
		
		public static LinkedList<Object[]> getElopUsers(String sheetName2,Xls_Reader xls) {
					
			LinkedList<Object[]> ElopUsers = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName2, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName2, 0, i).equalsIgnoreCase("ElopUsers")) {
		
						dataInitialization.setElopUserFirstName(xls.getCellData(sheetName2, 1, i));
						dataInitialization.setElopUserMiddleName(xls.getCellData(sheetName2, 2, i));
						dataInitialization.setElopUserLastName(xls.getCellData(sheetName2, 3, i));
						dataInitialization.setElopUserEmailId(xls.getCellData(sheetName2, 4, i));
						dataInitialization.setElopUserPassWord(xls.getCellData(sheetName2, 5, i));
						dataInitialization.setElopUserPhoneNumber(xls.getCellData(sheetName2, 6, i));
						dataInitialization.setElopUserAddress1(xls.getCellData(sheetName2, 7, i));
						dataInitialization.setElopUserAddress2(xls.getCellData(sheetName2, 8, i));
						dataInitialization.setElopUserCity(xls.getCellData(sheetName2, 9, i));
						dataInitialization.setElopUserZipCode(xls.getCellData(sheetName2, 10, i));
						obj[0] = dataInitialization;
						ElopUsers.add(obj);
					}
				}
		
					} catch (Exception e) {
							excep=e.toString();
							Assert.fail(excep);
							e.printStackTrace();
				
					}
					return ElopUsers;
		
		    }
		
		public static LinkedList<Object[]> getSite(String sheetName3,Xls_Reader xls) {
					
			LinkedList<Object[]> Site = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName3, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName3, 0, i).equalsIgnoreCase("Site")) {
		
						dataInitialization.setSiteName(xls.getCellData(sheetName3, 1, i));
						dataInitialization.setSiteType(xls.getCellData(sheetName3, 2, i));
						dataInitialization.setSiteSupervisor(xls.getCellData(sheetName3, 3, i));
						dataInitialization.setSiteLocationCode(xls.getCellData(sheetName3, 4, i));
						dataInitialization.setSitePhoneNumber(xls.getCellData(sheetName3, 5, i));
						dataInitialization.setSiteAddress(xls.getCellData(sheetName3, 6, i));
						dataInitialization.setSiteCity(xls.getCellData(sheetName3, 7, i));
						dataInitialization.setSiteZipcode(xls.getCellData(sheetName3, 8, i));
						dataInitialization.setSiteFaxNumber(xls.getCellData(sheetName3, 9, i));
						
						obj[0] = dataInitialization;
						Site.add(obj);
					}
				}
		
						} catch (Exception e) {
								excep=e.toString();
								Assert.fail(excep);
								e.printStackTrace();
					
						}
						return Site;
		
		    }
		
		public static LinkedList<Object[]> getSiteUser(String sheetName4,Xls_Reader xls) {
					
			LinkedList<Object[]> SiteUser = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName4, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName4, 0, i).equalsIgnoreCase("SiteUser")) {
		
						dataInitialization.setSchoolName(xls.getCellData(sheetName4, 1, i));
						dataInitialization.setSiteUserFirstName(xls.getCellData(sheetName4, 2, i));
						dataInitialization.setSiteUserMiddleName(xls.getCellData(sheetName4, 3, i));
						dataInitialization.setSiteUserLastName(xls.getCellData(sheetName4, 4, i));
						dataInitialization.setSiteuserPassWord(xls.getCellData(sheetName4, 5, i));
						dataInitialization.setSiteUserPhoneNumber(xls.getCellData(sheetName4, 6, i));
						dataInitialization.setSiteUserAddress1(xls.getCellData(sheetName4,7, i));
						dataInitialization.setSiteuserAddress2(xls.getCellData(sheetName4, 8, i));
						dataInitialization.setSiteUserCity(xls.getCellData(sheetName4, 9, i));
						dataInitialization.setSiteUserZipCode(xls.getCellData(sheetName4, 10, i));
						obj[0] = dataInitialization;
						SiteUser.add(obj);
					}
				}
		
						} catch (Exception e) {
								excep=e.toString();
								Assert.fail(excep);
								e.printStackTrace();
					
						}
						return SiteUser;
		
		    }
		
		public static LinkedList<Object[]> getDHS(String sheetName5,Xls_Reader xls) {
					
			LinkedList<Object[]> DHS = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName5, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName5, 0, i).equalsIgnoreCase("DHS")) {
		
						dataInitialization.setStateID(xls.getCellData(sheetName5, 1, i));
						dataInitialization.setVouchername(xls.getCellData(sheetName5, 2, i));
						dataInitialization.setAmountperweek(xls.getCellData(sheetName5, 3, i));
						obj[0] = dataInitialization;
						DHS.add(obj);
					}
				}
		
						} catch (Exception e) {
								excep=e.toString();
								Assert.fail(excep);
								e.printStackTrace();
					
						}
						return DHS;
		
		    }
		
		public static LinkedList<Object[]> getPendingPayment(String sheetName6,Xls_Reader xls) {
					
			LinkedList<Object[]> PendingPayment = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName6, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName6, 0, i).equalsIgnoreCase("PendingPayment")) {
		
						dataInitialization.setParentId(xls.getCellData(sheetName6, 1, i));
						dataInitialization.setStudentFormId(xls.getCellData(sheetName6, 2, i));
						dataInitialization.setWeeklyFee(xls.getCellData(sheetName6, 3, i));
						dataInitialization.setLateFee(xls.getCellData(sheetName6, 4, i));
						dataInitialization.setRegistationFee(xls.getCellData(sheetName6, 5, i));
						dataInitialization.setLateFeeMin(xls.getCellData(sheetName6, 6, i));
						obj[0] = dataInitialization;
						PendingPayment.add(obj);
					}
				}
		
						} catch (Exception e) {
							 excep=e.toString();
							 Assert.fail(excep);
							 e.printStackTrace();
					
						}
						return PendingPayment;
		
		    }
		
		public static LinkedList<Object[]> getSiblingDiscount(String sheetName7,Xls_Reader xls) {
					
			LinkedList<Object[]> SiblingDiscount = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName7, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName7, 0, i).equalsIgnoreCase("SiblingDiscount")) {
		
						dataInitialization.setParents(xls.getCellData(sheetName7, 1, i));
						dataInitialization.setStudent(xls.getCellData(sheetName7, 2, i));
						dataInitialization.setSiblingDiscount(xls.getCellData(sheetName7, 3, i));
						obj[0] = dataInitialization;
						SiblingDiscount.add(obj);
					}
				}
		
					} catch (Exception e) {
						 excep=e.toString();
						 Assert.fail(excep);
						 e.printStackTrace();
				
					}
					return SiblingDiscount;
		
		    }
		
		public static LinkedList<Object[]> getWeekOff(String sheetName8,Xls_Reader xls) {
					
			LinkedList<Object[]> WeekOff = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName8, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName8, 0, i).equalsIgnoreCase("WeekOff")) {
		
						dataInitialization.setTitle(xls.getCellData(sheetName8, 1, i));
						dataInitialization.setDescription(xls.getCellData(sheetName8, 2, i));
						obj[0] = dataInitialization;
						WeekOff.add(obj);
					}
				}
		
						} catch (Exception e) {
							 excep=e.toString();
							 Assert.fail(excep);
							 e.printStackTrace();
					
						}
						return WeekOff;
		
		    }
		
		public static LinkedList<Object[]> getResource(String sheetName9,Xls_Reader xls) {
			
			LinkedList<Object[]> Resource = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName9, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName9, 0, i).equalsIgnoreCase("Resource")) {
		
						dataInitialization.setUrl(xls.getCellData(sheetName9, 1, i));
						dataInitialization.setResourcetitle(xls.getCellData(sheetName9, 2, i));
						dataInitialization.setResourceDescription(xls.getCellData(sheetName9, 3, i));
						dataInitialization.setDisplayOrder(xls.getCellData(sheetName9, 4, i));
						obj[0] = dataInitialization;
						Resource.add(obj);
					}
				}
		
						} catch (Exception e) {
							 excep=e.toString();
							 Assert.fail(excep);
							 e.printStackTrace();
					
						}
						return Resource;
		
		    }
		
		public static LinkedList<Object[]> getSiteInfo(String sheetName9,Xls_Reader xls) {
					
			LinkedList<Object[]> SiteInfo = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName9, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName9, 0, i).equalsIgnoreCase("SiteInfo")) {
		
						dataInitialization.setSiteinfositename(xls.getCellData(sheetName9, 1, i));
						dataInitialization.setSiteinfoSiteTypeId(xls.getCellData(sheetName9, 2, i));
						dataInitialization.setWeekStartTime(xls.getCellData(sheetName9, 3, i));
						dataInitialization.setWeekStartAMPM(xls.getCellData(sheetName9, 4, i));
						dataInitialization.setWeekEndTime(xls.getCellData(sheetName9, 5, i));
						dataInitialization.setWeekEndAMPM(xls.getCellData(sheetName9, 6, i));
						dataInitialization.setMaxcapacity(xls.getCellData(sheetName9, 7, i));
						dataInitialization.setMealsOrdered(xls.getCellData(sheetName9, 8, i));
						dataInitialization.setSiteInfoWeeklyRate(xls.getCellData(sheetName9, 9, i));
						dataInitialization.setSiteinfoLateFee(xls.getCellData(sheetName9, 10, i));
						dataInitialization.setSiteinfoRegistraionFee(xls.getCellData(sheetName9, 11, i));
						dataInitialization.setSiteInfoLatefeeforeveryminute(xls.getCellData(sheetName9, 12, i));
						obj[0] = dataInitialization;
						SiteInfo.add(obj);
					}
				}
		
					} catch (Exception e) {
						 excep=e.toString();
						 Assert.fail(excep);
						 e.printStackTrace();
				
					}
					return SiteInfo;
		
		    }
		
		public static LinkedList<Object[]> getContentManagement(String sheetName10,Xls_Reader xls) {
				
			LinkedList<Object[]> ContentManagement = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName10, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName10, 0, i).equalsIgnoreCase("ContentManagement")) {
		
						dataInitialization.setHeaderImageTitle(xls.getCellData(sheetName10, 1, i));
						dataInitialization.setHeaderImagedesc(xls.getCellData(sheetName10, 2, i));
						dataInitialization.setHeaderImageAltTag(xls.getCellData(sheetName10, 3, i));
						dataInitialization.setHeaderImageButtonText(xls.getCellData(sheetName10, 4, i));
						dataInitialization.setHeaderImageUrl(xls.getCellData(sheetName10, 5, i));
						dataInitialization.setHeaderImageOrdering(xls.getCellData(sheetName10, 6, i));
						dataInitialization.setPagefriendlyUrl(xls.getCellData(sheetName10, 7, i));
						dataInitialization.setPageTitle(xls.getCellData(sheetName10, 8, i));
						dataInitialization.setMenuName(xls.getCellData(sheetName10, 9, i));
						dataInitialization.setBannerimageAltTag(xls.getCellData(sheetName10, 10, i));
						dataInitialization.setBannerimagedesc(xls.getCellData(sheetName10, 11, i));
						dataInitialization.setPageMetaTitle(xls.getCellData(sheetName10, 12, i));
						dataInitialization.setPageMetaKeywords(xls.getCellData(sheetName10, 13, i));
						dataInitialization.setPageMetaDescription(xls.getCellData(sheetName10, 14, i));
						dataInitialization.setPageOrder(xls.getCellData(sheetName10, 15, i));
						dataInitialization.setNewsTitle(xls.getCellData(sheetName10, 16, i));
						dataInitialization.setNewsShortDescription(xls.getCellData(sheetName10, 17, i));
						dataInitialization.setNewsdescription(xls.getCellData(sheetName10, 18, i));
						dataInitialization.setNewsImageAltTag(xls.getCellData(sheetName10, 19, i));
						dataInitialization.setNewsMetaTitle(xls.getCellData(sheetName10, 20, i));
						dataInitialization.setNewsMetakeywords(xls.getCellData(sheetName10, 21, i));
						dataInitialization.setNewsMetadescription(xls.getCellData(sheetName10, 22, i));
						dataInitialization.setTeamName(xls.getCellData(sheetName10, 23, i));
						dataInitialization.setDesgination(xls.getCellData(sheetName10, 24, i));
						dataInitialization.setTeamdescription(xls.getCellData(sheetName10, 25, i));
						dataInitialization.setTeamAltTag(xls.getCellData(sheetName10, 26, i));
						dataInitialization.setTeamDisplayOrder(xls.getCellData(sheetName10, 27, i));
						dataInitialization.setFacebook(xls.getCellData(sheetName10, 28, i));
						dataInitialization.setTwitter(xls.getCellData(sheetName10, 29, i));
						dataInitialization.setInstagram(xls.getCellData(sheetName10, 30, i));
						dataInitialization.setPinterest(xls.getCellData(sheetName10, 31, i));
						dataInitialization.setYoutube(xls.getCellData(sheetName10, 32, i));
						dataInitialization.setGooglePLUS(xls.getCellData(sheetName10, 33, i));
						dataInitialization.setGoogleAnalystic(xls.getCellData(sheetName10, 34, i));
						dataInitialization.setSocialMetaTitle(xls.getCellData(sheetName10, 35, i));
						dataInitialization.setSocialMetaKeyword(xls.getCellData(sheetName10, 36, i));
						dataInitialization.setSocialMetaDesc(xls.getCellData(sheetName10, 37, i));
						obj[0] = dataInitialization;
						ContentManagement.add(obj);
					}
				}
		
					} catch (Exception e) {
						 excep=e.toString();
						 Assert.fail(excep);
						 e.printStackTrace();
				
					}
					return ContentManagement;
		
		    }
		
		
		public static LinkedList<Object[]> getAdminProfile(String sheetName11,Xls_Reader xls) {
					
			LinkedList<Object[]> AdminProfile = new LinkedList<Object[]>();
		
			try {
				DataInt dataInitialization = null;
				int dataStartRowNum = 3;
				int totalRows = 0;
		
				while (!xls.getCellData(sheetName11, 0, dataStartRowNum + totalRows).equals("")) {
					
					totalRows++;
				}
		
				for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
		
					dataInitialization = new DataInt();
					Object obj[] = new Object[1];
		
					if (xls.getCellData(sheetName11, 0, i).equalsIgnoreCase("AdminProfile")) {
		
						dataInitialization.setAdminFirstName(xls.getCellData(sheetName11, 1, i));
						dataInitialization.setAdminLastName(xls.getCellData(sheetName11, 2, i));
						dataInitialization.setAdminPhoneNumber(xls.getCellData(sheetName11, 3, i));
						dataInitialization.setAdminAddress1(xls.getCellData(sheetName11, 4, i));
						dataInitialization.setAdminAddress2(xls.getCellData(sheetName11, 5, i));
						dataInitialization.setAdminCity(xls.getCellData(sheetName11, 6, i));
						dataInitialization.setAdminZipCode(xls.getCellData(sheetName11, 7, i));
						dataInitialization.setAdminPassword(xls.getCellData(sheetName11, 8, i));
						dataInitialization.setAdminNewPassword(xls.getCellData(sheetName11, 9, i));
						dataInitialization.setAdminConfirmPassword(xls.getCellData(sheetName11, 10, i));				
						obj[0] = dataInitialization;
						AdminProfile.add(obj);
					}
				}
		
						} catch (Exception e) {
							 excep=e.toString();
							 Assert.fail(excep);
							 e.printStackTrace();
					
						}
						return AdminProfile;
		
		    }
}

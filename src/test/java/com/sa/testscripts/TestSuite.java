package com.sa.testscripts;

import java.util.Iterator;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.sa.pageobjects.ExcelSheetObjects;
import com.sa.testscripts.SetupEnvironment;
import com.sa.datainitialization.DataInt;
import com.sa.utilities.Util;
import com.sa.utilities.Xls_Reader;



public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")+ "\\src\\main\\java\\com\\sa\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);
    

	@Test(description = "Login", dataProvider = "getLogin", priority = 1)
	public void Login(DataInt dataInt) throws Exception {
		try {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ElopUserCreate", dataProvider = "getElopUsers", priority = 2)
	public void CreateElopUser(DataInt dataInt) throws Exception {
		try {
			elopusercreate=driverhome.getelopusercreate();
			elopusercreate.Createadmin(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateElopUserWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateElopUserWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ElopUserEdit", dataProvider = "getElopUsers", priority = 3)
	public void ElopUserEdit(DataInt dataInt) throws Exception {
		try {
			editelopuser=driverhome.geteditelopuser();
			editelopuser.editelopuser(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditElopUserWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditElopUserWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "SitesCreate", dataProvider = "getSite", priority = 4)
	public void SiteCreate(DataInt dataInt) throws Exception {
		try {
			createsite=driverhome.getcreatesite();
			createsite.createsitenames(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateSiteWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateSiteWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "SitesEdit", dataProvider = "getSite", priority = 5)
	public void SiteEdit(DataInt dataInt) throws Exception {
		try {
			siteedit=driverhome.getsiteedit();
			siteedit.editsites(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditsiteWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditsiteWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "SitesDelete", priority = 6)
	public void SitesDelete(DataInt dataInt) throws Exception {
		try {
			sitedelete =driverhome.getsitedelete();
			sitedelete.sitedelete();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.DeletingSite, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.DeletingSite, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "createsiteuser",dataProvider = "getSiteUser", priority = 7)
	public void Createsiteuser(DataInt dataInt) throws Exception {
		try {
			siteuser=driverhome.getsiteuser();
			siteuser.siteusercreate(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateSiteUserWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateSiteUserWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "editsiteuser",dataProvider = "getSiteUser", priority = 8)
	public void siteuseredit(DataInt dataInt) throws Exception {
		try {
			siteuseredit=driverhome.getsiteuseredit();
			siteuseredit.siteuseredit(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditSiteUserWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditSiteUserWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ParentsList", priority = 9)
	public void Parents(DataInt dataInt) throws Exception {
		try {
			parent=driverhome.getparent();
			parent.parentslist();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Parents, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Parents, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "StudentsList", priority = 10)
	public void Students(DataInt dataInt) throws Exception {
		try {
			student=driverhome.getstudent();
			student.studentslist();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Students, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Students, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "AdmitStudentfromWaitingList", priority = 11)
	public void AdmitStudent(DataInt dataInt) throws Exception {
		try {
			admit=driverhome.getadmit();
			admit.admitstudentfromwl();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.AdmitStudent, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.AdmitStudent, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ChangeProgramorSiteLocations", priority = 12)
	public void ChangeProgramorSiteLocations(DataInt dataInt) throws Exception {
		try {
			progrmsite=driverhome.getprogrmsite();
			progrmsite.progrmorsite();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ChangeProgramorSite, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ChangeProgramorSite, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreateDhs", dataProvider = "getDHS", priority = 13)
	public void Vouchercreate(DataInt dataInt) throws Exception {
		try {
			dhsvoucher=driverhome.getdhsvoucher();
			dhsvoucher.createdhsvoucher(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateDHSWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateDHSWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "DhsEdit", dataProvider = "getDHS", priority = 14)
	public void Voucheredit(DataInt dataInt) throws Exception {
		try {
			voucheredit=driverhome.getvoucheredit();
			voucheredit.DHSVoucheredit(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditDHSWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditDHSWithValidData, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "Dhsdelete", priority = 15)
	public void Voucherdelete(DataInt dataInt) throws Exception {
		try {
			voucherdelete=driverhome.getvoucherdelete();
			voucherdelete.deletevoucher();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.DeleteDHS, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.DeleteDHS, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "PaymentHistory", priority = 16)
	public void PaymentHistory() throws Exception {
		try {
			historyofpayment=driverhome.gethistoryofpayment();
			historyofpayment.checkpaymenthistory();
			historyofpayment.exporttoexcelpaymentrecords();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.PaymentHistory, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.PaymentHistory, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "PendingPayment",dataProvider="getPendingPayment" ,priority = 17)
	public void CreatePendingPayment(DataInt dataInt) throws Exception {
		try {
			pendingpayment=driverhome.getpendingpayment();
			pendingpayment.creatingpayments(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreatePendingPayment, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreatePendingPayment, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "SiblingDiscount",dataProvider="getSiblingDiscount" ,priority = 18)
	public void CreateSiblingDiscount(DataInt dataInt) throws Exception {
		try {
			siblingdiscount=driverhome.getsiblingdiscount();
			siblingdiscount.Siblingdiscount(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateSIblingDIscount, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateSIblingDIscount, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreateMedicalCondition" ,priority = 19)
	public void CreateMedicalCondition() throws Exception {
		try {
			medical=driverhome.getmedical();
			medical.medicalcondition();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateMedicalCondition, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateMedicalCondition, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "EditMedicalCondition" ,priority = 20)
	public void EditMedicalCondition() throws Exception {
		try {
			medicaledit=driverhome.getmedicaledit();
			medicaledit.editmedical();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditMedicalCondition, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditMedicalCondition, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "Menumeal" ,priority = 21)
	public void CreateMenumeal() throws Exception {
		try {
			menumeal=driverhome.getmenumeal();
			menumeal.menumealadd();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateMenuMeal, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateMenuMeal, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "EditMenumeal" ,priority = 22)
	public void EditMenumeal() throws Exception {
		try {
			editmeal=driverhome.geteditmeal();
			editmeal.menumealedit();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditMenuMeal, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditMenuMeal, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "beverage" ,priority = 23)
	public void createbeverage() throws Exception {
		try {
			beverage=driverhome.getbeverage();
			beverage.beverage();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateBeverage, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateBeverage, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "editbeverage" ,priority = 24)
	public void editbeverage() throws Exception {
		try {
			beverageedit=driverhome.getbeverageedit();
			beverageedit.beverageedit();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditBeverage, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditBeverage, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreateWeekOff",dataProvider="getWeekOff" ,priority = 25)
	public void CreateWeekOff() throws Exception {
		try {
			beverageedit=driverhome.getbeverageedit();
			beverageedit.beverageedit();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateWeekoff, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateWeekoff, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreateSteInfo",dataProvider="getSiteInfo" ,priority = 26)
	public void CreateSteInfo(DataInt dataInt) throws Exception {
		try {
			siteinfo=driverhome.getsiteinfo();
			siteinfo.siteinfo(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateSiteInfo, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateSiteInfo, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "Programs" ,priority = 27)
	public void Programs() throws Exception {
		try {
			program=driverhome.getprogram();
			program.program();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Programs, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Programs, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "LateCheckoutReport" ,priority = 28)
	public void LateCheckoutReport() throws Exception {
		try {
			latecheckout=driverhome.getlatecheckout();
			latecheckout.latecheckout();
			latecheckout.exporttoexcel();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.LateCheckoutReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.LateCheckoutReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ExcessMealReport" ,priority = 29)
	public void ExcessMealReport() throws Exception {
		try {
			excessmeal=driverhome.getexcessmeal();
			excessmeal.reportexcessmeal();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ExcessMealReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ExcessMealReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "DisallowedMealReport" ,priority = 30)
	public void DisallowedMealReport() throws Exception {
		try {
			disallowed=driverhome.getdisallowed();
			disallowed.disallowedmeal();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.DisallowedMealReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.DisallowedMealReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CACFPCountReport" ,priority = 31)
	public void CACFPCountReport() throws Exception {
		try {
			cacfp=driverhome.getcacfp();
			cacfp.cacfp();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CACFPCountReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CACFPCountReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "RevenueReport" ,priority = 32)
	public void RevenueReport() throws Exception {
		try {
			revenue=driverhome.getrevenue();
			revenue.revenue();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.RevenueReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.RevenueReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ProgStudentAttendanceReportrams" ,priority = 33)
	public void StudentAttendanceReport() throws Exception {
		try {
			studentattendance=driverhome.getstudentattendance();
			studentattendance.attendance();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.StudentAttendanceReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.StudentAttendanceReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "DailyAttendanceReport" ,priority = 34)
	public void DailyAttendanceReport() throws Exception {
		try {
			dailyattendance=driverhome.getdailyattendance();
			dailyattendance.daily();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.DailyAttendanceReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.DailyAttendanceReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ProgramParticipationReport" ,priority = 35)
	public void ProgramParticipationReport() throws Exception {
		try {
			programparticipation=driverhome.getprogramparticipation();
			programparticipation.participation();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ProgramParticipationReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ProgramParticipationReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "PaymentorCreditReport" ,priority = 36)
	public void PaymentorCreditReport() throws Exception {
		try {
			payment=driverhome.getpayment();
			payment.credit();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.PaymentorCreditReport, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.PaymentorCreditReport, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreateHeaderImage",dataProvider="getContentManagement" ,priority = 37)
	public void CreateHeaderImage(DataInt dataInt) throws Exception {
		try {
			headerimage=driverhome.getheaderimage();
			headerimage.headerimages(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateHeaderImage, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateHeaderImage, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreatePage",dataProvider="getContentManagement" ,priority = 38)
	public void CreatePage(DataInt dataInt) throws Exception {
		try {
			page=driverhome.getpage();
			page.pages(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreatePage, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreatePage, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreateNewsandEvents",dataProvider="getContentManagement" ,priority = 39)
	public void CreateNewsandEvents(DataInt dataInt) throws Exception {
		try {
			newsevent=driverhome.getnewsevent();
			newsevent.newsevents(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateNewsandEvents, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateNewsandEvents, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "CreateTeam",dataProvider="getContentManagement" ,priority = 40)
	public void CreateTeam(DataInt dataInt) throws Exception {
		try {
			team=driverhome.getteam();
			team.team(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateTeam, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateTeam, "TestCases");
			e.printStackTrace();
		}				
	}
	
	@Test(description = "Homeaboutus" ,priority = 41)
	public void Homeaboutus() throws Exception {
		try {
			home=driverhome.gethome();
			home.aboutus();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.HomeAboutUs, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.HomeAboutUs, "TestCases");
			e.printStackTrace();
		}				
	}
	
	@Test(description = "SocialSettings" ,priority = 42)
	public void SocialSettings(DataInt dataInt) throws Exception {
		try {
			social=driverhome.getsocial();
			social.settings(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.SocialSettings, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.SocialSettings, "TestCases");
			e.printStackTrace();
		}				
	}
	
	@Test(description = "AdminprofileSettings",dataProvider="getAdminProfile ",priority = 43)
	public void AdminprofileSettings(DataInt dataInt) throws Exception {
		try {
			profile=driverhome.getprofile();
			profile.profile(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.AdminProfile, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.AdminProfile, "TestCases");
			e.printStackTrace();
		}				
	}
	
	@Test(description = "AdminprofilePasswrod" ,dataProvider="getAdminProfile",priority = 44)
	public void AdminprofilePasswrod(DataInt dataInt) throws Exception {
		try {
			profilepswd=driverhome.getprofilepswd();
			profilepswd.passwrod(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ChangePassword, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ChangePassword, "TestCases");
			e.printStackTrace();
		}				
	}
	
	@Test(description = "AdminLogout" ,priority = 45)
	public void AdminLogout(DataInt dataInt) throws Exception {
		try {
			signout=driverhome.getsignout();
			signout.signout();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Logout, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Logout, "TestCases");
			e.printStackTrace();
		}				
	}
	
	@DataProvider
	public Iterator<Object[]> getLogin() {
			return Util.getLoginData("Login", xls).iterator();

		}
			
	@DataProvider
	public Iterator<Object[]>getElopUsers(){
		    return Util.getElopUsers("ElopUsers", xls).iterator();
		    
	}
		
	@DataProvider
	public Iterator<Object[]>getSite(){
		   return Util.getSite("Site", xls).iterator();
		    
	}
	
	@DataProvider
	public Iterator<Object[]>getSiteUser(){
		   return Util.getSiteUser("SiteUser", xls).iterator();
		    
	}
	
	@DataProvider
	public Iterator<Object[]>getDHS(){
		   return Util.getDHS("DHS", xls).iterator();
		
	}
	
	@DataProvider
	public Iterator<Object[]>getPendingPayment(){
		   return Util.getPendingPayment("PendingPayment", xls).iterator();
		
	}
	
	@DataProvider
	public Iterator<Object[]>getSiblingDiscount(){
		   return Util.getSiblingDiscount("SiblingDIscount", xls).iterator();
		
	}
	
	@DataProvider
	public Iterator<Object[]>getWeekOff(){
		   return Util.getWeekOff("WeekOff", xls).iterator();
	}
	
	@DataProvider
	public Iterator<Object[]>getSiteInfo(){
		   return Util.getSiteInfo("SiteInfo", xls).iterator();
	}
	
	@DataProvider
	public Iterator<Object[]>getContentManagement(){
			return Util.getContentManagement("COntentManagement", xls).iterator();
		
	}
	
	@DataProvider
	public Iterator<Object[]>getAdminProfile(){
		   return Util.getAdminProfile("AdminProfile", xls).iterator();
	}
	
}

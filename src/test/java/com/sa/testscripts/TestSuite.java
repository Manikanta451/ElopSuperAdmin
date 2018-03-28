package com.sa.testscripts;

import java.util.Iterator;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.sa.testscripts.ExcelSheetObjects;import com.sa.testscripts.SetupEnvironment;
import com.sa.datainitialization.DataInt;
import com.sa.utilities.Util;
import com.sa.utilities.Xls_Reader;

/**
 * 
 * 
 * This is the Main Class for the Execution of the ELOP Super Admin test cases. 
 *
 */

public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")+ "\\src\\main\\java\\com\\sa\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);
	public String excep;
    

	@Test(description = "Login", dataProvider = "getLogin", priority = 1)
	public void Login(DataInt dataInt) throws Exception {
		try {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ElopUserDelete", priority = 4)
	public void DeleteElopUser() throws Exception {
		try {
			delelopuser=driverhome.getdelDeleteELOPUser();
			delelopuser.deluserelop();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.DeleteElopUser, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.DeleteElopUser, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ElopResetpassword", priority = 5)
	public void ElopResetpassword() throws Exception {
		try {
			reset=driverhome.getreset();
			reset.resetpassword();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ElopUserResetPassword, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ElopUserResetPassword, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ApprovePayment", priority = 6)
	public void Creditpayment() throws Exception {
		try {
			approve=driverhome.getapprove();
			approve.paymentcredit();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateSiteWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateSiteWithValidData, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "SitesCreate", dataProvider = "getSite", priority = 7)
	public void SiteCreate(DataInt dataInt) throws Exception {
		try {
			createsite=driverhome.getcreatesite();
			createsite.createsitenames(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateSiteWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateSiteWithValidData, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "SitesEdit", dataProvider = "getSite", priority = 8)
	public void SiteEdit(DataInt dataInt) throws Exception {
		try {
			siteedit=driverhome.getsiteedit();
			siteedit.editsites(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditsiteWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditsiteWithValidData, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "SitesDelete", priority = 9)
	public void SitesDelete() throws Exception {
		try {
			sitedelete =driverhome.getsitedelete();
			sitedelete.sitedelete();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.DeletingSite, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.DeletingSite, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "createsiteuser",dataProvider = "getSiteUser", priority = 10)
	public void Createsiteuser(DataInt dataInt) throws Exception {
		try {
			siteuser=driverhome.getsiteuser();
			siteuser.siteusercreate(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateSiteUserWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateSiteUserWithValidData, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "editsiteuser",dataProvider = "getSiteUser", priority = 11)
	public void siteuseredit(DataInt dataInt) throws Exception {
		try {
			siteuseredit=driverhome.getsiteuseredit();
			siteuseredit.siteuseredit(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditSiteUserWithValidData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditSiteUserWithValidData, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "deletesiteuser", priority = 12)
	public void siteuserdelete() throws Exception {
		try {
			delsiteuser=driverhome.getdelsiteuser();
			delsiteuser.delsiteuser();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.DeleteSiteUser, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.DeleteSiteUser, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "resetpswduser", priority = 13)
	public void resetsiteuserpassword() throws Exception {
		try {
			resetsiteuser=driverhome.getresetsiteuser();
			resetsiteuser.resetlink();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.SiteUserResetPassword, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.SiteUserResetPassword, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ParentsList", priority = 14)
	public void Parents() throws Exception {
		try {
			parent=driverhome.getparent();
			parent.parentslist();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Parents, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Parents, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ParentsDisable", priority = 15)
	public void disableParent() throws Exception {
		try {
			inactive=driverhome.getinactive();
			inactive.disable();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ParentInActive, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ParentInActive, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "Parentresetpassword", priority = 16)
	public void Parentresetpassword() throws Exception {
		try {
			resetpasswordparent=driverhome.getresetpasswordparent();
			resetpasswordparent.resetlinktouser();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ParentResetPassword, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ParentResetPassword, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "StudentsList", priority = 17)
	public void Students() throws Exception {
		try {
			student=driverhome.getstudent();
			student.studentslist();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Students, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Students, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "AdmitStudentfromWaitingList", priority = 18)
	public void AdmitStudent() throws Exception {
		try {
			admit=driverhome.getadmit();
			admit.admitstudentfromwl();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.AdmitStudent, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.AdmitStudent, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "ChangeProgramorSiteLocations", priority = 12)
	public void ChangeProgramorSiteLocations() throws Exception {
		try {
			progrmsite=driverhome.getprogrmsite();
			progrmsite.progrmorsite();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ChangeProgramorSite, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ChangeProgramorSite, "TestCases");
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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
			excep=e.toString();
			Assert.fail(excep);
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

package com.sa.testscripts;

import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;















































import com.sa.pagefactory.AdminProfile;
import com.sa.pagefactory.AdmitStudent;
import com.sa.pagefactory.CACFPCountReport;
import com.sa.pagefactory.ChangePassword;
import com.sa.pagefactory.ChangeProgramorSite;
import com.sa.pagefactory.CreateBeverage;
import com.sa.pagefactory.CreateDHSVoucher;
import com.sa.pagefactory.CreateElopUser;
import com.sa.pagefactory.CreateHeaderImage;
import com.sa.pagefactory.CreateMedicalCondition;
import com.sa.pagefactory.CreateMenuMeal;
import com.sa.pagefactory.CreateNewsandEvents;
import com.sa.pagefactory.CreatePage;
import com.sa.pagefactory.CreatePendingPayment;
import com.sa.pagefactory.CreateSiblingDiscount;
import com.sa.pagefactory.CreateSiteInfo;
import com.sa.pagefactory.CreateSiteUser;
import com.sa.pagefactory.CreateSite;
import com.sa.pagefactory.CreateTeam;
import com.sa.pagefactory.CreateWeekOff;
import com.sa.pagefactory.DailyAttendanceReport;
import com.sa.pagefactory.DeleteDHSVoucher;
import com.sa.pagefactory.DeleteSite;
import com.sa.pagefactory.DisallowedMealReport;
import com.sa.pagefactory.DriverHome;
import com.sa.pagefactory.EditBeverage;
import com.sa.pagefactory.EditDHSVoucher;
import com.sa.pagefactory.EditElopUser;
import com.sa.pagefactory.EditMedicalCondition;
import com.sa.pagefactory.EditMenuMeal;
import com.sa.pagefactory.EditSite;
import com.sa.pagefactory.EditSiteUser;
import com.sa.pagefactory.ExcessMealReport;
import com.sa.pagefactory.HomeAboutUs;
import com.sa.pagefactory.LateCheckoutReport;
import com.sa.pagefactory.Login;
import com.sa.pagefactory.Logout;
import com.sa.pagefactory.Parents;
import com.sa.pagefactory.PaymentHistory;
import com.sa.pagefactory.PaymentorCreditReport;
import com.sa.pagefactory.ProgramParticipationReport;
import com.sa.pagefactory.Programs;
import com.sa.pagefactory.RevenueReport;
import com.sa.pagefactory.SocialSettings;
import com.sa.pagefactory.StudentAttendanceReport;
import com.sa.pagefactory.Students;
import com.sa.utilities.Xls_Reader;

/**
 * 
 * 
 * This is the base class for all the test suites,It executes before executing the TestSuite Classes
 * 
 * 
 */

public class Base {
	
	public String excep;
	public DriverHome driverhome;
	
	public Login login;
	public CreateElopUser elopusercreate;
	public EditElopUser editelopuser;
	public CreateSite createsite;
	public EditSite siteedit;
	public DeleteSite sitedelete;
	public CreateSiteUser siteuser;
	public EditSiteUser siteuseredit;
	public Parents parent;
	public Students student;
	public AdmitStudent admit;
	public ChangeProgramorSite progrmsite;
	public CreateDHSVoucher dhsvoucher;
	public EditDHSVoucher voucheredit;
	public DeleteDHSVoucher voucherdelete;
	public PaymentHistory historyofpayment;
	public CreatePendingPayment pendingpayment;
	public CreateSiblingDiscount siblingdiscount;
	public CreateMedicalCondition medical;
	public EditMedicalCondition medicaledit;
	public CreateMenuMeal menumeal;
	public EditMenuMeal editmeal;
	public CreateBeverage beverage;
	public EditBeverage beverageedit;
	public CreateWeekOff weekoff;
	public CreateSiteInfo siteinfo;
	public Programs program;
	public LateCheckoutReport latecheckout;
	public ExcessMealReport excessmeal;
	public DisallowedMealReport disallowed;
	public CACFPCountReport cacfp;
	public RevenueReport revenue;
	public StudentAttendanceReport studentattendance;
	public DailyAttendanceReport dailyattendance;
	public ProgramParticipationReport programparticipation;
	public PaymentorCreditReport payment;
	public CreateHeaderImage headerimage;
	public CreatePage page;
	public CreateNewsandEvents newsevent;
	public CreateTeam team;
	public HomeAboutUs home;
	public SocialSettings social;
	public AdminProfile  profile;
	public ChangePassword profilepswd;
	public Logout signout;
	
	
	public static String passMessage = null;
	public static String finalMessage = null;
	public static String skipMessage = null;
	public Xls_Reader xls;

	@BeforeTest(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			Reporter.log("=====Browser Session Started=====", true);
			driverhome = new DriverHome(browser, "test");
			
		} catch (WebDriverException e) {
			excep=e.toString();
	    	Assert.fail(excep);
			System.out.println(e);
			
		}
	}

	
	@AfterTest

	public void close() throws Exception {
		try {
			Thread.sleep(5000);
		    //driverhome.emailreport();
			//driverhome.quitDriver();
			Reporter.log("=====Browser Session End=========", true);
		} catch (WebDriverException e) {
			excep=e.toString();
	    	Assert.fail(excep);
			System.out.println(e); 

		}
	}
	
}
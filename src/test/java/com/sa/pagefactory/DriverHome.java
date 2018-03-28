package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.sa.utilities.PropertiesFileReader;

/**
 * 
 * This Class is to initialize the all pages with using Pagefactory
 * 
 */

public class DriverHome extends CommonBase {
	
	public static final String prod_url = PropertiesFileReader.readvalueOfKey("app.url");
			

	public DriverHome(WebDriver driver) {
		super(driver);

	}

	public DriverHome(String browser, String text) {
		super(prod_url, browser);
	}

	public DriverHome(String url) {
		super(url, "test");

	}
	
	public Login getLogin(){
		return PageFactory.initElements(driver, Login.class);
	}
	
	public CreateElopUser getelopusercreate(){
		return PageFactory.initElements(driver, CreateElopUser.class);
		
	}
	
	public EditElopUser geteditelopuser(){
		return PageFactory.initElements(driver, EditElopUser.class);
		
	}
	
	public DeleteELOPUser getdelDeleteELOPUser(){
		return PageFactory.initElements(driver, DeleteELOPUser.class);
	}
	
	public ElopUserResetPassword getreset(){
		return PageFactory.initElements(driver, ElopUserResetPassword.class);
	}
	
	public ApprovePaymentorCredit getapprove(){
		return PageFactory.initElements(driver, ApprovePaymentorCredit.class);
	}
	
	public CreateSite getcreatesite(){
		return PageFactory.initElements(driver, CreateSite.class);
		
	}
	
	public EditSite getsiteedit(){
		return PageFactory.initElements(driver, EditSite.class);
		
	}
	
	public DeleteSite getsitedelete(){
		return PageFactory.initElements(driver, DeleteSite.class);
		
	}
	
	public CreateSite getsitescreate(){
		return PageFactory.initElements(driver, CreateSite.class);
		
	}
	
	public CreateSiteUser getsiteuser(){
		return PageFactory.initElements(driver, CreateSiteUser.class);
		
	}
	
	public EditSiteUser getsiteuseredit(){
		return PageFactory.initElements(driver, EditSiteUser.class);
		
	}
	
	public DeleteSiteUser getdelsiteuser(){
		return PageFactory.initElements(driver, DeleteSiteUser.class);
	}
	
	public SiteUserResetPassword getresetsiteuser(){
		return PageFactory.initElements(driver, SiteUserResetPassword.class);
	}
	
	
	public Parents getparent(){
		return PageFactory.initElements(driver, Parents.class);
		
	}
	
	public ParentInActive getinactive(){
		return PageFactory.initElements(driver, ParentInActive.class);
		
	}
	
	public ParentResetPassword getresetpasswordparent(){
		return PageFactory.initElements(driver, ParentResetPassword.class);
		
	}
	
	public Students getstudent(){
		return PageFactory.initElements(driver, Students.class);
		
	}
	
	public AdmitStudent getadmit(){
		return PageFactory.initElements(driver, AdmitStudent.class);
		
	}
	
	public ChangeProgramorSite getprogrmsite(){
		return PageFactory.initElements(driver, ChangeProgramorSite.class);
		
	}
	
	public CreateDHSVoucher getdhsvoucher(){
		return PageFactory.initElements(driver, CreateDHSVoucher.class);
		
	}
	
	public EditDHSVoucher getvoucheredit(){
		return PageFactory.initElements(driver, EditDHSVoucher.class);
		
	}
	
	public DeleteDHSVoucher getvoucherdelete(){
		return PageFactory.initElements(driver, DeleteDHSVoucher.class);
		
	}
	
	public CreatePendingPayment getpendingpayment(){
		return PageFactory.initElements(driver, CreatePendingPayment.class);
		
	}
	
	public CreateSiblingDiscount getsiblingdiscount(){
		return PageFactory.initElements(driver, CreateSiblingDiscount.class);
		
	}
	
	public PaymentHistory gethistoryofpayment(){
		return PageFactory.initElements(driver, PaymentHistory.class);
		
	}
	
	public CreateMedicalCondition getmedical(){
		return PageFactory.initElements(driver, CreateMedicalCondition.class);
		
	}
	
	public EditMedicalCondition getmedicaledit(){
		return PageFactory.initElements(driver, EditMedicalCondition.class);
		
	}
	
	public CreateMenuMeal getmenumeal(){
		return PageFactory.initElements(driver, CreateMenuMeal.class);
		
	}
	
	public EditMenuMeal geteditmeal(){
		return PageFactory.initElements(driver, EditMenuMeal.class);
		
	}
	
	public CreateBeverage getbeverage(){
		return PageFactory.initElements(driver, CreateBeverage.class);
		
	}
	
	public EditBeverage getbeverageedit(){
		return PageFactory.initElements(driver, EditBeverage.class);
		
	}
	
	public CreateWeekOff getweekoff(){
		return PageFactory.initElements(driver, CreateWeekOff.class);
		
	}
	
	public CreateSiteInfo getsiteinfo(){
		return PageFactory.initElements(driver, CreateSiteInfo.class);
		
	}
	
	public Programs getprogram(){
		return PageFactory.initElements(driver, Programs.class);
		
	}
	
	public LateCheckoutReport getlatecheckout(){
		return PageFactory.initElements(driver, LateCheckoutReport.class);
		
	}
	
	public ExcessMealReport getexcessmeal(){
		return PageFactory.initElements(driver, ExcessMealReport.class);
		
	}
	
	public DisallowedMealReport getdisallowed(){
		return PageFactory.initElements(driver, DisallowedMealReport.class);
		
	}
	
	public CACFPCountReport getcacfp(){
		return PageFactory.initElements(driver, CACFPCountReport.class);
		
	}
	
	public RevenueReport getrevenue(){
		return PageFactory.initElements(driver, RevenueReport.class);
		
	}
	
	public StudentAttendanceReport getstudentattendance(){
		return PageFactory.initElements(driver, StudentAttendanceReport.class);
		
	}
	
	public DailyAttendanceReport getdailyattendance(){
		return PageFactory.initElements(driver, DailyAttendanceReport.class);
		
	}
	
	public ProgramParticipationReport getprogramparticipation(){
		return PageFactory.initElements(driver, ProgramParticipationReport.class);
		
	}
	
	public PaymentorCreditReport getpayment(){
		return PageFactory.initElements(driver, PaymentorCreditReport.class);
		
	}
	
	public CreateHeaderImage getheaderimage(){
		return PageFactory.initElements(driver, CreateHeaderImage.class);
		
	}
	
	public CreatePage getpage(){
		return PageFactory.initElements(driver, CreatePage.class);
		
	}
	
	public CreateNewsandEvents getnewsevent(){
		return PageFactory.initElements(driver, CreateNewsandEvents.class);
		
	}
	
	public CreateTeam getteam(){
		return PageFactory.initElements(driver, CreateTeam.class);
		
	}
	
	public HomeAboutUs gethome(){
		return PageFactory.initElements(driver, HomeAboutUs.class);
		
	}
	
	public SocialSettings getsocial(){
		return PageFactory.initElements(driver, SocialSettings.class);
		
	}
	
	public AdminProfile getprofile(){
		return PageFactory.initElements(driver, AdminProfile.class);
		
	}
	
	public ChangePassword getprofilepswd(){
		return PageFactory.initElements(driver, ChangePassword.class);
		
	}
	
	
}


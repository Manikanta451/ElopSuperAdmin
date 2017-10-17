package com.sa.testscripts;

import java.util.ArrayList;
import java.util.List;
//import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.testng.TestNG;
import com.sa.pagefactory.CommonBase;


public class StartApplication extends CommonBase{

	public StartApplication(WebDriver driver) {
		super(driver);
	}

	public static void main (String[] args) throws Exception {
		
	          try {
	        	  TestNG runner=new TestNG();
	        	  List<String> suitefiles=new ArrayList<String>();
	        	  suitefiles.add("D://ELOPSuperAdmin//SATestNG.xml");
	        	  runner.setTestSuites(suitefiles);
	        	  runner.run();
	        	 /* Xl.generateReport("TestReport.xlsx");
	        	  emailreport();
		     */
	           } catch (Exception e) {
	    	      e.printStackTrace();
	         }
		
	  }
	
}
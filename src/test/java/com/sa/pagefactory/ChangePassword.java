package com.sa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sa.datainitialization.DataInt;

public class ChangePassword extends CommonBase{

	public ChangePassword(WebDriver driver) {
		super(driver);
		
	}
	
	//--- Change Passwrod---//
	
	   @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/a/span")
	   public static WebElement admin;
	
		@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/ul/li/ul/li[2]/a")
		public static WebElement ChangePasswrod;
		
		@FindBy(how = How.ID, using = "Password")
		public static WebElement AdminPassword;
		
		@FindBy(how = How.ID, using = "NewPassword")
		public static WebElement AdminNewPassword;
		
		@FindBy(how = How.ID, using = "ConfirmPassword")
		public static WebElement AdminConfirmPassword;
		
		@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[4]/div/form/div/div/div/div[2]/div/div/div[4]/div/input")
		public static WebElement ChangeAdminpassword;
	
	public void passwrod(DataInt dataInt)throws Exception{
		
				waitForSeconds(4);
				mouseOver(admin, ChangePasswrod);
				waitForSeconds(1);
				ChangePasswrod.click();
				waitForSeconds(3);
				AdminPassword.sendKeys(dataInt.getAdminPassword());
				waitForSeconds(1);
				AdminNewPassword.sendKeys(dataInt.getAdminNewPassword());
				waitForSeconds(1);
				AdminConfirmPassword.sendKeys(dataInt.getAdminConfirmPassword());
				waitForSeconds(1);
				//ChangeAdminpassword.click();
				
	}
	

}

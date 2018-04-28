package automationFramework;


import org.testng.annotations.Test;

import appModules.Login_Action;
import appModules.Logout_Action;
import appModules.UpdateBusinessLocations;
import pageObjects.*;
import utility.Constant;
import utility.Log;

public class Sprint5 extends Constant{
	
	public Sprint5() {
		super();
	}
	
	// Update Card Badmin
	@Test(enabled=false, priority=1)
	public void UpdateCard() throws Exception{
		    Login_Action.Execute(driver, "BusinessAdmin");
		    //Thread.sleep(1000);
	        HeaderLinks.lnk_MyBusiness(driver).click();
	        //Thread.sleep(1000);
	        HeaderLinks.lnk_BusinessProfile(driver).click();
	        //Thread.sleep(1000);
	        UpdateBusinessLocations.UpdatePayment(driver, "Accept");
	        //Thread.sleep(1000);
	        Logout_Action.Execute(driver);
	}
	
	   //Decline Card Payment
		@Test(enabled=false, priority=2)
		public void DecardBAdmin() throws Exception{
		    Login_Action.Execute(driver, "BusinessAdmin");
		    Thread.sleep(500);
	        HeaderLinks.lnk_MyBusiness(driver).click();
	        Thread.sleep(500);
	        HeaderLinks.lnk_BusinessProfile(driver).click();
	        Thread.sleep(500);
	        UpdateBusinessLocations.UpdatePayment(driver, "Decline");
	        Thread.sleep(500);
	        Logout_Action.Execute(driver);    		        
		}
	        
    //Approve email templates BAdmin
	@Test(enabled=true, priority=3)
	public void ApproveTempBAdmin() throws Exception{
        Basic_Regression.DonationActionsApproveBAdmin();    
	}
	
    //Reject email templates BAdmin
	@Test(enabled=false, priority=4)
	public void RejectTempBAdmin() throws Exception{
        Basic_Regression.DonationActionsRejectBAdmin();   
	}
	
	
	//driver.findElement(By.id("myUploadElement")).sendKeys("<absolutePathToMyFile>");
	
}

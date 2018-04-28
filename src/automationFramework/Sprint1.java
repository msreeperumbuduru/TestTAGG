package automationFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import appModules.*;
import pageObjects.*;
import utility.Constant;
//import utility.Log;

public class Sprint1 extends Constant {
	
	public Sprint1() {
		super();
}
	
//change passwd page altered when buser created - manual tc7
//change passwd page altered when cquser created - manual	tc8	
	

	//verify comma separated values currency format 
	@Test(enabled=false,priority=5)
	public void Commacqadmin() throws Exception { 
		Login_Action.Execute(driver, "CharityQAdmin");
		//Thread.sleep(500);
		HeaderLinks.lnk_Dashboard(driver).click();
		//Thread.sleep(500);
		Screenshot.Execute(driver);
		//Thread.sleep(500);
		HeaderLinks.lnk_SearchDonations(driver).click();
		//Thread.sleep(500);
		Screenshot.Execute(driver);
		//Thread.sleep(500);
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=false,priority=6)
	public void CommaBadmin() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		//Thread.sleep(500);
		HeaderLinks.lnk_Dashboard(driver).click();
		//Thread.sleep(500);
		Screenshot.Execute(driver);
		//Thread.sleep(500);
		HeaderLinks.lnk_SearchDonations(driver).click();
		//Thread.sleep(500);
		Screenshot.Execute(driver);
		//Thread.sleep(500);
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=false,priority=7)
	public void CommaBUser() throws Exception { 
		Login_Action.Execute(driver, "BusinessUser");
		//Thread.sleep(500);
		HeaderLinks.lnk_Dashboard(driver).click();
		//Thread.sleep(500);
		Screenshot.Execute(driver);
		//Thread.sleep(500);
		HeaderLinks.lnk_SearchDonations(driver).click();
		//Thread.sleep(500);
		Screenshot.Execute(driver);
		//Thread.sleep(500);
		Logout_Action.Execute(driver);
	}
	
	//verify subscription date/cancel subscription as Badmin
	//resume status tc15
	@Test(enabled=false,priority=3)
	public void verifySubsDate() throws Exception { 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		HeaderLinks.lnk_MyBusiness(driver).click();
		Thread.sleep(500);
		HeaderLinks.lnk_BusinLocations(driver).click();
		Thread.sleep(500);
		BusinessLocationsPage.input_cancelSubs(driver).click();
		Thread.sleep(500);
		String textVerify = BusinessLocationsPage.label_SubsMessage(driver).getText();
		Assert.assertTrue(textVerify.contains("Subscription ends at:"));
		BusinessLocationsPage.input_resumeSubs(driver).click();
		Thread.sleep(500);
		Logout_Action.Execute(driver); 
	}
		
    //Request pending as badmin
	@Test(enabled=false, priority=2, groups = {"Regression_Functional"} )
	public void PendingRequestsBadmin() throws Exception {
        Login_Action.Execute(driver, "BusinessAdmin");
        Thread.sleep(500);
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Thread.sleep(500);
        HeaderLinks.lnk_MyBusiness(driver).click();
        Thread.sleep(500);
        HeaderLinks.lnk_ManualDonReq(driver).click(); 
        Thread.sleep(500);
        Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);	
		Thread.sleep(500);
        ManualDonationRequests_Action.Execute(driver);
        Thread.sleep(500);
		driver.close();
		Thread.sleep(500);
		driver.switchTo().window(parentid);
		Thread.sleep(500);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HeaderLinks.lnk_Dashboard(driver).click();
        Thread.sleep(500);
        Screenshot.Execute(driver);
        Thread.sleep(500);
        Logout_Action.Execute(driver); 
	}
	
//    //Request pending as buser	
//	@Test(enabled=false, priority=3, groups = {"Regression_Functional"})
//	public void PendingRequestsBUser() throws Exception {
//        Login_Action.Execute(driver, "BusinessUser");
//        Thread.sleep(500);
//        HeaderLinks.lnk_Dashboard(driver).click();
//        Thread.sleep(500);
//        Screenshot.Execute(driver);
//        Thread.sleep(500);
//        HeaderLinks.lnk_MyBusiness(driver).click();
//        Thread.sleep(500);
//        HeaderLinks.lnk_ManualDonReq(driver).click(); 
//        Thread.sleep(500);
//        Set<String>ids = driver.getWindowHandles();
//		Iterator<String> it = ids.iterator();
//		String parentid = it.next();
//		String childid = it.next();
//		driver.switchTo().window(childid);	
//		Thread.sleep(500);
//        ManualDonationRequests_Action.Execute(driver);
//        Thread.sleep(500);
//		driver.close();
//		Thread.sleep(500);
//		driver.switchTo().window(parentid);
//		Thread.sleep(500);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        HeaderLinks.lnk_Dashboard(driver).click();
//        Thread.sleep(500);
//        Screenshot.Execute(driver);
//        Thread.sleep(500);
//        Logout_Action.Execute(driver);  
//	}
	
	//Don pref button functionality as badmin tc9
	//Verify Mydonation form - badmin, buser, tc10,tc11,tc12
	@Test(enabled=false,priority=1, groups = {"Regression_Functional"})
	public void Mydonationform() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		Screenshot.Execute(driver);
		Thread.sleep(500);
		MyDonationForm.Execute(driver);
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver, "BusinessUser");
		Thread.sleep(500);
		Screenshot.Execute(driver);
		Thread.sleep(500);
		MyDonationForm.Execute(driver);
		Thread.sleep(500);
		Logout_Action.Execute(driver);
	}
	
	//Verify update location page as Badmin	tc13, Buser	tc14
	@Test(enabled=false,priority=4, groups = {"Regression_Functional"})
	public void updatelocationBAdmin() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
//		Thread.sleep(500);
//		Login_Action.Execute(driver, "BusinessUser");
//		Thread.sleep(500);
//		UpdateBusinessLocations.Execute(driver,"BusinessUser");
//		Thread.sleep(500);
//		Logout_Action.Execute(driver);
	}

}


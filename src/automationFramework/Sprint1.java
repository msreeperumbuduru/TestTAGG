package automationFramework;

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
	

	//verify comma seperated values currency format 
	@Test(enabled=false,priority=1)
	public void Commacqadmin() throws Exception { 
		
		Login_Action.Execute(driver, "CharityQAdmin");
		HeaderLinks.lnk_Dashboard(driver).click();
		Screenshot.Execute(driver);
		DashboardPage.lnk_Detail1(driver).click();
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		SearchDonationsPage.srch_viewDtls(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=false,priority=2)
	public void CommaBadmin() throws Exception { 
		
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_Dashboard(driver).click();
		Screenshot.Execute(driver);
		DashboardPage.lnk_Detail1(driver).click();
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		SearchDonationsPage.srch_viewDtls(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=false,priority=3)
	public void CommaBUser() throws Exception { 
		
		Login_Action.Execute(driver, "BusinessUser");
		HeaderLinks.lnk_Dashboard(driver).click();
		Screenshot.Execute(driver);
		DashboardPage.lnk_Detail(driver).click();
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		SearchDonationsPage.srch_viewDtls(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
	

	//verify subscription date/cancel subscription as Badmin
	//resume status tc15
	@Test(enabled=false,priority=4)
	public void verifySubsDate() throws Exception { 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_MyBusiness(driver).click();
		HeaderLinks.lnk_BusinLocations(driver).click();
		BusinessLocationsPage.input_cancelSubs(driver).click();
		String textVerify = BusinessLocationsPage.label_SubsMessage(driver).getText();
		Assert.assertTrue(textVerify.contains("Subscription ends at:"));
		System.out.println("SP1->TC4");
		BusinessLocationsPage.input_resumeSubs(driver).click();
		System.out.println("SP1->TC15");
		Logout_Action.Execute(driver); 
	}
		
    //Request pending as badmin
	@Test(enabled=false, priority=5)
	public void PendingRequestsBadmin() throws Exception {
        Login_Action.Execute(driver, "BusinessAdmin");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        HeaderLinks.lnk_MyBusiness(driver).click();
        HeaderLinks.lnk_ManualDonReq(driver).click();
        ManualDonationRequests_Action.Execute(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HeaderLinks.lnk_Dashboard(driver).click();
        DashboardPage.btn_Approve(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
        System.out.println("SP1,TC5 -> Request Pending Passed");
        //string a = requestpending().gettext(); webelement list<list> count; if a = count(webelementlist)://excel.write(pass);else excel.write(fail);  
	}
	
    //request pending as buser	
	@Test(enabled=false, priority=6)
	public void PendingRequestsBUser() throws Exception {
        Login_Action.Execute(driver, "BusinessAdmin");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        HeaderLinks.lnk_MyBusiness(driver).click();
        HeaderLinks.lnk_ManualDonReq(driver).click();
        ManualDonationRequests_Action.Execute(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HeaderLinks.lnk_Dashboard(driver).click();
        DashboardPage.btn_Approve(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
        System.out.println("SP1,TC6 -> Request Pending Passed");
        //string a = requestpeding().gettext(); webelement list<list> count; if a = count(webelementlist)://excel.write(pass);else excel.write(fail);  
	}
	
	//Don pref button functionality as badmin tc9
	//Verify Mydonation form - badmin, buser, tc10,tc11,tc12
	@Test(enabled=false,priority=7)
	public void Mydonationform() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Screenshot.Execute(driver);
		MyDonationForm.Execute(driver);
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "BusinessUser");
		Screenshot.Execute(driver);
		MyDonationForm.Execute(driver);
		Logout_Action.Execute(driver);
		System.out.println("SP1,TC9--> PASSED");
		System.out.println("SP1,TC10--> PASSED");
		System.out.println("SP1,TC11--> PASSED-Out of Scrope");
		System.out.println("SP1,TC12--> PASSED");
	}
	
	//Verify update location page as Badmin	tc13, Buser	tc14
	@Test(enabled=true,priority=8)
	public void updatelocationBAdmin() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		UpdateBusinessLocations.Execute(driver);
		Logout_Action.Execute(driver);
		System.out.println("SP1,TC13--> PASSED");
		Login_Action.Execute(driver, "BusinessUser");
		UpdateBusinessLocations.Execute(driver);
		Logout_Action.Execute(driver);
		System.out.println("SP1,TC14--> PASSED");
	}

    //close driver
    @AfterSuite
    public void closebrowser() throws Exception{ 
   	 driver.close();
     }
}


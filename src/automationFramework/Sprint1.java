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
	@Test(enabled=true,priority=1)
	public void Commacqadmin() throws Exception { 
		Login_Action.Execute(driver, "CharityQAdmin");
		HeaderLinks.lnk_Dashboard(driver).click();
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=2)
	public void CommaBadmin() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_Dashboard(driver).click();
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=3)
	public void CommaBUser() throws Exception { 
		
		Login_Action.Execute(driver, "BusinessUser");
		HeaderLinks.lnk_Dashboard(driver).click();
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	//verify subscription date/cancel subscription as Badmin
	//resume status tc15
	@Test(enabled=true,priority=4)
	public void verifySubsDate() throws Exception { 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_MyBusiness(driver).click();
		HeaderLinks.lnk_BusinLocations(driver).click();
		BusinessLocationsPage.input_cancelSubs(driver).click();
		String textVerify = BusinessLocationsPage.label_SubsMessage(driver).getText();
		Assert.assertTrue(textVerify.contains("Subscription ends at:"));
		BusinessLocationsPage.input_resumeSubs(driver).click();
		Logout_Action.Execute(driver); 
	}
		
    //Request pending as badmin
	@Test(enabled=true, priority=5, groups = {"Regression_Functional"} )
	public void PendingRequestsBadmin() throws Exception {
        Login_Action.Execute(driver, "BusinessAdmin");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        HeaderLinks.lnk_MyBusiness(driver).click();
        HeaderLinks.lnk_ManualDonReq(driver).click(); 
        Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);			
        ManualDonationRequests_Action.Execute(driver);
		driver.close();
		driver.switchTo().window(parentid);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver); 
	}
	
    //Request pending as buser	
	@Test(enabled=true, priority=6, groups = {"Regression_Functional"})
	public void PendingRequestsBUser() throws Exception {
        Login_Action.Execute(driver, "BusinessUser");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        HeaderLinks.lnk_MyBusiness(driver).click();
        HeaderLinks.lnk_ManualDonReq(driver).click(); 
        Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);			
        ManualDonationRequests_Action.Execute(driver);
		driver.close();
		driver.switchTo().window(parentid);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);  
	}
	
	//Don pref button functionality as badmin tc9
	//Verify Mydonation form - badmin, buser, tc10,tc11,tc12
	@Test(enabled=true,priority=7, groups = {"Regression_Functional"})
	public void Mydonationform() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Screenshot.Execute(driver);
		MyDonationForm.Execute(driver);
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "BusinessUser");
		Screenshot.Execute(driver);
		MyDonationForm.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	//Verify update location page as Badmin	tc13, Buser	tc14
	@Test(enabled=true,priority=8, groups = {"Regression_Functional"})
	public void updatelocationBAdmin() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "BusinessUser");
		UpdateBusinessLocations.Execute(driver,"BusinessUser");
		Logout_Action.Execute(driver);
	}

}


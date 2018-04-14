package automationFramework;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import appModules.DonationPreferences;
import appModules.Login_Action;
import appModules.Logout_Action;
import appModules.Screenshot;
import pageObjects.DashboardPage;
import pageObjects.HeaderLinks;
import pageObjects.SearchDonationsPage;
import utility.Constant;
import utility.Log;

public class Sprint4 extends Constant{
	
	public Sprint4() {
		super();
	}
	
	//verify comma sepearted format for cquser
	@Test(enabled=true,priority=1)
	public void CommaCqUser() throws Exception { 		
		Login_Action.Execute(driver, "CharityQUser");
		HeaderLinks.lnk_Dashboard(driver).click();
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	//verify comma sepearted format for cquser
	@Test(enabled=true,priority=2, groups = {"Regression_Functional"})
	public void ApprovedAmount() throws Exception { 		
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_Dashboard(driver).click();
		HeaderLinks.lnk_SearchDonations(driver).click();
		Screenshot.Execute(driver);
		Logout_Action.Execute(driver);
	}
		
}
	

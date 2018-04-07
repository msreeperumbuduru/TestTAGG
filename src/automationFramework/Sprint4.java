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
	
	//Don pref page Checking Organization Type
	@Test(enabled=true, priority=1)
	public void donationpref() throws Exception{
	Login_Action.Execute(driver, "BusinessAdmin");
	DonationPreferences.Execute(driver);
	Logout_Action.Execute(driver);
	}


	//verify comma sepearted format for root
	@Test(enabled=false,priority=4)
	public void CommaRoot() throws Exception { 
		Login_Action.Execute(driver, "Root");
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
	//verify comma sepearted format for cquser
	@Test(enabled=false,priority=5)
	public void CommaCqUser() throws Exception { 		
		Login_Action.Execute(driver, "CharityQUser");
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
	
	//verify barlow font for all users
	//verify cents truncated for all users
	//verify email
	//verify additional don approved column
	//Add status donation preferences are MET or NOT MET - Business Admin
	//Add status donation preferences are MET or NOT MET - Business User
}
	

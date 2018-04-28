package automationFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import appModules.*;
import pageObjects.*;
import utility.Constant;
import utility.Log;
import automationFramework.*;

public class Basic_Regression extends Constant {
	
	public Basic_Regression() {
		super();
}
	@Test(enabled=false,priority=1)
	public void Logins() throws Exception { 
		//Login_Action.Execute(driver, "Root");
		//Thread.sleep(500);
		//Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver, "BusinessUser");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver, "CharityQAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver, "CharityQUser");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=2)
	public void Signup() throws Exception { 
		RegisterUser_Action.Execute(driver);
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}

	@Test(enabled=false,priority=3)
	public void Subscription() throws Exception { 
		Login_Action.Execute(driver, "NewAdminSignUp");
		Thread.sleep(500);
		SubscriptionAction.Execute(driver);	
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=4)
	public void DonationForm() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		MyDonationForm.Execute(driver);
		Thread.sleep(500);
//		Logout_Action.Execute(driver);
//		Thread.sleep(500);
//		Login_Action.Execute(driver, "BusinessUser");
//		Thread.sleep(500);
//		MyDonationForm.Execute(driver);
//		Thread.sleep(500);
//		Logout_Action.Execute(driver);
//		Thread.sleep(500);
	}
	
	public void ManualDonationRequests() throws Exception { 
		HeaderLinks.lnk_MyBusiness(driver).click();
		Thread.sleep(500);
		HeaderLinks.lnk_ManualDonReq(driver).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		Logout_Action.Execute(driver);		
	}
	
	@Test(enabled=true,priority=5)
	public void DonationRequests() throws Exception { 
		//Login_Action.Execute(driver,"BusinessUser");
		//ManualDonationRequests();
		Login_Action.Execute(driver,"BusinessAdmin");
		Thread.sleep(500);
		ManualDonationRequests();
		Thread.sleep(500);
	}
	
	@Test(enabled=true,priority=6)
	public static void DonationActionsApproveBAdmin() throws Exception {
		Login_Action.Execute(driver,"BusinessAdmin");
		Thread.sleep(500);
		//HeaderLinks.lnk_Dashboard(driver).click();
		Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, 300)");
		Thread.sleep(500);
		
		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_ApproveDefault(driver).click();
		Thread.sleep(500);
		String show = AvailableEmailTemplatesPage.alertConfirm(driver).getText();
		Assert.assertTrue(show.contains("Email sent successfully"));
		Thread.sleep(500);
		
		HeaderLinks.lnk_Dashboard(driver).click();
		Thread.sleep(500);
		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_ApproveCustomize(driver).click();	
		Thread.sleep(500);
		AvailableEmailTemplatesPage.RadioListTemp2(driver);
		Thread.sleep(500);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		Thread.sleep(5000);
		EmailTemplates_Action.btn_ApproveSend(driver).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_ApproveCustomize(driver).click();	
		Thread.sleep(500);
		AvailableEmailTemplatesPage.RadioListTemp2(driver);
		Thread.sleep(500);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		Thread.sleep(500);
		EmailTemplates_Action.btn_ApproveSend(driver).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_ApproveCustomize(driver).click();
		Thread.sleep(500);
		AvailableEmailTemplatesPage.RadioListTemp3(driver);
		Thread.sleep(500);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		Thread.sleep(500);
		EmailTemplates_Action.btn_ApproveSend(driver).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=7)
	public static void DonationActionsRejectBAdmin() throws Exception {
		Login_Action.Execute(driver,"BusinessAdmin");
		Thread.sleep(500);
		HeaderLinks.lnk_Dashboard(driver).click();
		Thread.sleep(500);
		
		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_Reject(driver).click();	
		Thread.sleep(500);
		AvailableEmailTemplatesPage.RadioListTemp1(driver);
		Thread.sleep(500);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		Thread.sleep(500);
		EmailTemplates_Action.btn_ApproveSend(driver).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_Reject(driver).click();	
		Thread.sleep(500);
		AvailableEmailTemplatesPage.RadioListTemp2(driver);
		Thread.sleep(500);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		Thread.sleep(500);
		EmailTemplates_Action.btn_ApproveSend(driver).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_Reject(driver).click();
		Thread.sleep(500);
		AvailableEmailTemplatesPage.RadioListTemp3(driver);
		Thread.sleep(500);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		Thread.sleep(500);
		EmailTemplates_Action.btn_ApproveSend(driver).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		DashboardPage.Execute(driver);
		Thread.sleep(500);
		DashboardPage.btn_RejectDefault(driver).click();
		Thread.sleep(500);
		String show = AvailableEmailTemplatesPage.alertConfirm(driver).getText();
		Assert.assertTrue(show.contains("Email sent successfully"));
		
		Logout_Action.Execute(driver);

	}
	
	@Test(enabled=false,priority=8)
	public void SearchDonations() throws Exception { 		
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, 100)");
		Thread.sleep(500);
		SearchDonationsPage.Execute(driver);
		//((JavascriptExecutor)driver).executeScript("document.querySelector('table th:last-child').scrollIntoView();");
		//Logout_Action.Execute(driver);
		
	}
	
	@Test(enabled=true)
	public void DonationPreferences() throws Exception { 
		Login_Action.Execute(driver,"BusinessAdmin");
		Thread.sleep(500);
		DonationPreferences.Execute(driver, "PendingAccept", "PendingAccept", "PendingAccept");
		Thread.sleep(500);
        Logout_Action.Execute(driver);	
        Thread.sleep(500);
		
	}
	
	@Test(enabled=true,priority=9)
	public void DonationPreferencesBadmin() throws Exception { 
		Login_Action.Execute(driver,"BusinessAdmin");
		Thread.sleep(500);
		DonationPreferences.Execute(driver, "PendingAccept", "PendingAccept", "PendingAccept");
		Thread.sleep(500);
        HeaderLinks.lnk_Dashboard(driver).click();
        Thread.sleep(500);
        Screenshot.Execute(driver);
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
        Logout_Action.Execute(driver);	
        Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=11)
	public void EditEmailTemplates() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
        HeaderLinks.lnk_MyBusiness(driver).click();
        Thread.sleep(500);
        HeaderLinks.lnk_emailtmp(driver).click();
        Thread.sleep(500);
        Logout_Action.Execute(driver);
        Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=12)
	public void BusinessProfile() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		driver.navigate().back();
		UpdateBusinessLocations.UpdatePayment(driver, "Accept");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver,"BusinessUser");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "BusinessUser");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver,"CharityQAdmin");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "CharityQAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver,"CharityQUser");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "CharityQUser");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=13)
	public void UserProfile() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver,"BusinessUser");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "BusinessUser");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver,"CharityQAdmin");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "CharityQAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver,"CharityQUser");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "CharityQUser");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=14)
	public void ChangePassword() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		ChangePassword_Action.Execute(driver);
		Thread.sleep(500);
		Login_Action.Execute(driver,"BusinessUser");
		Thread.sleep(500);
		ChangePassword_Action.Execute(driver);	
		Thread.sleep(500);
		Login_Action.Execute(driver,"CharityQAdmin");
		Thread.sleep(500);
		ChangePassword_Action.Execute(driver);
		Thread.sleep(500);
    	Login_Action.Execute(driver,"CharityQUser");
    	Thread.sleep(500);
		ChangePassword_Action.Execute(driver);
		Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=15)
	public void EditBusinessLocations() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
	
	@Test(enabled=false,priority=16)
	public void AddBusinessLocations() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		HeaderLinks.lnk_MyBusiness(driver).click();
		Thread.sleep(500);
	    HeaderLinks.lnk_BusinLocations(driver).click();
	    Thread.sleep(500);
		AddBusinessLocation_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
		
	@Test(enabled=false,priority=17)
	public void InactivateBusinessLocations() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		HeaderLinks.lnk_MyBusiness(driver).click();
		Thread.sleep(500);
	    HeaderLinks.lnk_BusinLocations(driver).click();
	    Thread.sleep(500);
	    BusinessLocationsPage.Execute(driver);
	    Thread.sleep(500);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(500);
	    driver.switchTo().alert().accept();
	    Thread.sleep(500);
	    driver.switchTo().defaultContent();
	    Thread.sleep(500);
		Logout_Action.Execute(driver);
		Thread.sleep(500);
	}
	
}


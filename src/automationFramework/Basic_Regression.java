package automationFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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
	@Test(enabled=true,priority=1)
	public void Logins() throws Exception { 
		Login_Action.Execute(driver, "Root");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "BusinessAdmin");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "BusinessUser");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "CharityQAdmin");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "CharityQUser");
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=2)
	public void Signup() throws Exception { 
		RegisterUser_Action.Execute(driver);
		SubscriptionPage.btn_logout(driver).click();	
	}
	

	@Test(enabled=true,priority=3)
	public void Subscription() throws Exception { 
		Login_Action.Execute(driver, "NewAdminSignUp");
		SubscriptionAction.Execute(driver);	
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=4)
	public void DonationForm() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		MyDonationForm.Execute(driver);
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver, "BusinessUser");
		MyDonationForm.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	public void ManualDonationRequests() throws Exception { 
		HeaderLinks.lnk_MyBusiness(driver).click();
		HeaderLinks.lnk_ManualDonReq(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		ManualDonationRequests_Action.Execute(driver);
		driver.close();
		driver.switchTo().window(parentid);
		Logout_Action.Execute(driver);		
	}
	
	@Test(enabled=true,priority=5)
	public void DonationRequests() throws Exception { 
		Login_Action.Execute(driver,"BusinessUser");
		ManualDonationRequests();
		Login_Action.Execute(driver,"BusinessAdmin");
		ManualDonationRequests();
	}
	
	public void DonationActions() throws Exception {
		HeaderLinks.lnk_Dashboard(driver).click();
		DashboardPage.Execute(driver);
		DashboardPage.btn_Approve(driver).click();	
		AvailableEmailTemplatesPage.RadioListTemp1(driver);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		EmailTemplates_Action.btn_ApproveSend(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DashboardPage.Execute(driver);
		DashboardPage.btn_Approve(driver).click();	
		AvailableEmailTemplatesPage.RadioListTemp2(driver);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		DashboardPage.Execute(driver);
		DashboardPage.btn_Approve(driver).click();	
		AvailableEmailTemplatesPage.RadioListTemp3(driver);
		AvailableEmailTemplatesPage.btn_Proceed(driver).click();
		DashboardPage.Execute(driver);
		DashboardPage.btn_ApproveDefault(driver).click();		
	}
	
	@Test(enabled=true,priority=6)
	public void ApproveDon() throws Exception {
		Login_Action.Execute(driver,"BusinessUser");
		DonationActions();	
		String show = AvailableEmailTemplatesPage.alertConfirm(driver).getText();
		Assert.assertTrue(show.contains("Email send with default approval email."));
	}
	
	@Test(enabled=true,priority=7)
	public void RejectDon() throws Exception {
		Login_Action.Execute(driver,"BusinessUser");
		DonationActions();
		String show = AvailableEmailTemplatesPage.alertConfirm(driver).getText();
		Assert.assertTrue(show.contains("Email send with default rejection email."));
	}
	
	@Test(enabled=false,priority=8)
	public void SearchDonations() throws Exception { 
		
	}
	
	@Test(enabled=true,priority=9)
	public void DonationPreferencesBadmin() throws Exception { 
		Login_Action.Execute(driver,"BusinessAdmin");
		DonationPreferences.Execute(driver, "PendingAccept", "PendingAccept", "PendingAccept");
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
        Logout_Action.Execute(driver);		
	}
	
	@Test(enabled=true,priority=10)
	public void DonationPreferencesBuser() throws Exception { 
		Login_Action.Execute(driver,"BusinessUser");
		DonationPreferences.Execute(driver, "PendingAccept", "PendingAccept", "PendingAccept");
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
        Logout_Action.Execute(driver);
		
	}
	
	@Test(enabled=true,priority=11)
	public void EditEmailTemplates() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
        HeaderLinks.lnk_MyBusiness(driver).click();
        HeaderLinks.lnk_emailtmp(driver).click();
        Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=12)
	public void BusinessProfile() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver,"BusinessUser");
		UpdateBusinessLocations.Execute(driver, "BusinessUser");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver,"CharityQAdmin");
		UpdateBusinessLocations.Execute(driver, "CharityQAdmin");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver,"CharityQUser");
		UpdateBusinessLocations.Execute(driver, "CharityQUser");
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=13)
	public void UserProfile() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver,"BusinessUser");
		UpdateBusinessLocations.Execute(driver, "BusinessUser");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver,"CharityQAdmin");
		UpdateBusinessLocations.Execute(driver, "CharityQAdmin");
		Logout_Action.Execute(driver);
		Login_Action.Execute(driver,"CharityQUser");
		UpdateBusinessLocations.Execute(driver, "CharityQUser");
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=14)
	public void ChangePassword() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		ChangePassword_Action.Execute(driver);
		Login_Action.Execute(driver,"BusinessUser");
		ChangePassword_Action.Execute(driver);	
		Login_Action.Execute(driver,"CharityQAdmin");
		ChangePassword_Action.Execute(driver);
    	Login_Action.Execute(driver,"CharityQUser");
		ChangePassword_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=15)
	public void EditBusinessLocations() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		UpdateBusinessLocations.Execute(driver, "BusinessAdmin");
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=16)
	public void AddBusinessLocations() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_MyBusiness(driver).click();
	    HeaderLinks.lnk_BusinLocations(driver).click();
		AddBusinessLocation_Action.Execute(driver, "BusinessAdmin");
		Logout_Action.Execute(driver);
	}
		
	@Test(enabled=true,priority=17)
	public void InactivateBusinessLocations() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_MyBusiness(driver).click();
	    HeaderLinks.lnk_BusinLocations(driver).click();
	    BusinessLocationsPage.Execute(driver);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.switchTo().alert().accept();
	    driver.switchTo().defaultContent();
		Logout_Action.Execute(driver);
	}
	
}


package automationFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.*;
import appModules.*;
import pageObjects.*;
import utility.*;

public class Sprint3 extends Constant {
		
		public Sprint3() {
			super();
	}
	
    //verify pricing page
	@Test(enabled=true,priority=1)
	public void pricingPage() throws Exception {	
        WelcomePage.lnk_Pricing(driver).click();
        Thread.sleep(500);
        WelcomePage.lnk_Yearly(driver).click();
        Thread.sleep(500);
        Screenshot.Execute(driver);
        Thread.sleep(500);
		WelcomePage.lnk_LargeTrialYr(driver).click();
		Thread.sleep(500);
	}
        
    //verify no donation request form - CQ Admin, CQ User
	@Test(enabled=true,priority=2)
	public void omitDonForm() throws Exception {
        Login_Action.Execute(driver, "CharityQAdmin");
        Thread.sleep(500);
        HeaderLinks.lnk_MyBusiness(driver).click();
        Thread.sleep(500);
        Screenshot.Execute(driver);
        Thread.sleep(500);
        Logout_Action.Execute(driver);
        Thread.sleep(500);
        Login_Action.Execute(driver, "CharityQUser");
        Thread.sleep(500);
        HeaderLinks.lnk_MyBusiness(driver).click();
        Thread.sleep(500);
        Screenshot.Execute(driver);
        Thread.sleep(500);
        Logout_Action.Execute(driver);
	}      
	
	public void DonationForm() throws Exception { 
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
		ManualDonationPage.input_orgname(driver).sendKeys("test");
		Thread.sleep(500);
		Screenshot.Execute(driver);
		driver.close();
		Thread.sleep(500);
		driver.switchTo().window(parentid);
		Thread.sleep(500);
		Logout_Action.Execute(driver);	
		Thread.sleep(500);
	}
	
	   //verify dashboard,don pref - Busn Admin
		@Test(enabled=true,priority=3)
		public void myDonationForm() throws Exception { 
			Login_Action.Execute(driver, "BusinessAdmin");	
			Thread.sleep(500);
			DonationForm();
			Thread.sleep(500);
//			Login_Action.Execute(driver, "BusinessUser");
//			DonationForm();
		}		
		
		//verify delete a user - CQ Admin
		@Test(enabled=true,priority=4, groups = {"Regression_Functional"})
		public void deleteUserCQAdmin() throws Exception {
			Login_Action.Execute(driver, "DeleteCQUser");
			Thread.sleep(500);
	        HeaderLinks.lnk_MyBusiness(driver).click();
	        Thread.sleep(500);
	        HeaderLinks.lnk_Users(driver).click();
	        Thread.sleep(500);
	        Screenshot.Execute(driver); //verify user before deletion
	        Thread.sleep(500);
	        UsersPage.btn_EditUser(driver).click();
	        Thread.sleep(500);
	        String Actualtext = UsersPage.input_emailAddr(driver).getAttribute("value");
	        //System.out.println("cqadmin email is:" +Actualtext);
	        UsersPage.UpProfileCancel(driver).click();
	        Thread.sleep(500);
	        UsersPage.btn_DeleteUser(driver).click();
	        Thread.sleep(500);
	        driver.switchTo().alert().accept();   
	        Thread.sleep(500);
	        Logout_Action.Execute(driver);
	        Thread.sleep(500);
	        WelcomePage.lnk_Login(driver).click();
	        Thread.sleep(500);
			LoginPage.input_email(driver).sendKeys(Actualtext);
			Thread.sleep(500);
			LoginPage.input_password(driver).sendKeys("secret");
			Thread.sleep(500);
			LoginPage.btn_login(driver).click();	
			Thread.sleep(500);
		    String Deletetext = LoginPage.verifydeleteUserPath(driver).getText();	    
		    Assert.assertEquals(Deletetext,"Your account is currently inactivated. Please contact your administrator for assistance.");
		 }
	        
	    //verify delete a user - Bsn Admin
		@Test(enabled=true,priority=5, groups = {"Regression_Functional"})
		public void deleteUserBsnAdmin() throws Exception {
			Login_Action.Execute(driver, "DeleteBusinessUser");
			Thread.sleep(500);
	        HeaderLinks.lnk_MyBusiness(driver).click();
	        Thread.sleep(500);
	        HeaderLinks.lnk_Users(driver).click();
	        Thread.sleep(500);
	        Screenshot.Execute(driver); //verify user before deletion
	        Thread.sleep(500);
	        UsersPage.btn_EditUser(driver).click();
	        Thread.sleep(500);
	        String Actualtext = UsersPage.input_emailAddr(driver).getAttribute("value");
	        Thread.sleep(500);
	        //System.out.println("badmin email is:" +Acstualtext);
	        UsersPage.UpProfileCancel(driver).click();
	        Thread.sleep(500);
	        UsersPage.btn_DeleteUser(driver).click();
	        Thread.sleep(500);
	        driver.switchTo().alert().accept();  
	        Thread.sleep(500);
	        Logout_Action.Execute(driver);
	        Thread.sleep(500);
	        WelcomePage.lnk_Login(driver).click();
	        Thread.sleep(500);
			LoginPage.input_email(driver).sendKeys(Actualtext);
			Thread.sleep(500);
			LoginPage.input_password(driver).sendKeys("secret");
			Thread.sleep(500);
			LoginPage.btn_login(driver).click();		
			Thread.sleep(500);
		    String Deletetext = LoginPage.verifydeleteUserPath(driver).getText();	    
		    Assert.assertEquals(Deletetext,"Your account is currently inactivated. Please contact your administrator for assistance.");
		 }
 
	}

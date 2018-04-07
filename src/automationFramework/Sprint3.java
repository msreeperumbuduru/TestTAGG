package automationFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
        WelcomePage.lnk_Yearly(driver).click();
        Screenshot.Execute(driver);
		WelcomePage.lnk_LargeTrialYr(driver).click();
	}
        
    //verify no donation request form - CQ Admin
	@Test(enabled=true,priority=2)
	public void omitDonFormCQAdmin() throws Exception {
        Login_Action.Execute(driver, "CharityQAdmin");
        HeaderLinks.lnk_MyBusiness(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
	}
        
    //no donation request form - CQ User
	@Test(enabled=true,priority=3)
	public void omitDonFormCQUser() throws Exception { 
        Login_Action.Execute(driver, "CharityQUser");
        HeaderLinks.lnk_MyBusiness(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver); 
	}
	
	   //verify dashboard,don pref - Busn Admin
		@Test(enabled=true,priority=4)
		public void myDonationFormbadmin() throws Exception { 
			Login_Action.Execute(driver, "BusinessAdmin");	
			Log.info("User logged");
			HeaderLinks.lnk_MyBusiness(driver).click();
			HeaderLinks.lnk_ManualDonReq(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Set<String>ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String parentid = it.next();
			String childid = it.next();
			driver.switchTo().window(childid);
			ManualDonationPage.input_orgname(driver).sendKeys("test");
			Screenshot.Execute(driver);
			driver.close();
			driver.switchTo().window(parentid);
			Logout_Action.Execute(driver);		
		}
		
		   //verify dashboard,don pref - Busn User
			@Test(enabled=true,priority=5)
			public void myDonationFormBuser() throws Exception { 
				Login_Action.Execute(driver, "BusinessUser");	
				Log.info("User logged");
				HeaderLinks.lnk_MyBusiness(driver).click();
				HeaderLinks.lnk_ManualDonReq(driver).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Set<String>ids = driver.getWindowHandles();
				Iterator<String> it = ids.iterator();
				String parentid = it.next();
				String childid = it.next();
				driver.switchTo().window(childid);
				ManualDonationPage.input_orgname(driver).sendKeys("test");
				Screenshot.Execute(driver);
				driver.close();
				driver.switchTo().window(parentid);
				Logout_Action.Execute(driver);	
			}		
		
		//verify delete a user - CQ Admin
		@Test(enabled=true,priority=6, groups = {"Regression_Functional"})
		public void deleteUserCQAdmin() throws Exception {
			Login_Action.Execute(driver, "CharityQAdmin");
	        HeaderLinks.lnk_MyBusiness(driver).click();
	        HeaderLinks.lnk_Users(driver).click();
	        Screenshot.Execute(driver); //verify user before deletion
	        UsersPage.btn_EditUser(driver).click();
	        String Actualtext = UsersPage.input_emailAddr(driver).getAttribute("value");
	        System.out.println("cqadmin email is:" +Actualtext);
	        UsersPage.UpProfileCancel(driver).click();
	        UsersPage.btn_DeleteUser(driver).click();
	        driver.switchTo().alert().accept();   
	        Logout_Action.Execute(driver);
	        WelcomePage.lnk_Login(driver).click();
			LoginPage.input_email(driver).sendKeys(Actualtext);
			LoginPage.input_password(driver).sendKeys("secret");
			LoginPage.btn_login(driver).click();	
		    String Deletetext = LoginPage.verifydeleteUserPath(driver).getText();	    
		    Assert.assertEquals(Deletetext,"Your account is currently inactivated. Please contact your administrator for assistance.");
		 }
	        
	    //verify delete a user - Bsn Admin
		@Test(enabled=false,priority=7, groups = {"Regression_Functional"})
		public void deleteUserBsnAdmin() throws Exception {
			Login_Action.Execute(driver, "BusinessAdmin");
	        HeaderLinks.lnk_MyBusiness(driver).click();
	        HeaderLinks.lnk_Users(driver).click();
	        Screenshot.Execute(driver); //verify user before deletion
	        UsersPage.btn_EditUser(driver).click();
	        String Actualtext = UsersPage.input_emailAddr(driver).getAttribute("value");
	        System.out.println("badmin email is:" +Actualtext);
	        UsersPage.UpProfileCancel(driver).click();
	        UsersPage.btn_DeleteUser(driver).click();
	        driver.switchTo().alert().accept();    	
	        Logout_Action.Execute(driver);
	        WelcomePage.lnk_Login(driver).click();
			LoginPage.input_email(driver).sendKeys(Actualtext);
			LoginPage.input_password(driver).sendKeys("secret");
			LoginPage.btn_login(driver).click();		
		    String Deletetext = LoginPage.verifydeleteUserPath(driver).getText();	    
		    Assert.assertEquals(Deletetext,"Your account is currently inactivated. Please contact your administrator for assistance.");
		 }
	
     //close driver
     @AfterSuite(enabled=true)
     public void closebrowser() throws Exception{ 
    	 driver.close();
      }
 
	}

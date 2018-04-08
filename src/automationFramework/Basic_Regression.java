package automationFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import appModules.*;
import pageObjects.*;
import utility.Constant;
import utility.Log;

public class Basic_Regression extends Constant {
	
	public Basic_Regression() {
		super();
}
	@Test(enabled=false,priority=1)
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
	@Test(enabled=false,priority=2)
	public void Signup() throws Exception { 
		RegisterUser_Action.Execute(driver);
		SubscriptionPage.btn_logout(driver).click();
	}

	@Test(enabled=false,priority=3)
	public void Subscription() throws Exception { 
		Login_Action.Execute(driver, "NewAdminSignUp");
		SubscriptionAction.Execute(driver);	
		Logout_Action.Execute(driver);
	}
	@Test(enabled=false,priority=4)
	public void ManualDonationRequests() throws Exception { 
		Login_Action.Execute(driver,"BusinessAdmin");
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
	public void ApproveDonBadmin() throws Exception {
		Login_Action.Execute(driver,"BusinessAdmin");
		HeaderLinks.lnk_Dashboard(driver).click();
		
	}
	public void RejectDonBadmin() throws Exception { 
		Login_Action.Execute(driver,"BusinessAdmin");
		
	}
	public void ApproveDonBadminDefault() throws Exception { 
		Login_Action.Execute(driver,"BusinessAdmin");
		
	}
	public void RejectDonBadminDefault() throws Exception { 
		Login_Action.Execute(driver,"BusinessAdmin");
		
	}
	public void ApproveDonBUser() throws Exception { 
		
	}
	public void RejectDonUser() throws Exception { 
		
	}
	public void ApproveDonBUserDefault() throws Exception { 
		
	}
	public void RejectDonUserDefault() throws Exception { 
		
	}
	
	
	/*
	//Dashboard BA/BU
		@Test(enabled=true,priority=5)
		public void Dashboard() throws Exception {	
		
			Login_Action.Execute(driver, "BusinessAdmin");
	        HeaderLinks.lnk_Dashboard(driver).click();
	        DashboardPage.input_selectcheck(driver).click();
	        if ( !driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div/div[2]/div/table/tbody/tr/td[1]/input")).isSelected() )
	        {
	             driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div/div[2]/div/table/tbody/tr/td[1]/input")).click();
	        }
	        //DashboardPage.btn_Approve(driver).click();
	        DashboardPage.lnk_Dspan(driver).click();
	        SearchDonationsPage.lnk_cancel(driver).click();
	        DashboardPage.btn_reject(driver).click();
	        Screenshot.Execute(driver);
	        DashboardPage.input_template(driver).click();
	               
			//Login_Action.Execute(driver, "NewAdminSignUp");
		}
		
		//Dashboard CQA/CQU
		@Test(enabled=true,priority=5)
		public void Dashboard_CQAd() throws Exception {	
		
			Login_Action.Execute(driver, "CQ Admin");
			//Login_Action.Execute(driver, "CharityQUser");
			HeaderLinks.lnk_Dashboard(driver).click();
	        DashboardPage.lnk_Dspan_CQ(driver).click();
	        SearchDonationsPage.span_back_CQ(driver).click();
	        //SearchDonationsPage.srch_Acc(driver).click();
	      }
		
	*/
	
}


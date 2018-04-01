package automationFramework;
import utility.Constant;
import utility.Log;

import org.testng.annotations.*;

//import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import java.util.Iterator;

import appModules.*;
import pageObjects.*;

import static org.testng.Assert.assertEquals;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

//4 status - Decline - can be done with manual
//Address attribute first name verification - can be done manually     
//CharityQ removed in email - can be done with manual
//Thankyouclose for buser

public class Sprint2 extends Constant {
	
	public Sprint2() {
		super();
}
	
	@Test(enabled=true,priority=8)
	public void ThankyouClose() throws Exception {

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ManualDonationRequests_Action.Execute(driver);
		driver.close();
		driver.switchTo().window(parentid);
		Logout_Action.Execute(driver);
		
	}
        
	//CharityQ admin role verification
	@Test(enabled=false)
	public void roleverif() throws Exception {
        Login_Action.Execute(driver, "CharityQAdmin");
		HeaderLinks.lnk_MyBusiness(driver).click();			
		HeaderLinks.lnk_Users(driver).click();
		UsersPage.btn_AddUser(driver).click();
		UsersPage.drpdwn_location(driver).selectByVisibleText("CharityQ");
		assertEquals(2, UsersPage.drpdwn_role(driver).getOptions().size());
		StringBuffer options = new StringBuffer();  
		List<WebElement> list=UsersPage.drpdwn_role(driver).getOptions();
		for(int i=0;i<list.size();i++)          
		{
			options.append((list.get(i)).getText());
		}
		assertEquals(options.toString(),"CQ AdminCQ User");
		System.out.println("SP2_TC_5--> PASSED");
		}
		
    //4 status - Incomplete
	@Test(enabled=false)
	public void Incompletestatus() throws Exception {
        WelcomePage.lnk_SignUp(driver).click();
        RegisterUser_Action.Execute(driver);
        SubscriptionPage.btn_logout(driver).click();
        Login_Action.Execute(driver, "CharityQAdmin");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
        Login_Action.Execute(driver, "CharityQUser");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
	}
        
    //4 status - Active
	@Test(enabled=false)
	public void ActiveStatus() throws Exception {
        Login_Action.Execute(driver, "NewAdminSignUp");
        SubscriptionAction.Execute(driver);
        Logout_Action.Execute(driver);
        Login_Action.Execute(driver, "CharityQAdmin");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
        Login_Action.Execute(driver, "CharityQUser");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
	}
        
    //4 status - Cancel
	@Test(enabled=false)
	public void cancelStatus() throws Exception {
        Login_Action.Execute(driver, "NewAdminSignUp");
        BusinessLocationsPage.input_cancelSubs(driver).click();
        Logout_Action.Execute(driver);
        Login_Action.Execute(driver, "CharityQAdmin");
        HeaderLinks.lnk_Dashboard(driver).click();
            //search user name
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
        Login_Action.Execute(driver, "CharityQUser");
        HeaderLinks.lnk_Dashboard(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
	}
        
        
	@AfterTest(enabled=true)
	public void closeBrowser() {
		driver.close();
	}

}


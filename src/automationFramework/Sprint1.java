package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import appModules.*;
import pageObjects.*;
import utility.Constant;
//import utility.Log;

public class Sprint1 {
    
	public static WebDriver driver = null;

	@BeforeSuite
	public void launch() throws Exception {
				
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		//Sprint3.driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		Sprint1.driver = new FirefoxDriver();
		Sprint1.driver.manage().deleteAllCookies();
		Sprint1.driver.manage().window().maximize();
		Sprint1.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Sprint1.driver.get(Constant.URL);
  }

	
//verify comma seperated values currency format - 5 users
//verify barlow font
//mail trap login and search users
//verify cents truncated
//js.ExecuteScript("scroll(3000,0);");
		
    //Request pending as badmin
	@Test(enabled=false, priority=1)
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
        //string a = requestpending().gettext(); webelement list<list> count; if a = count(webelementlist)://excel.write(pass);else excel.write(fail);  
	}
	
    //request pending as buser	
	@Test(enabled=false, priority=2)
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
        //string a = requestpeding().gettext(); webelement list<list> count; if a = count(webelementlist)://excel.write(pass);else excel.write(fail);  
	}
	
	//verify subscription date/cancel subscription as Badmin
	@Test(enabled=false,priority=3)
	public void verifySubsDate() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		HeaderLinks.lnk_MyBusiness(driver).click();
		HeaderLinks.lnk_BusinLocations(driver).click();
		BusinessLocationsPage.input_cancelSubs(driver).click();
		String textVerify = BusinessLocationsPage.label_SubsMessage(driver).getText();
		Assert.assertTrue(textVerify.contains("Subscription ends at:"));
		System.out.println("Subscription end date working");
		Logout_Action.Execute(driver); 
		Login_Action.Execute(driver, "Root");
		Dashboard_Action.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	//Verify update location page as Badmin	
	@Test(enabled=false,priority=4)
	public void updatelocationBAdmin() throws Exception { 
		Login_Action.Execute(driver, "BusinessAdmin");
		UpdateBusinessLocations.Execute(driver);
		Logout_Action.Execute(driver);
	}
	
	//Verify update location page as BUser	
	@Test(enabled=false,priority=5)
	public void updatelocationBuser() throws Exception { 
		Login_Action.Execute(driver, "BusinessUser");
		UpdateBusinessLocations.Execute(driver);
		Logout_Action.Execute(driver);
	}

//change passwd page altered when buser created - manual
//change passwd page altered when cquser created - manual

	//Don pref button functionality as badmin
	//Verify Mydonation form - badmin, buser, cqadmin	
	@Test(enabled=true,priority=6)
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

    //close driver
    @AfterSuite
    public void closebrowser() throws Exception{ 
   	 driver.close();
     }
}


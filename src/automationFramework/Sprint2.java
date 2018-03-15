package automationFramework;
import utility.Constant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import appModules.*;
import pageObjects.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Sprint2 {
    
	private static final WebDriver driver = null;

	@BeforeTest 
	public void launch() throws Exception {
				
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
	}	
	
	
	//Thank you and close verification
	@Test
	public void ThankyouClose() throws Exception {
		Login_Action.Execute(driver, "BusinessAdmin");	
		ManualDonationRequests_Action.Execute(driver);
        Screenshot.Execute(driver);
        driver.close();	
	}
	       
        
	//CharityQ admin role verification
	@Test
	public void roleverif() throws Exception {
        Login_Action.Execute(driver, "CharityQAdmin");
        Add_User_Action.Execute(driver);       
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
	}
        
    //4 status - Incomplete
	@Test
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
	@Test
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
	@Test
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
        
        //4 status - Decline - can be done with manual
        
        //Address attribute first name verification - can be done manually     
        
        //CharityQ removed in email - can be done with manual
        
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}


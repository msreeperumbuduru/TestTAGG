package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import appModules.*;
import pageObjects.*;
import utility.*;

public class Sprint3 {
	
      
	public static WebDriver driver = null;
    
	
	
	@BeforeSuite
	public void launch() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		//Sprint3.driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		Sprint3.driver = new FirefoxDriver();
		Sprint3.driver.manage().deleteAllCookies();
		Sprint3.driver.manage().window().maximize();
		Sprint3.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Sprint3.driver.get(Constant.URL);
    } 
	
		
	//add email template - Bsn Admin
	@Test(enabled=false, priority=1)
    public void addTmpBadmin() throws Exception{
		Login_Action.Execute(driver, "BusinessAdmin");
        HeaderLinks.lnk_MyBusiness(driver).click();
        Log.info("Clicked MyBusiness Link");
        HeaderLinks.lnk_emailtmp(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Logout_Action.Execute(driver);
        //--new email template needed
    }
        
    //add email template - CQ Admin
	@Test(enabled=false, priority=2)
	public void addTmpCqAdmin() throws Exception{
		Login_Action.Execute(driver, "CharityQAdmin");
        HeaderLinks.lnk_MyBusiness(driver).click();
        Log.info("Clicked MyBusiness Link");
        HeaderLinks.lnk_emailtmp(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Logout_Action.Execute(driver);
        //--new email template needed
	}
	
        
    //verify delete a user - CQ Admin
	@Test(enabled=false,priority=3)
	public void deleteUserCQAdmin() throws Exception {
		Login_Action.Execute(driver, "CharityQAdmin");
        HeaderLinks.lnk_MyBusiness(driver).click();
        HeaderLinks.lnk_Users(driver).click();
        Screenshot.Execute(driver); //verify user before deletion
        UsersPage.btn_EditUser(driver).click();
        String Actualtext = UsersPage.input_emailAddr(driver).getAttribute("value");
        System.out.println("email is:" +Actualtext);
        UsersPage.UpProfileCancel(driver).click();
        System.out.print("1");
        UsersPage.btn_DeleteUser(driver).click();
        System.out.print("2");
        driver.switchTo().alert().accept();   
        System.out.print("3");
        Logout_Action.Execute(driver);
        System.out.print("4");
        WelcomePage.lnk_Login(driver).click();
        System.out.print("5");
		LoginPage.input_email(driver).sendKeys(Actualtext);
		System.out.print("6");
		LoginPage.input_password(driver).sendKeys("secret");
		System.out.print("7");
		LoginPage.btn_login(driver).click();	
		System.out.print("8");
	    String Deletetext = LoginPage.verifydeleteUserPath(driver).getText();
	    System.out.print("9");	    
	    Assert.assertEquals(Deletetext,"Your account is currently inactivated. Please contact your administrator for assistance.");
	    System.out.print("\n deleteUserCQAdmin() -> CQ Admin Deletion executed");
	    Logout_Action.Execute(driver);
	 }
        
    //verify delete a user - Bsn Admin
	@Test(enabled=false,priority=4)
	public void deleteUserBsnAdmin() throws Exception {
		Login_Action.Execute(driver, "BusinessAdmin");
        HeaderLinks.lnk_MyBusiness(driver).click();
        HeaderLinks.lnk_Users(driver).click();
        Screenshot.Execute(driver); //verify user before deletion
        UsersPage.btn_EditUser(driver).click();
        String Actualtext = UsersPage.input_emailAddr(driver).getAttribute("value");
        System.out.println("email is:" +Actualtext);
        UsersPage.UpProfileCancel(driver).click();
        UsersPage.btn_DeleteUser(driver).click();
        driver.switchTo().alert().accept();    	
        Logout_Action.Execute(driver);
        WelcomePage.lnk_Login(driver).click();
		LoginPage.input_email(driver).sendKeys(Actualtext);
		LoginPage.input_password(driver).sendKeys("secret");
		LoginPage.btn_login(driver).click();		
	    String Deletetext = LoginPage.verifydeleteUserPath(driver).getText();
	    //String VerifyDeletetext = LoginPage.verify_deleteUserVerify(driver).getText();	    
	    Assert.assertEquals(Deletetext,"Your account is currently inactivated. Please contact your administrator for assistance.");
	    System.out.print("\n deleteUserBsnAdmin() -> Bsn Admin Deletion executed");
	    Logout_Action.Execute(driver);
	 }
		
    //verify pricing page
	@Test(enabled=false,priority=5)
	public void pricingPage() throws Exception {	
        WelcomePage.lnk_Pricing(driver).click();
        WelcomePage.lnk_Yearly(driver).click();
        Screenshot.Execute(driver);
        System.out.print("\n Pricing functionality working");
	}
        
    //verify no donation request form - CQ Admin
	@Test(enabled=false,priority=6)
	public void omitDonFormCQAdmin() throws Exception {
        Login_Action.Execute(driver, "CharityQAdmin");
        HeaderLinks.lnk_MyBusiness(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver);
	}
        
    //no donation request form - CQ User
	@Test(enabled=false,priority=7)
	public void omitDonFormCQUser() throws Exception { 
        Login_Action.Execute(driver, "CharityQUser");
        HeaderLinks.lnk_MyBusiness(driver).click();
        Screenshot.Execute(driver);
        Logout_Action.Execute(driver); 
	}
	
	   //verify dashboard,don pref - Busn Admin
		@Test(enabled=false,priority=7)
		public void myDonationFormbadmin() throws Exception { 
			String winHandleBefore = driver.getWindowHandle();
	        Login_Action.Execute(driver, "BusinessAdmin");
	        HeaderLinks.lnk_MyBusiness(driver).click();
	        HeaderLinks.lnk_ManualDonReq(driver).click();
	        
	        for(String winHandle : driver.getWindowHandles()){
	            driver.switchTo().window(winHandle);
	        }
	        driver.switchTo().window(winHandleBefore);	
	        Logout_Action.Execute(driver); 
		}
		
		   //verify dashboard,don pref - Busn User
			@Test(enabled=false,priority=8)
			public void myDonationFormBuser() throws Exception { 
				String winHandleBefore = driver.getWindowHandle();
		        Login_Action.Execute(driver, "BusinessUser");
		        HeaderLinks.lnk_MyBusiness(driver).click();
		        HeaderLinks.lnk_ManualDonReq(driver).click();
		        
		        for(String winHandle : driver.getWindowHandles()){
		            driver.switchTo().window(winHandle);
		        }
		        driver.switchTo().window(winHandleBefore);	
		        Logout_Action.Execute(driver); 
			}		

	
     //close driver
     @AfterSuite
     public void closebrowser() throws Exception{ 
    	 driver.close();
      }
 
	}



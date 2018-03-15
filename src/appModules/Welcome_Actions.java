package appModules;
//import automationFramework.*;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
//import utility.ExcelUtils;
//import utility.Log;

public class Welcome_Actions {
	public static void Execute(WebDriver driver) throws Exception{
		
    	WelcomePage.lnk_topCharityQ(driver).click();
    	WelcomePage.lnk_AboutUs(driver).click();
    	WelcomePage.lnk_HowItWorks(driver).click();
    	WelcomePage.lnk_Pricing(driver).click();
    	WelcomePage.lnk_Yearly(driver).click();
    	WelcomePage.lnk_MediumTriaYr(driver).click();
        WelcomePage.lnk_SignUp(driver).click();
    	WelcomePage.lnk_Login(driver).click();    	    	
	}
}



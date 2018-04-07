package automationFramework;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import appModules.Login_Action;
import appModules.Logout_Action;
import pageObjects.HeaderLinks;
import utility.Constant;
import utility.Log;

public class Sprint5 extends Constant{
	
	public Sprint5() {
		super();
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

}

package appModules;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.*;

public class DonationPreferences{

	public static void Execute(WebDriver driver, String Budget, String Notice, String Amt) throws Exception {
		
		String budget = "";
		String notice = "";
		String amt = "";
		
		if (Budget == "PendingRejection")
		{
			budget = "400";         
		}
		if (Notice == "PendingRejection")
		{
			budget = "5";         
		}
	
		if (Amt == "PendingRejection")
		{
			budget = "100";         
		}
		
		else if(Budget == "PendingRejection" && Notice == "PendingRejection" && Amt == "PendingRejection"  )
		{
			budget = "400";
			notice = "5";
			amt = "100";
		}
		else if(Budget == "PendingAccept" && Notice == "PendingAccept" && Amt == "PendingAccept"  )
		{
			budget = "3000";
			notice = "14";
			amt = "600";
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_MyBusiness(driver).click();
		Thread.sleep(5000);
		HeaderLinks.lnk_DonationPref(driver).click();	
		Thread.sleep(5000);
		
		DonationPreferencesPage.input_monthlyBudget(driver).clear();
		DonationPreferencesPage.input_monthlyBudget(driver).sendKeys(budget);
		Thread.sleep(5000);
		DonationPreferencesPage.input_notice(driver).clear();
		DonationPreferencesPage.input_notice(driver).sendKeys(notice);
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, 200)");
		DonationPreferencesPage.chk_k12(driver).click();
		Thread.sleep(5000);
		DonationPreferencesPage.chk_no(driver).click();
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, 200)");
		DonationPreferencesPage.chk_no(driver).click();
		Thread.sleep(5000);
		DonationPreferencesPage.input_amtreq(driver).clear();
		DonationPreferencesPage.input_amtreq(driver).sendKeys(amt);
		Thread.sleep(5000);
		DonationPreferencesPage.btnSave(driver).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		DonationPreferencesPage.btnSave(driver).click();
		Thread.sleep(5000);
		String saveMsgText = DonationPreferencesPage.saveMsg(driver).getText();	    
	    Assert.assertEquals(saveMsgText,"Donation preferences have been saved successfully !");
        
	}
}


package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class DonationPreferences{

	public static void Execute(WebDriver driver) throws Exception {
		
		String budget = "1000";
		String notice = "14";
		String amt = "500";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_MyBusiness(driver).click();
		HeaderLinks.lnk_DonationPref(driver).click();	
		DonationPreferencesPage.input_monthlyBudget(driver).clear();
		DonationPreferencesPage.input_monthlyBudget(driver).sendKeys(budget);
		DonationPreferencesPage.input_notice(driver).clear();
		DonationPreferencesPage.input_notice(driver).sendKeys(notice);
     	DonationPreferencesPage.chk_cg(driver).click();
		DonationPreferencesPage.chk_no(driver).click();
		DonationPreferencesPage.chk_othdon(driver).click();
		DonationPreferencesPage.input_amtreq(driver).clear();
		DonationPreferencesPage.input_amtreq(driver).sendKeys(amt);
		DonationPreferencesPage.btnSave(driver).click();
	}
}


package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class DonationPreferences{

	public static void Execute(WebDriver driver) throws Exception {
		
		String budget = "20";
		String notice = "1000";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_DonationPref(driver).click();	
		DonationPreferencesPage.input_notice(driver).sendKeys(budget);
		DonationPreferencesPage.input_monthlyBudget(driver).sendKeys(notice);
		DonationPreferencesPage.btnSave(driver).click();
	}
}


package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class MyDonationForm {

	public static void Execute(WebDriver driver) throws Exception{
		HeaderLinks.lnk_MyDonationForm(driver).click();
		Screenshot.Execute(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_MyDonationForm(driver).click();			
		MyDonationFormPage.lnk_createURL(driver).click();
		MyDonationFormPage.lnk_embeddedCodeForm(driver).click();
		MyDonationFormPage.btn_setPreferences(driver).click();
	}
	
}
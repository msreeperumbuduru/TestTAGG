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
		String URLtext =MyDonationFormPage.input_createURL(driver).getAttribute("value");	
        driver.get(URLtext);
		ManualDonationRequests_Action.Execute(driver);
		driver.navigate().back();
		driver.navigate().back();
 		MyDonationFormPage.lnk_embeddedCodeForm(driver).click();
		String EmbededdFormCode =MyDonationFormPage.input_embeddedCodeForm(driver).getAttribute("value");
		MyDonationFormPage.btn_setPreferences(driver).click();
		driver.navigate().back();
		MyDonationFormPage.btn_Cancel(driver).click();
	}
	
}
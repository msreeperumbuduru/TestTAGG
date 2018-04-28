package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class MyDonationForm {

	public static void Execute(WebDriver driver) throws Exception{
		HeaderLinks.lnk_MyDonationForm(driver).click();
		Thread.sleep(5000);
		Screenshot.Execute(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_MyDonationForm(driver).click();
		Thread.sleep(5000);
		MyDonationFormPage.lnk_createURL(driver).click();
		Thread.sleep(5000);
        MyDonationFormPage.lnk_embeddedCodeForm(driver).click();
     	Thread.sleep(5000);
		String URLtext =MyDonationFormPage.input_createURL(driver).getAttribute("value");	
        driver.get(URLtext);
		ManualDonationRequests_Action.Execute(driver);Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
// 		MyDonationFormPage.lnk_embeddedCodeForm(driver).click();
//		Thread.sleep(1000);
//		String EmbededdFormCode =MyDonationFormPage.input_embeddedCodeForm(driver).getAttribute("value");
//		MyDonationFormPage.btn_setPreferences(driver).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		MyDonationFormPage.btn_Cancel(driver).click();
//		Thread.sleep(1000);
	}
	
}
package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class SubscriptionAction {
	public static void Execute(WebDriver driver) throws Exception{
		String promo = "offertagg30";
		String cardno = "4242424242424242";
		String expmm = "11";
		String expyy = "21";
		String cvv = "123";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		SubscriptionPage.radio_locations_25(driver).click();
		Thread.sleep(5000);
		SubscriptionPage.radio_plan_annual(driver).click();
		Thread.sleep(5000);
		SubscriptionPage.input_promocode(driver).sendKeys(promo);
		Thread.sleep(5000);
		SubscriptionPage.btn_Apply(driver).click();
		Thread.sleep(5000);
		SubscriptionPage.input_cardNo(driver).sendKeys(cardno);
		Thread.sleep(5000);
		SubscriptionPage.input_expMonth(driver).sendKeys(expmm);
		Thread.sleep(5000);
		SubscriptionPage.input_expYear(driver).sendKeys(expyy);
		Thread.sleep(5000);
		SubscriptionPage.input_CVV(driver).sendKeys(cvv);
		Thread.sleep(5000);
		SubscriptionPage.btn_Pay(driver).click();
		Thread.sleep(5000);
	}
}

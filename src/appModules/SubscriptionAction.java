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
		SubscriptionPage.radio_locations_25(driver).click();
		SubscriptionPage.radio_plan_annual(driver).click();
		SubscriptionPage.input_promocode(driver).sendKeys(promo);
		SubscriptionPage.btn_Apply(driver).click();
		SubscriptionPage.input_cardNo(driver).sendKeys(cardno);
		SubscriptionPage.input_expMonth(driver).sendKeys(expmm);
		SubscriptionPage.input_expYear(driver).sendKeys(expyy);
		SubscriptionPage.input_CVV(driver).sendKeys(cvv);
		SubscriptionPage.btn_Pay(driver).click();
	}
}

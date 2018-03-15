package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class SubscriptionAction {
	public static void Execute(WebDriver driver) throws Exception{
		String location = "Up to 25";
		String plan = "Anually";
		//String promo = "";
		String cardno = "4242424242424242";
		String expmm = "11";
		String expyy = "21";
		String cvv = "123";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SubscriptionPage.drpdwn_locations(driver).selectByVisibleText(location);
		SubscriptionPage.ddrpdwn_plan(driver).selectByVisibleText(plan);
		SubscriptionPage.input_cardNo(driver).sendKeys(cardno);
		SubscriptionPage.input_expMonth(driver).sendKeys(expmm);
		SubscriptionPage.input_expYear(driver).sendKeys(expyy);
		SubscriptionPage.input_CVV(driver).sendKeys(cvv);
		SubscriptionPage.btn_Pay(driver).click();
	}
}

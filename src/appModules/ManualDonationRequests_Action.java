package appModules;
import pageObjects.*;

import org.openqa.selenium.WebDriver;

public class ManualDonationRequests_Action {

	public static void Execute(WebDriver driver) throws Exception {
		
		String orgname = "Orange Travels";
        String orgtype = "Environment";
		String fn = "Orange";
        String ln = "Travel";
        String email = "orange.travel@gmail.com";
        String phone = "4021335670";
        String addr1 = "Q Street";
        String addr2 = "";
        String city = "Omaha";
        String state = "Nebraska";
        String zip = "69012";
        String reqfor = "Cash/Check";
        String dolamt = "800";
        String donpurp = "Donation";
        String neededbydate = "3/31/2018";
        String eventname = "Charity Fund Raiser";
        String eventdate = "4/31/2018";
        String purpose = "Other";
        String noattend = "20";
        String venue = "Millard Public Library";
        String marketoopr = "TBA";
		
		ManualDonationPage.input_orgname(driver).sendKeys(orgname);
		ManualDonationPage.drpdwn_orgtype(driver).selectByVisibleText(orgtype);
		ManualDonationPage.input_fn(driver).sendKeys(fn);
		ManualDonationPage.input_ln(driver).sendKeys(ln);
		ManualDonationPage.input_email(driver).sendKeys(email);
		ManualDonationPage.input_phone(driver).sendKeys(phone);
		ManualDonationPage.input_addr1(driver).sendKeys(addr1);
		ManualDonationPage.input_addr2(driver).sendKeys(addr2);
		ManualDonationPage.input_city(driver).sendKeys(city);
		ManualDonationPage.inputState(driver).selectByVisibleText(state);
		ManualDonationPage.input_zip(driver).sendKeys(zip);
		ManualDonationPage.btn_noRadio(driver).click();
		ManualDonationPage.drpdwn_requestfor(driver).sendKeys(reqfor);
		ManualDonationPage.input_dollaramt(driver).sendKeys(dolamt);
		ManualDonationPage.input_donpurpose(driver).sendKeys(donpurp);
		ManualDonationPage.cal_neededby(driver).sendKeys(neededbydate);
		ManualDonationPage.input_eventname(driver).sendKeys(eventname);
		ManualDonationPage.cal_eventdate(driver).sendKeys(eventdate);
		ManualDonationPage.input_purpose(driver).sendKeys(purpose);
		ManualDonationPage.input_noofattendees(driver).sendKeys(noattend);
		ManualDonationPage.input_eventvenue(driver).sendKeys(venue);
		ManualDonationPage.input_marketoppr(driver).sendKeys(marketoopr);
		ManualDonationPage.btn_sendrequest(driver).click();			
	}
}

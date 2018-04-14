package appModules;
import pageObjects.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ManualDonationRequestsDonPref_Action {

	public static void Execute(WebDriver driver, String Monthly, String Notice, String OrgType, String Tax, String DonType, String MaxAmt) throws Exception {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy "); 	 
	   	
		Date dt = new Date();
	   	Calendar c = Calendar.getInstance(); 	 
	   	c.setTime(dt);
	   	c.add(Calendar.DATE, 10);
	   	dt = c.getTime();
	   	String dateneeded= dateFormat.format(dt);
	   	
	   	Date dt1 = new Date();
	   	Calendar c1 = Calendar.getInstance(); 
	   	c1.setTime(dt1); 
	   	c1.add(Calendar.DATE, 20);
	   	dt1 = c1.getTime();
	   	String dateevent= dateFormat.format(dt1);
   	
		
		String orgname = "Orange Travels1";
        String orgtype = "Environment";
		String fn = "Orange";
        String ln = "Travel";
        String email = "orange.travel1@gmail.com";
        String phone = "4021335670";
        String addr1 = "Q Street";
        String addr2 = "";
        String city = "Omaha";
        String state = "Nebraska";
        String zip = "69012";
        String donpurp = "Donation";
        String eventname = "Charity Fund Raiser";
        String purpose = "Other";
        String noattend = "20";
        String venue = "Millard Public Library";
        String marketoopr = "TBA";
        String reqfor = "";
        String dolamt = "";
		
		if (Monthly == "PendingRejection")
		{
			dolamt = "500";         
		}
		if (Notice == "PendingRejection")
		{
			Notice = "";         
		}
		if (Monthly == "default" && Notice == "default" && OrgType == "default" && Tax == "default" && DonType == "default" && MaxAmt == "default")
		{
	        reqfor = "";
	        dolamt = "520";         
		}
        
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
		ManualDonationPage.drpdwn_requestfor(driver).selectByVisibleText(reqfor);
		ManualDonationPage.input_dollaramt(driver).sendKeys(dolamt);
		ManualDonationPage.input_donpurpose(driver).selectByVisibleText(donpurp);
		ManualDonationPage.cal_neededby(driver).sendKeys(dateneeded);
		ManualDonationPage.input_eventname(driver).sendKeys(eventname);
		ManualDonationPage.cal_eventdate(driver).sendKeys(dateevent);
		ManualDonationPage.input_purpose(driver).selectByVisibleText(purpose);
		ManualDonationPage.input_noofattendees(driver).sendKeys(noattend);
		ManualDonationPage.input_eventvenue(driver).sendKeys(venue);
		ManualDonationPage.input_marketoppr(driver).sendKeys(marketoopr);
		ManualDonationPage.btn_sendrequest(driver).click();	
		Screenshot.Execute(driver);
	}
}

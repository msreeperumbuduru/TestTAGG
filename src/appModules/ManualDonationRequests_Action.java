package appModules;
import pageObjects.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ManualDonationRequests_Action {

	public static void Execute(WebDriver driver) throws Exception {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy "); 	 
	   	Date dt = new Date();Date dt1 = new Date();
	   	Calendar c = Calendar.getInstance(); Calendar c1 = Calendar.getInstance(); 
	   	c.setTime(dt);c1.setTime(dt1);  
	   	c.add(Calendar.DATE, 10);c1.add(Calendar.DATE, 20);
	   	dt = c.getTime();dt1 = c1.getTime();
	   	String dateneeded= dateFormat.format(dt);String dateevent= dateFormat.format(dt1);
	   	//System.out.println(dateneeded);
	   	//System.out.println(dateevent);
		
	   	String busnloc = "Business Limited";
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
        String reqfor = "Cash/Check";
        String dolamt = "800";
        String donpurp = "Donation";
        //String neededbydate = "3/31/2018";
        //String neededbydate = dateneeded;
        String eventname = "Charity Fund Raiser";
        //String eventdate = "4/31/2018";
        //String eventdate = dateevent;
        String purpose = "Other";
        String noattend = "20";
        String venue = "Millard Public Library";
        String marketoopr = "TBA";
        
        Thread.sleep(5000);
        ManualDonationPage.drpdwn_bsnloc(driver).selectByVisibleText(busnloc);
        Thread.sleep(5000);
		ManualDonationPage.input_orgname(driver).sendKeys(orgname);
		Thread.sleep(5000);
		ManualDonationPage.drpdwn_orgtype(driver).selectByVisibleText(orgtype);
		Thread.sleep(5000);
		ManualDonationPage.input_fn(driver).sendKeys(fn);
		Thread.sleep(5000);
		ManualDonationPage.input_ln(driver).sendKeys(ln);
		Thread.sleep(5000);
		ManualDonationPage.input_email(driver).sendKeys(email);
		Thread.sleep(5000);
		ManualDonationPage.input_phone(driver).sendKeys(phone);
		Thread.sleep(5000);
		ManualDonationPage.input_addr1(driver).sendKeys(addr1);
		Thread.sleep(5000);
		ManualDonationPage.input_addr2(driver).sendKeys(addr2);
		Thread.sleep(5000);
		ManualDonationPage.input_city(driver).sendKeys(city);
		Thread.sleep(5000);
		ManualDonationPage.inputState(driver).selectByVisibleText(state);
		Thread.sleep(5000);
		ManualDonationPage.input_zip(driver).sendKeys(zip);
		Thread.sleep(5000);
		ManualDonationPage.btn_noRadio(driver).click();
		Thread.sleep(5000);
		ManualDonationPage.drpdwn_requestfor(driver).selectByVisibleText(reqfor);
		Thread.sleep(5000);
		ManualDonationPage.input_dollaramt(driver).sendKeys(dolamt);
		Thread.sleep(5000);
		ManualDonationPage.input_donpurpose(driver).selectByVisibleText(donpurp);
		Thread.sleep(5000);
		ManualDonationPage.cal_neededby(driver).sendKeys(dateneeded);
		Thread.sleep(5000);
		ManualDonationPage.input_eventname(driver).sendKeys(eventname);
		Thread.sleep(5000);
		ManualDonationPage.cal_eventdate(driver).sendKeys(dateevent);
		Thread.sleep(5000);
		ManualDonationPage.input_purpose(driver).selectByVisibleText(purpose);
		Thread.sleep(5000);
		ManualDonationPage.input_noofattendees(driver).sendKeys(noattend);
		Thread.sleep(5000);
		ManualDonationPage.input_eventvenue(driver).sendKeys(venue);
		Thread.sleep(5000);
		ManualDonationPage.input_marketoppr(driver).sendKeys(marketoopr);
		Thread.sleep(5000);
		ManualDonationPage.btn_sendrequest(driver).click();	
		Thread.sleep(5000);
		Screenshot.Execute(driver);
	}
}

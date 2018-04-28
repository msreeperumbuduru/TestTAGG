package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BusinessLocationsPage;
import pageObjects.BusinessProfilePage;
import pageObjects.HeaderLinks;

public class AddBusinessLocation_Action{

public static void Execute(WebDriver driver, String User) throws Exception {
	
	String name = "";
	String desc = "";
	String addr1 = "";
	String addr2 = "";
	String city = "";
	String state = "";
	String zip = "";
	String phone = "";
	
if (User == "BusinessAdmin") {
	name = "Business LTD1";
	desc = "Child Business LTD";
	addr1 = "K Street";
	addr2 = "Palza #3";
	city = "Omaha";
	state = "Nebraska";
	zip = "68122";
	phone = "4021234569";
}

    BusinessLocationsPage.btn_addbsnloc(driver).click();
    Thread.sleep(500);
	BusinessProfilePage.input_bsnName(driver).sendKeys(name);
	Thread.sleep(500);
	BusinessProfilePage.input_bsnDes(driver).sendKeys(desc);
	Thread.sleep(500);
	BusinessProfilePage.input_addr1(driver).sendKeys(addr1);
	Thread.sleep(500);
	BusinessProfilePage.input_addr2(driver).sendKeys(addr2);
	Thread.sleep(500);
	BusinessProfilePage.input_city(driver).sendKeys(city);
	Thread.sleep(500);
	BusinessProfilePage.drpdwn_state(driver).selectByVisibleText("Nebraska");
	Thread.sleep(500);
	BusinessProfilePage.input_zipcode(driver).sendKeys(zip);
	Thread.sleep(500);
	BusinessProfilePage.input_phoneno(driver).sendKeys(phone);
	Thread.sleep(500);
	BusinessLocationsPage.btn_LocaddBsnLoc(driver).click();
}

}

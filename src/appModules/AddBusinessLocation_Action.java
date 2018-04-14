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
	BusinessProfilePage.input_bsnName(driver).sendKeys(name);
	BusinessProfilePage.input_bsnDes(driver).sendKeys(desc);
	BusinessProfilePage.input_addr1(driver).sendKeys(addr1);
	BusinessProfilePage.input_addr2(driver).sendKeys(addr2);
	BusinessProfilePage.input_city(driver).sendKeys(city);
	BusinessProfilePage.drpdwn_state(driver).selectByVisibleText("Nebraska");
	BusinessProfilePage.input_zipcode(driver).sendKeys(zip);
	BusinessProfilePage.input_phoneno(driver).sendKeys(phone);
	BusinessLocationsPage.btn_LocaddBsnLoc(driver).click();
}

}

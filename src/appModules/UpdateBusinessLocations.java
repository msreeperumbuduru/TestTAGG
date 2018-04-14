package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

	public class UpdateBusinessLocations {
		
		public static void Execute(WebDriver driver, String User) throws Exception{	
			
			String name = "";
			String desc = "";
			String addr1 = "";
			String addr2 = "";
			String city = "";
			String state = "";
			String zip = "";
			String phone = "";
			
		if (User == "BusinessAdmin") {
			name = "Business LTD";
			desc = "Business Admin";
			addr1 = "M Street";
			addr2 = "";
			city = "Omaha";
			state = "Nebraska";
			zip = "68104";
			phone = "4021234567";
		}
		
		if (User == "BusinessUser") {
			name = "Business LTD";
			desc = "Business User";
			addr1 = "Q Street";
			addr2 = "";
			city = "Omaha";
			state = "Nebraska";
			zip = "68107";
			phone = "4021234568";
		}
		
		if (User == "CharityQAdmin") {
			name = "CharityQ";
			desc = "Administrator and Owner of CharityQ";
			addr1 = "17117 Oak Drive";
			addr2 = "Ste. A";
			city = "Omaha";
			state = "Nebraska";
			zip = "68130";
			phone = "4027155230";
		}
		
		if (User == "CharityQUser") {
			name = "CharityQ";
			desc = "Administrator and Owner of CharityQ";
			addr1 = "17117 Oak Drive";
			addr2 = "Ste. A";
			city = "Omaha";
			state = "Nebraska";
			zip = "68130";
			phone = "4027155230";
		}

		    HeaderLinks.lnk_MyBusiness(driver).click();
		    HeaderLinks.lnk_BusinessProfile(driver).click();
			BusinessProfilePage.btn_edit(driver).click();
			BusinessProfilePage.input_bsnName(driver).clear();
			BusinessProfilePage.input_bsnName(driver).sendKeys(name);
			BusinessProfilePage.input_bsnDes(driver).clear();
			BusinessProfilePage.input_bsnDes(driver).sendKeys(desc);
			BusinessProfilePage.input_addr1(driver).clear();
			BusinessProfilePage.input_addr1(driver).sendKeys(addr1);
			BusinessProfilePage.input_addr2(driver).clear();
			BusinessProfilePage.input_addr2(driver).sendKeys(addr2);
			BusinessProfilePage.input_city(driver).clear();
			BusinessProfilePage.input_city(driver).sendKeys(city);
			BusinessProfilePage.drpdwn_state(driver).selectByVisibleText("Nebraska");
			BusinessProfilePage.input_zipcode(driver).clear();
			BusinessProfilePage.input_zipcode(driver).sendKeys(zip);
			BusinessProfilePage.input_phoneno(driver).clear();
			BusinessProfilePage.input_phoneno(driver).sendKeys(phone);
			BusinessProfilePage.btn_save(driver).click();
			BusinessProfilePage.btn_cancel(driver).click();
		}
}
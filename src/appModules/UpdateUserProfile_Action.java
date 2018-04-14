package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class UpdateUserProfile_Action {


	public static void Execute(WebDriver driver, String User) throws Exception {
		
		String firstname = "";
		String lastname = "";
		String email = "";
		String addr1 = "";
		String addr2 = "";
		String city = "";
		String state = "";
		String zip = "";
		String phone = "";
		
		if (User == "BusinessAdmin") {
		firstname = "Business";
		lastname = "Admin";
		email = "badmin@cq.com";
		addr1 = "62nd Street, Elmwood Park Road";
		addr2 = "Peter Keweit Institute";
		city = "Omaha";
		state = "Nebraska";
		zip = "68109";
		phone = "4024738743";	
		}		
		if (User == "BusinessUser") {
		firstname = "Business";
		lastname = "User";
		email = "buser@cq.com";
		addr1 = "62nd Street, Elmwood Park Road";
		addr2 = "Peter Keweit Institute";
		city = "Omaha";
		state = "Nebraska";
		zip = "68109";
		phone = "4024738743";	
		}
		if (User == "CQAdmin") {
		firstname = "CQ";
		lastname = "Admin";
		email = "cqadmin@cq.com";
		addr1 = "17117 Oak Drive";
		addr2 = "Ste. A";
		city = "Omaha";
		state = "Nebraska";
		zip = "68130";
		phone = "4027155230";	
		}
		if (User == "CQUser") {
		firstname = "CQ";
		lastname = "User";
		email = "cquser@cq.com";
		addr1 = "17117 Oak Drive";
		addr2 = "Ste. A";
		city = "Omaha";
		state = "Nebraska";
		zip = "68130";
		phone = "4027155230";	
		}
		
		
		UserProfilePage.btn_Edit(driver).click();
		UserProfilePage.input_FirstName(driver).sendKeys(firstname);			
		UserProfilePage.input_LastName(driver).sendKeys(lastname);
		UserProfilePage.input_Email(driver).sendKeys(email);
		UserProfilePage.input_Address1(driver).sendKeys(addr1);
		UserProfilePage.input_Address2(driver).sendKeys(addr2);
		UserProfilePage.input_City(driver).sendKeys(city);
		UserProfilePage.input_State(driver).selectByVisibleText(state);
		UserProfilePage.input_ZipCode(driver).sendKeys(zip);
		UserProfilePage.input_PhoneNumber(driver).sendKeys(phone);	
		UserProfilePage.btn_Save(driver).click();
		UserProfilePage.btn_Cancel(driver).click();
	}
}
package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class UpdateUserProfile_Action {


	public static void Execute(WebDriver driver) throws Exception {
		
		String firstname = "Business";
		String lastname = "Admin";
		String email = "badmin@cq.com";
		String addr1 = "62nd Street, Elmwood Park Road";
		String addr2 = "Peter Keweit Institute";
		String city = "Omaha";
		String state = "Nebraska";
		String zip = "68109";
		String phone = "4024738743";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
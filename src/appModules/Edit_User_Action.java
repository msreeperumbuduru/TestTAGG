package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class Edit_User_Action {

	public static void Execute(WebDriver driver) throws Exception {
		
		String firstname = "Bsn";
		String lastname = "User";
		String emailaddr = "busern@cq.com";
		String location = "CharityQ";
		String role = "Business User";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_MyBusiness(driver).click();			
		HeaderLinks.lnk_Users(driver).click();
		UsersPage.btn_AddUser(driver).click();
		UsersPage.input_editfirstname(driver).clear();
		UsersPage.input_editfirstname(driver).sendKeys(firstname);
		UsersPage.input_editlastname(driver).clear();
		UsersPage.input_editlastname(driver).sendKeys(lastname);
		UsersPage.input_editemailAddr(driver).clear();
		UsersPage.input_editemailAddr(driver).sendKeys(emailaddr);
		UsersPage.drpdwn_editbsnlocation(driver).selectByVisibleText(location);
		UsersPage.drpdwn_editrole(driver).selectByVisibleText(role);
		UsersPage.btn_update(driver).click();
		UsersPage.UpProfileCancel(driver).click();
	}
	
}
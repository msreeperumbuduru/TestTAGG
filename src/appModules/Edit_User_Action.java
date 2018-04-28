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
		Thread.sleep(500);
		HeaderLinks.lnk_Users(driver).click();
		Thread.sleep(500);
		UsersPage.btn_AddUser(driver).click();
		Thread.sleep(500);
		UsersPage.input_editfirstname(driver).clear();
		UsersPage.input_editfirstname(driver).sendKeys(firstname);
		Thread.sleep(500);
		UsersPage.input_editlastname(driver).clear();
		UsersPage.input_editlastname(driver).sendKeys(lastname);
		Thread.sleep(500);
		UsersPage.input_editemailAddr(driver).clear();
		UsersPage.input_editemailAddr(driver).sendKeys(emailaddr);
		Thread.sleep(500);
		UsersPage.drpdwn_editbsnlocation(driver).selectByVisibleText(location);
		Thread.sleep(500);
		UsersPage.drpdwn_editrole(driver).selectByVisibleText(role);
		Thread.sleep(500);
		UsersPage.btn_update(driver).click();
		Thread.sleep(500);
		UsersPage.UpProfileCancel(driver).click();
	}
	
}
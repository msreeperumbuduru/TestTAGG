package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class Add_User_Action {


	public static void Execute(WebDriver driver) throws Exception {
		
		String firstname = "Bsn";
		String lastname = "User";
		String emailaddr = "busern2@cq.com";
		String location = "CharityQ";
		String role = "CQ User";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_MyBusiness(driver).click();			
		HeaderLinks.lnk_Users(driver).click();
		UsersPage.btn_AddUser(driver).click();
		UsersPage.input_firstname(driver).sendKeys(firstname);
		UsersPage.input_lastname(driver).sendKeys(lastname);
		UsersPage.input_emailAddr(driver).sendKeys(emailaddr);
		UsersPage.drpdwn_location(driver).selectByVisibleText(location);
		UsersPage.drpdwn_role(driver).selectByVisibleText(role);
		Screenshot.Execute(driver);
		UsersPage.submit(driver).click();
	}
	
}


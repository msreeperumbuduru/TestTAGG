package appModules;

import org.openqa.selenium.WebDriver;


import pageObjects.*;

public class RegisterUser_Action {
	public static void Execute(WebDriver driver) throws Exception{
 		 
		String firstname = "Business";
		String lastname = "Admin";
		String email = "BusinessWays@cq.com";
		String passwrd = "secret";
		String confpasswd = "secret";
		String busnname = "Business Metrics";
		String busntype = "Others";
		String Addr1 = "62nd Street, Elmwood Park Road";
		String Addr2 = "Peter Keweit Institute";
		String city = "Omaha";
		String state = "Nebraska";
		String zipcode = "68109";
		String phone = "4024738743";
			
		Thread.sleep(5000);
		WelcomePage.lnk_SignUp(driver).click();
		Thread.sleep(5000);
		RegisterPage.inputFirstName(driver).sendKeys(firstname);
		Thread.sleep(5000);
		RegisterPage.inputLastName(driver).sendKeys(lastname);
		Thread.sleep(5000);
		RegisterPage.inputEmail(driver).sendKeys(email);
		Thread.sleep(5000);
		RegisterPage.inputPassword(driver).sendKeys(passwrd);
		Thread.sleep(5000);
		RegisterPage.inputConfirmPassword(driver).sendKeys(confpasswd);
		Thread.sleep(5000);
		RegisterPage.inputBusinessName(driver).sendKeys(busnname);
		Thread.sleep(5000);
		RegisterPage.inputBusinessType(driver).selectByVisibleText(busntype);
		Thread.sleep(5000);
		RegisterPage.inputAddress1(driver).sendKeys(Addr1);
		Thread.sleep(5000);
		RegisterPage.inputAddress2(driver).sendKeys(Addr2);
		Thread.sleep(5000);
		RegisterPage.inputCity(driver).sendKeys(city);
		Thread.sleep(5000);
		RegisterPage.inputState(driver).selectByVisibleText(state);
		Thread.sleep(5000);
		RegisterPage.inputZipCode(driver).sendKeys(zipcode);
		Thread.sleep(5000);
		RegisterPage.inputPhoneNumber(driver).sendKeys(phone);
		Thread.sleep(5000);
		RegisterPage.clickRegister(driver).click();
		Thread.sleep(5000);
		 
		}
}


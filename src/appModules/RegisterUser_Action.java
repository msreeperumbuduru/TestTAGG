package appModules;

import org.openqa.selenium.WebDriver;


import pageObjects.*;

public class RegisterUser_Action {
	public static void Execute(WebDriver driver) throws Exception{
 		 
		String firstname = "Business";
		String lastname = "Admin";
		String email = "badminuser4@cq.com";
		String passwrd = "secret";
		String confpasswd = "secret";
		String busnname = "Business Limited3";
		String busntype = "Others";
		String Addr1 = "62nd Street, Elmwood Park Road";
		String Addr2 = "Peter Keweit Institute";
		String city = "Omaha";
		String state = "Nebraska";
		String zipcode = "68109";
		String phone = "4024738743";
				
		WelcomePage.lnk_SignUp(driver).click();
		RegisterPage.inputFirstName(driver).sendKeys(firstname);
		RegisterPage.inputLastName(driver).sendKeys(lastname);
		RegisterPage.inputEmail(driver).sendKeys(email);
		RegisterPage.inputPassword(driver).sendKeys(passwrd);
		RegisterPage.inputConfirmPassword(driver).sendKeys(confpasswd);
		RegisterPage.inputBusinessName(driver).sendKeys(busnname);
		RegisterPage.inputBusinessType(driver).selectByVisibleText(busntype);
		RegisterPage.inputAddress1(driver).sendKeys(Addr1);
		RegisterPage.inputAddress2(driver).sendKeys(Addr2);
		RegisterPage.inputCity(driver).sendKeys(city);
		RegisterPage.inputState(driver).selectByVisibleText(state);
		RegisterPage.inputZipCode(driver).sendKeys(zipcode);
		RegisterPage.inputPhoneNumber(driver).sendKeys(phone);
		RegisterPage.clickRegister(driver).click();
		 
		}
}


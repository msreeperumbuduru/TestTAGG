package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.WelcomePage;
public class ResetPassword_Action {
	public static void Execute(WebDriver driver,String sEmail){
		   WelcomePage.lnk_Login(driver).click();
		   LoginPage.lnk_forgotPassword(driver).click();	 
		   LoginPage.input_emailAddress(driver).sendKeys(sEmail);
		   LoginPage.lnk_SendPasswordLink(driver).click();
		   String s = LoginPage.verify_ResetPasswordMessage(driver).getText();
		   String g = LoginPage.verify_WrongPasswordMessage(driver).getText();
		   
		   if (s == ("We have e-mailed your password reset link!"))   	   
			   System.out.println(s);
		   else
			   System.out.println(g);		   
		   }
}


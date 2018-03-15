package appModules;

import org.openqa.selenium.WebDriver;


import pageObjects.*;

public class ChangePassword_Action {
	public static void Execute(WebDriver driver) throws Exception {
		
		String oldpswd = "secret";
		String newpswd = "secret";
		String confirmpswd = "secret";
		
		HeaderLinks.lnk_userame(driver).click();
		HeaderLinks.lnk_changePswd(driver).click();
		ChangePasswdPage.input_old_pswd(driver).sendKeys(oldpswd);
		ChangePasswdPage.input_new_pswd(driver).sendKeys(newpswd);
		ChangePasswdPage.input_confirm_pswd(driver).sendKeys(confirmpswd);
		ChangePasswdPage.btn_submit(driver).click();
	}
}




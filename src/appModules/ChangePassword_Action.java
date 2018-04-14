package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.*;

public class ChangePassword_Action {
	public static void Execute(WebDriver driver) throws Exception {
		
		String oldpswd = "secret";
		String newpswd = "secret";
		String confirmpswd = "secret";

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HeaderLinks.lnk_userame(driver).click();
		HeaderLinks.lnk_changePswd(driver).click();
		ChangePasswdPage.input_old_pswd(driver).sendKeys(oldpswd);
		ChangePasswdPage.input_new_pswd(driver).sendKeys(newpswd);
		ChangePasswdPage.input_confirm_pswd(driver).sendKeys(confirmpswd);
		ChangePasswdPage.btn_submit(driver).click();
		String S = ChangePasswdPage.label_success(driver).getText();
		Assert.assertEquals(S,"Your password has been changed.");
	}
}




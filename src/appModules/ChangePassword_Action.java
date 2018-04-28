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
		Thread.sleep(1000);
		HeaderLinks.lnk_changePswd(driver).click();
		Thread.sleep(1000);
		ChangePasswdPage.input_old_pswd(driver).sendKeys(oldpswd);
		Thread.sleep(1000);
		ChangePasswdPage.input_new_pswd(driver).sendKeys(newpswd);
		Thread.sleep(1000);
		ChangePasswdPage.input_confirm_pswd(driver).sendKeys(confirmpswd);
		Thread.sleep(1000);
		ChangePasswdPage.btn_submit(driver).click();
		Thread.sleep(1000);
		String S = ChangePasswdPage.label_success(driver).getText();
		Assert.assertEquals(S,"Your password has been changed.");
	}
}




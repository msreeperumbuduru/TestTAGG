package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
public class Logout_Action {
	public static void Execute(WebDriver driver){
		
		LogoutPage.lnk_user(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LogoutPage.lnk_logout(driver).click();
	}
}


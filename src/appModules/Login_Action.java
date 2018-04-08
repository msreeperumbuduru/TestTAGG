package appModules;
import org.openqa.selenium.WebDriver;
import pageObjects.*;


public class Login_Action {
	public static void Execute(WebDriver driver, String Email) throws Exception{
		String sEmail="";
		String sPassword="";
		if (Email == "CharityQAdmin")
		{
			sEmail = "cqadmin@cq.com";
            sPassword = "secret";
		}
	
		else if (Email == "CharityQUser")
		{
			sEmail = "cquser@cq.com";
            sPassword = "secret";
		}
		   
		else if (Email == "BusinessAdmin")
		{
			sEmail = "badmin@cq.com";
            sPassword = "secret";
          
		}
		
		else if (Email == "BusinessUser")
		{
			sEmail = "buser@cq.com";
            sPassword = "secret";
		}
		
		else if (Email == "Root")
		{
			sEmail = "admin@cq.com";
            sPassword = "secret";
		}
		else if (Email == "DeleteBusinessUser")
		{
			sEmail = "badmindelete@cq.com";
            sPassword = "secret";
		}

		
		WelcomePage.lnk_Login(driver).click();
		LoginPage.input_email(driver).sendKeys(sEmail);
		LoginPage.input_password(driver).sendKeys(sPassword);
		LoginPage.btn_login(driver).submit();
	}
}


		
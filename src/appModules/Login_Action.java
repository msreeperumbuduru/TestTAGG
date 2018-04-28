package appModules;
import org.openqa.selenium.WebDriver;
import pageObjects.*;


public class Login_Action {
	public static void Execute(WebDriver driver, String Email) throws Exception{
		String sEmail="";
		String sPassword="";
		if (Email == "CharityQAdmin")
		{
			sEmail = "CQADMINS@CQ.COM";
            sPassword = "secret";
		}
	
		else if (Email == "CharityQUser")
		{
			sEmail = "CQUSERS@CQ.COM";
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
		else if (Email == "DeleteCQUser")
		{
			sEmail = "badmindelete1@cq.com";
            sPassword = "secret";
		}
		else if (Email == "DeleteBusinessUser")
		{
			sEmail = "cqadmindelete@cq.com";
            sPassword = "secret";
		}
		else if (Email == "NewAdminSignUp")
		{
			sEmail = "badminuser6@cq.com";
            sPassword = "secret";
		}
		
		WelcomePage.lnk_Login(driver).click();
		Thread.sleep(500);
		LoginPage.input_email(driver).sendKeys(sEmail);
		Thread.sleep(500);
		LoginPage.input_password(driver).sendKeys(sPassword);
		Thread.sleep(500);
		LoginPage.btn_login(driver).submit();
		Thread.sleep(500);
	}
}


		
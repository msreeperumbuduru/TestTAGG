package appModules;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

//import utility.Log;

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
			sEmail = "cuser1@cq.com";
            sPassword = "secret";
		}
		   
		else if (Email == "BusinessAdmin")
		{
			System.out.print("entered login");
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
		else if (Email == "NewAdminSignUp")
		{
			sEmail = "tobe1@deleted.com";
            sPassword = "secret";
		}
		else if (Email == "BUSN USER DELETE")
		{
			//sEmail = deletedemail;
            sPassword = "secret";
		}
		
		WelcomePage.lnk_Login(driver).click();
		LoginPage.input_email(driver).sendKeys(sEmail);
		LoginPage.input_password(driver).sendKeys(sPassword);
		LoginPage.btn_login(driver).click();
		
	}
}


		
package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.*;

	public class UpdateBusinessLocations {
		
		public static void Execute(WebDriver driver, String User) throws Exception{	
			
			String name = "";
			String desc = "";
			String addr1 = "";
			String addr2 = "";
			String city = "";
			String state = "";
			String zip = "";
			String phone = "";
			
		if (User == "BusinessAdmin") {
			name = "Business LTD";
			desc = "Business Admin";
			addr1 = "M Street";
			addr2 = "";
			city = "Omaha";
			state = "Nebraska";
			zip = "68104";
			phone = "4021234567";
		}
		
		if (User == "BusinessUser") {
			name = "Business LTD";
			desc = "Business User";
			addr1 = "Q Street";
			addr2 = "";
			city = "Omaha";
			state = "Nebraska";
			zip = "68107";
			phone = "4021234568";
		}
		
		if (User == "CharityQAdmin") {
			name = "CharityQ";
			desc = "Administrator and Owner of CharityQ";
			addr1 = "17117 Oak Drive";
			addr2 = "Ste. A";
			city = "Omaha";
			state = "Nebraska";
			zip = "68130";
			phone = "4027155230";
		}
		
		if (User == "CharityQUser") {
			name = "CharityQ";
			desc = "Administrator and Owner of CharityQ";
			addr1 = "17117 Oak Drive";
			addr2 = "Ste. A";
			city = "Omaha";
			state = "Nebraska";
			zip = "68130";
			phone = "4027155230";
		}

		    HeaderLinks.lnk_MyBusiness(driver).click();
		    Thread.sleep(1000);
		    HeaderLinks.lnk_BusinessProfile(driver).click();
		    Thread.sleep(1000);
			BusinessProfilePage.btn_edit(driver).click();
			Thread.sleep(1000);
			BusinessProfilePage.input_bsnName(driver).clear();
			BusinessProfilePage.input_bsnName(driver).sendKeys(name);
			Thread.sleep(1000);
			BusinessProfilePage.input_bsnDes(driver).clear();
			BusinessProfilePage.input_bsnDes(driver).sendKeys(desc);
			Thread.sleep(1000);
			BusinessProfilePage.input_addr1(driver).clear();
			BusinessProfilePage.input_addr1(driver).sendKeys(addr1);
			Thread.sleep(1000);
			BusinessProfilePage.input_addr2(driver).clear();
			BusinessProfilePage.input_addr2(driver).sendKeys(addr2);
			Thread.sleep(1000);
			BusinessProfilePage.input_city(driver).clear();
			BusinessProfilePage.input_city(driver).sendKeys(city);
			Thread.sleep(1000);
			BusinessProfilePage.drpdwn_state(driver).selectByVisibleText("Nebraska");
			Thread.sleep(1000);
			BusinessProfilePage.input_zipcode(driver).clear();
			BusinessProfilePage.input_zipcode(driver).sendKeys(zip);
			Thread.sleep(1000);
			BusinessProfilePage.input_phoneno(driver).clear();
			BusinessProfilePage.input_phoneno(driver).sendKeys(phone);
			Thread.sleep(1000);
			BusinessProfilePage.btn_save(driver).click();
			Thread.sleep(1000);
			BusinessProfilePage.btn_cancel(driver).click();
			Thread.sleep(1000);
		}
		
		public static void UpdatePayment(WebDriver driver, String CardType) throws Exception{	
			String card ="";

			if(CardType == "Accept") 
			{
				card = "4242424242424242";
			}
			
			if(CardType == "Decline") 
			{
				card = "4000000000000002";
			}
			
			String month = "01";
			String year = "22";
			String cvc = "123";	
			Thread.sleep(5000);
			BusinessProfilePage.input_cardNumber(driver).sendKeys(card);
			Thread.sleep(5000);
			BusinessProfilePage.input_expMonth(driver).sendKeys(month);
			Thread.sleep(5000);
			BusinessProfilePage.input_expYear(driver).sendKeys(year);
			Thread.sleep(5000);
			BusinessProfilePage.input_cvc(driver).sendKeys(cvc);
			Thread.sleep(5000);
			BusinessProfilePage.btn_updateCardDtl(driver).click();
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			((JavascriptExecutor)driver).executeScript("scrollTo(0, 0)");
			Thread.sleep(5000);
	        String text = BusinessProfilePage.text_alert(driver).getText();	
	        if(CardType == "Accept") 
	        {
		    Assert.assertEquals(text,"Card is updated");
		    }
	        if(CardType == "Decline") 
	        {
		    Assert.assertEquals(text,"Your card was declined.");
		    }
		}
		}

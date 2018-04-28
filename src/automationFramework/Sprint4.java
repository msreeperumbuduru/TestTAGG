package automationFramework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import appModules.*;
import pageObjects.*;
import utility.Constant;

public class Sprint4 extends Constant{
	
	public Sprint4() {
		super();
	}
	
	
	//verify comma sepearted format for cquser
	@Test(enabled=true,priority=1)
	public void CommaCqUser() throws Exception { 		
		Login_Action.Execute(driver, "CharityQUser");
		Thread.sleep(500);
		HeaderLinks.lnk_Dashboard(driver).click();
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, 400)");
		Thread.sleep(1000);
		Screenshot.Execute(driver);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, 500)");
		Thread.sleep(500);
		Screenshot.Execute(driver);
		Thread.sleep(500);
		Logout_Action.Execute(driver);
	}
	
	@Test(enabled=true,priority=2, groups = {"Regression_Functional"})
	public void ApprovedAmount() throws Exception { 		
		Login_Action.Execute(driver, "BusinessAdmin");
		Thread.sleep(500);
		HeaderLinks.lnk_SearchDonations(driver).click();
		Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, 100)");
		Thread.sleep(500);
		Screenshot.Execute(driver);
		//((JavascriptExecutor)driver).executeScript("document.querySelector('table th:last-child').scrollIntoView();");
		Logout_Action.Execute(driver);
	}
		
}
	

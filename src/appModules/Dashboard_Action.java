package appModules;

import org.openqa.selenium.WebDriver;


import pageObjects.*;


public class Dashboard_Action {
	public static void Execute(WebDriver driver) throws Exception{
		
		String org_name = "A";
		
		DashboardPage.input_searchBox(driver).sendKeys(org_name);
		Screenshot.Execute(driver);
		DashboardPage.lnk_Detail1(driver).click();
		Screenshot.Execute(driver);
		DashboardPage.lnk_back(driver).click();
		
	}
}
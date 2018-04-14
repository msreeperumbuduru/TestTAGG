package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
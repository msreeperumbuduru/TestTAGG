package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class BusinessLocationsPage {
private static WebElement element = null;
	
	public static WebElement input_cancelSubs(WebDriver driver)
	{
		element = driver.findElement(By.id("cancel"));
		return element;
		}
	public static WebElement input_resumeSubs(WebDriver driver)
	{
		element = driver.findElement(By.id("resume"));
		return element;
		}
	public static WebElement btn_edit(WebDriver driver)
	{
		element = driver.findElement(By.id("edit_location"));
		return element;
		}
	public static WebElement btn_addbsnloc(WebDriver driver)
	{
		element = driver.findElement(By.id("Add_locations"));
		return element;
		}
	//Edit Main Franchise - use Business Profile page objects
	
	//Add location page - Consider Business Profile page objects and below 2 objects
		
	public static WebElement btn_LocaddBsnLoc(WebDriver driver)
	{
		element = driver.findElement(By.id("Submit"));
		return element;
		}

	public static WebElement btn_LocCancel(WebDriver driver)
	{
		element = driver.findElement(By.id("cancel"));
		return element;
		}
	
	//Update user locations - update profile page
	public static WebElement btn_UpdateLocsave(WebDriver driver)
	{
		element = driver.findElement(By.id("btnSave"));
		return element;
		}
	public static WebElement btn_UpdateLocCancel(WebDriver driver)
	{
		element = driver.findElement(By.id("Cancel"));
		return element;
		}
	public static WebElement label_SubsMessage(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]//div/div[1]")); 
		return element;
		}

}


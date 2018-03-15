package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderLinks {
private static WebElement element = null;
	
	public static WebElement lnk_Dashboard(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Dashboard"));
		return element;
		}
	public static WebElement lnk_MyDonationForm(WebDriver driver)
	{
		element = driver.findElement(By.linkText("My Donation Form"));
		return element;
		}
	public static WebElement lnk_SearchDonations(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Search Donations"));
		return element;
		}
	public static WebElement lnk_MyBusiness(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("My Business"));
		return element;
		}
	public static WebElement lnk_DonationPref(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Donation Preferences"));
		return element;
		}
	public static WebElement lnk_ManualDonReq(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Manual Donation Request"));
		return element;
		}
	public static WebElement lnk_BusinLocations(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Business Locations"));
		return element;
		}
	public static WebElement lnk_ManualDonation(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText(""));
		return element;
		}
	public static WebElement lnk_BusinessProfile(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Profile"));
		return element;
		}
	public static WebElement lnk_Users(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Users"));
		return element;
		}
	public static WebElement lnk_emailtmp(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Email Templates"));
		return element;
		}
	public static WebElement lnk_userame(WebDriver driver)
	{
		element = driver.findElement(By.id("username"));
		return element;
		}
	public static WebElement lnk_UserProfile(WebDriver driver)
	{
		element = driver.findElement(By.linkText("User Profile"));
		return element;
		}
	public static WebElement lnk_changePswd(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Change Password"));
		return element;
		}
	public static WebElement lnk_logout(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Logout"));
		return element;
		}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonationPreferencesPage {
private static WebElement element = null;
	
	public static WebElement input_monthlyBudget(WebDriver driver)
	{
		element = driver.findElement(By.id("monthlybudget"));
		return element;
		}
	public static WebElement input_notice(WebDriver driver)
	{
		element = driver.findElement(By.id("daysNotice"));
		return element;
		}
	public static WebElement btnSave(WebDriver driver)
	{
		element = driver.findElement(By.id("btnSaveBudgetNotice"));
		return element;
		}
	public static WebElement drpdwn_ruletoedit(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement lnk_not(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement lnk_invert(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement lnk_addrule(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement lnk_addgroup(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement filter_type(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement filter_math(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement input_amt(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement btn_delete(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement btn_clearrule(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement btn_resetrule(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement btn_saverule(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement lnk_howtosetrule(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
}
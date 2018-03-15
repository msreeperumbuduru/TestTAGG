package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyDonationFormPage {
private static WebElement element = null;	

	public static WebElement lnk_createURL(WebDriver driver)
	{
		element = driver.findElement(By.id("create_URL"));
		return element;
		}
	public static WebElement input_createURL(WebDriver driver)
	{
		element = driver.findElement(By.id("urlCopied"));
		return element;
		}
	public static WebElement lnk_embeddedCodeForm(WebDriver driver)
	{
		element = driver.findElement(By.id("createForm"));
		return element;
		}
	public static WebElement input_embeddedCodeForm(WebDriver driver)
	{
		element = driver.findElement(By.id("embeddedCode"));
		return element;
		}
	
	public static WebElement btn_setPreferences(WebDriver driver)
	{
		element = driver.findElement(By.id("setDonationPref"));
		return element;
		}
	
	public static WebElement btn_Cancel(WebDriver driver)
	{
		element = driver.findElement(By.id("cancel"));
		return element;
		}
}



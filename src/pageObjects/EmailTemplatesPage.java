package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class EmailTemplatesPage {
private static WebElement element = null;
	
	public static WebElement tmpbtn_AddTemplate(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement tmpbtn_Edit_BA(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"EditEmailTemp\"]"));
		return element;
		}
	
	public static WebElement tmpbtn_Edit_BU(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement tmpbtn_Edit_Donation_App(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"EditEmailTemp\"]"));
		return element;
		}
	public static WebElement tmpbtn_Edit_Donation_Rej(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"EditEmailTemp\"]"));
		return element;
		}
	public static WebElement tmpbtn_Forgot_Pswd(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement BA_tmpUpdate(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement BA_tmpCancel(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement BU_tmpUpdate(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement BU_tmpCancel(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement DonApp_tmpUpdate(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement DonApp_tmpCancel(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement DonRej_tmpUpdate(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement DonRej_tmpCancel(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement ForgotPswd_tmpUpdate(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement ForgotPswd_tmpCancel(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
}
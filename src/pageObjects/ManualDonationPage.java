package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class ManualDonationPage {
private static WebElement element = null;
	
	public static WebElement input_orgname(WebDriver driver)
	{
		element = driver.findElement(By.id("requester"));
		return element;
		}
	public static Select drpdwn_orgtype(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.name("requester_type")));
		return element;
		}
	public static WebElement input_fn(WebDriver driver)
	{
		element = driver.findElement(By.id("firstname"));
		return element;
		}
	
	public static WebElement input_ln(WebDriver driver)
	{
		element = driver.findElement(By.id("lastname"));
		return element;
		}
	public static WebElement input_email(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
		}
	
	public static WebElement input_phone(WebDriver driver)
	{
		element = driver.findElement(By.id("phone_number"));
		return element;
		}
	public static WebElement input_addr1(WebDriver driver)
	{
		element = driver.findElement(By.id("address1"));
		return element;
		}
	
	public static WebElement input_addr2(WebDriver driver)
	{
		element = driver.findElement(By.id("address2"));
		return element;
		}
	public static WebElement input_city(WebDriver driver)
	{
		element = driver.findElement(By.id("city"));
		return element;
		}
	public static Select inputState(WebDriver driver)
	{
		Select element =new Select(driver.findElement(By.name("state")));
		return element;
		}
	public static WebElement input_zip(WebDriver driver)
	{
		element = driver.findElement(By.id("zipcode"));
		return element;
		}
	
	public static WebElement btn_yesRadio(WebDriver driver)
	{
		element = driver.findElement(By.id("yesCheck"));
		return element;
		}
	public static WebElement btn_noRadio(WebDriver driver)
	{
		element = driver.findElement(By.id("noCheck"));
		return element;
		}
	public static Select drpdwn_requestfor(WebDriver driver)
	{  
		Select element = new Select(driver.findElement(By.id("item_requested")));
		return element;
		}
	public static Select input_purpose(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.id("event_type")));
		//element = driver.findElement(By.id("event_type"));
		return element;
		}
	public static Select input_donpurpose(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.id("item_purpose")));
		return element;
		}
	public static WebElement input_dollaramt(WebDriver driver)
	{
		element = driver.findElement(By.id("dollar_amount"));
		return element;
		}

	public static WebElement cal_neededby(WebDriver driver)
	{
		element = driver.findElement(By.id("needed_by_date"));
		return element;
		}
	public static WebElement input_eventname(WebDriver driver)
	{
		element = driver.findElement(By.id("eventname"));
		return element;
		}
	public static WebElement cal_eventdate(WebDriver driver)
	{
		element = driver.findElement(By.id("event_date"));
		return element;
		}
	
	public static WebElement input_noofattendees(WebDriver driver)
	{
		element = driver.findElement(By.id("formAttendees"));
		return element;
		}
	public static WebElement input_eventvenue(WebDriver driver)
	{
		element = driver.findElement(By.id("venue"));
		return element;
		}
	public static WebElement input_marketoppr(WebDriver driver)
	{
		element = driver.findElement(By.id("marketingopportunities"));
		return element;
		}
	public static WebElement btn_sendrequest(WebDriver driver)
	{
		element = driver.findElement(By.id("btnSubmit"));
		return element;
		}
}
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class SubscriptionPage {
private static WebElement element = null;
	
	public static Select drpdwn_locations(WebDriver driver)
	{
		Select sel =new Select(driver.findElement(By.name("user_locations")));
		return sel;
		}
	public static Select ddrpdwn_plan(WebDriver driver) //Monthly //Annually
	{
		Select sel =new Select(driver.findElement(By.name("plan")));
		return sel;
		}

	public static WebElement btn_Apply(WebDriver driver) 
	{
		element = driver.findElement(By.id("Apply"));
		return element;
		}
	public static WebElement input_promocode(WebDriver driver) 
	{
		element = driver.findElement(By.id("coupon"));
		return element;
		}
	public static WebElement input_cardNo(WebDriver driver)
	{
		element = driver.findElement(By.id("cardNumber"));
		return element;
		}
	public static WebElement input_expMonth(WebDriver driver)
	{
		element = driver.findElement(By.id("expiryMonth"));
		return element;
		}
	public static WebElement input_expYear(WebDriver driver)
	{
		element = driver.findElement(By.id("expiryYear"));
		return element;
		}
	public static WebElement input_CVV(WebDriver driver)
	{
		element = driver.findElement(By.id("cvCode"));
		return element;
		}
	public static WebElement btn_Pay(WebDriver driver)
	{
		element = driver.findElement(By.id("buttonPay"));
		return element;
		}
	public static WebElement btn_Subscription(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Subscription"));
		return element;
		}
	public static WebElement btn_logout(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Logout"));
		return element;
		}	
}

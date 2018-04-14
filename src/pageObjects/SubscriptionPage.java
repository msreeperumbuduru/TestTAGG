package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class SubscriptionPage {
private static WebElement element = null;
	
	public static WebElement radio_locations_5(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//input[@value='5']"));
		return element;
	}
    
	public static WebElement radio_locations_25(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//input[@value='25']"));
		return element;
		}
	public static WebElement radio_locations_100(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//input[@value='100']"));
		return element;
		}
	public static WebElement radio_locations_unlimited(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//input[@value='101+']"));
		return element;
		}
	public static WebElement radio_plan_month(WebDriver driver) //Monthly 
	{
		element =driver.findElement(By.xpath("//input[@value='Monthly']"));
		return element;
		}
	public static WebElement radio_plan_annual(WebDriver driver)  //Annually
	{
		element =driver.findElement(By.xpath("//input[@value='Annually']"));
		return element;
		}
	public static WebElement input_promocode(WebDriver driver) 
	{
		element = driver.findElement(By.id("coupon"));
		return element;
		}

	public static WebElement btn_Apply(WebDriver driver) 
	{
		element = driver.findElement(By.id("apply"));
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

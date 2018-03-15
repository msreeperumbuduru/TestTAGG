package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserProfilePage {
private static WebElement element = null;
	
	public static WebElement input_FirstName(WebDriver driver)
	{
		element = driver.findElement(By.id("first_name"));
		return element;
		}
	
	public static WebElement input_LastName(WebDriver driver)
	{
		element = driver.findElement(By.id("last_name"));
		return element;
		}
	
	public static WebElement input_Email(WebDriver driver)
	{
		element = driver.findElement(By.id("email_address"));
		return element;
		}
	
	public static WebElement input_Address1(WebDriver driver)
	{
		element = driver.findElement(By.id("Address1"));
		return element;
		}
	public static WebElement input_Address2(WebDriver driver)
	{
		element = driver.findElement(By.id("Address2"));
		return element;
		}
	public static WebElement input_City(WebDriver driver)
	{
		element = driver.findElement(By.id("City"));
		return element;
		}
	public static Select input_State(WebDriver driver)
	{
		Select sel =new Select(driver.findElement(By.id("state")));
		return sel;
		}
	public static WebElement input_ZipCode(WebDriver driver)
	{
		element = driver.findElement(By.id("zipcode"));
		return element;
		}	
	public static WebElement input_PhoneNumber(WebDriver driver)
	{
		element = driver.findElement(By.id("phone_number"));
		return element;
		}	
	public static WebElement btn_Edit(WebDriver driver)
	{
		element = driver.findElement(By.id("btnEdit"));
		return element;
		} 
	public static WebElement btn_Cancel(WebDriver driver)
	{
		element = driver.findElement(By.id("cancel"));
		return element;
		} 
	public static WebElement btn_Save(WebDriver driver)
	{
		element = driver.findElement(By.id("btnSave"));
		return element;
		}
}

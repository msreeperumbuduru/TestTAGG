package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
private static WebElement element = null;
	
	public static WebElement inputFirstName(WebDriver driver)
	{
		element = driver.findElement(By.id("first_name"));
		return element;
		}
	
	public static WebElement inputLastName(WebDriver driver)
	{
		element = driver.findElement(By.id("last_name"));
		return element;
		}
	
	public static WebElement inputEmail(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
		}
	public static WebElement inputPassword(WebDriver driver)
	{
		element = driver.findElement(By.id("password"));
		return element;
		}
	public static WebElement inputConfirmPassword(WebDriver driver)
	{
		element = driver.findElement(By.id("password-confirm"));
		return element;
		}
	public static WebElement inputBusinessName(WebDriver driver)
	{
		element = driver.findElement(By.id("org_name"));
		return element;
		}
	public static Select inputBusinessType(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.name("organization_type_id")));
		return element;
		}
	public static WebElement inputAddress1(WebDriver driver)
	{
		element = driver.findElement(By.id("street_address1"));
		return element;
		}
	public static WebElement inputAddress2(WebDriver driver)
	{
		element = driver.findElement(By.id("street_address2"));
		return element;
		}
	public static WebElement inputCity(WebDriver driver)
	{
		element = driver.findElement(By.id("city"));
		return element;
		}
	public static Select inputState(WebDriver driver)
	{
		Select element =new Select(driver.findElement(By.name("state")));
		return element;
		}
	public static WebElement inputZipCode(WebDriver driver)
	{
		element = driver.findElement(By.id("zipcode"));
		return element;
		}	
	public static WebElement inputPhoneNumber(WebDriver driver)
	{
		element = driver.findElement(By.id("phone_number"));
		return element;
		}	
	public static WebElement clickRegister(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//input[@value='Register']"));
		return element;
		} 
}

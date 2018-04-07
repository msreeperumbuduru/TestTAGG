package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private static WebElement element = null;
	
	public static WebElement input_email(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
		}
	public static WebElement input_password(WebDriver driver)
	{
		element = driver.findElement(By.id("password"));
		return element;
		}
	
	public static WebElement btn_login(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'btn-basic')]"));
		return element;
	}
	
	public static WebElement lnk_forgotPassword(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Forgot Your Password?"));
		return element;
	}
	public static WebElement input_emailAddress(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement lnk_SendPasswordLink(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@value='Send Password Reset Link']"));
		return element;
	}
	
	public static WebElement verify_ResetPasswordMessage(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector(".panel-body>div"));
		return element;
	}
	
	public static WebElement verify_WrongPasswordMessage(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@value='We can't find a user with that e-mail address.']"));
		return element;
	}		 
	public static WebElement verifydeleteUserPath(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[1]/div/span"));
		return element;
	}
	public static WebElement verify_deleteUserVerify(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@value='Your account is currently inactivated. Please contact your administrator for assistance.']"));
		return element;
	}
}


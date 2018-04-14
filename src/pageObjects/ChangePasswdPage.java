package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class ChangePasswdPage {
private static WebElement element = null;
	
	public static WebElement input_old_pswd(WebDriver driver)
	{
		element = driver.findElement(By.id("password-old"));
		return element;
		}
	public static WebElement input_new_pswd(WebDriver driver)
	{
		element = driver.findElement(By.id("password-new"));
		return element;
		}
	public static WebElement input_confirm_pswd(WebDriver driver)
	{
		element = driver.findElement(By.id("password-confirm"));
		return element;
		}
	public static WebElement btn_submit(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//button[contains(@class,'btn-basic')]"));
		return element;
		}
	public static WebElement label_success(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'alert-success')]"));
		return element;
		}
}


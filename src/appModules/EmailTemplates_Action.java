package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailTemplates_Action {
	
	private static WebElement element = null;
	
	public static WebElement input_emailBody(WebDriver driver)
	{
		element = driver.findElement(By.id("tinymice"));
		return element;
		} 
	public static WebElement input_emailSub(WebDriver driver)
	{
		element = driver.findElement(By.name("email_subject"));
		return element;
		} 
	public static WebElement btn_ApproveSend(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'btn-basic')]"));
		return element;
		} 
	public static WebElement btn_Cancel(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'backbtn')]"));
		return element;
		} 
}

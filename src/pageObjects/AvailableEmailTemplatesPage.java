package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvailableEmailTemplatesPage {
	
	private static WebElement element = null;
	
	public static void RadioListTemp1(WebDriver driver) {
		// TODO Auto-generated method stub
		List <WebElement> li=driver.findElements(By.xpath("//input[@type='radio']"));
		        for(int i=0;i<=li.size()-1;i++)
		        {
		            li.get(0).click();
		        }
		}
	public static void RadioListTemp2(WebDriver driver) {
		// TODO Auto-generated method stub
		List <WebElement> li=driver.findElements(By.xpath("//input[@type='radio']"));
		        for(int i=0;i<=li.size()-1;i++)
		        {
		            li.get(1).click();
		        }
		}
	public static void RadioListTemp3(WebDriver driver) {
		// TODO Auto-generated method stub
		List <WebElement> li=driver.findElements(By.xpath("//input[@type='radio']"));
		        for(int i=0;i<=li.size()-1;i++)
		        {
		            li.get(2).click();
		        }
		}
	
	public static WebElement btn_Proceed(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'btn-basic')]"));
		return element;
		}

	public static WebElement alertConfirm(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'alert-dismissible')]"));
		return element;
		}
	public static WebElement alertReject(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'alert-dismissible')]"));
		return element;
		}
}

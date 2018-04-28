package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
private static WebElement element = null;
	
	public static WebElement input_searchBox(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@type='search']"));
		return element; 
		}
	public static WebElement lnk_Detail(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='example']/tbody/tr/td[9]/a/span"));
		return element;
		}
	public static WebElement lnk_Detail1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[9]/a/span"));
		return element;
		}
	public static WebElement lnk_Next(WebDriver driver)
	{
		element = driver.findElement(By.id("example_next"));
		return element;
		}
	
	public static WebElement lnk_Previous(WebDriver driver)
	{
		element = driver.findElement(By.id("example_previous"));
		return element;
		}
	public static WebElement lnk_back(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/input"));
		return element;
		}
	public static WebElement drpdwn_paging(WebDriver driver)
	{
		element = driver.findElement(By.name("example_length"));
		return element;
		}
	public static WebElement btn_ApproveCustomize(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//input[@value='Approve & customize response']"));
		return element;
		}
	
	public static WebElement btn_Reject(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//input[@value='Reject & customize response']"));
		return element;
		}
	public static WebElement btn_ApproveDefault(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//input[@value='Approve & send default email']"));
		return element;
		}
	public static WebElement btn_RejectDefault(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//input[@value='Reject & send default email']"));
		return element;
		}
	public static WebElement dtl_cancel(WebDriver driver)
	{
		element = driver.findElement(By.id("cancel"));
		return element;
		}	
	public static WebElement input_amtApproval(WebDriver driver)
	{
		element = driver.findElement(By.id("approved_amount"));
		return element;
		}

	public static void Execute(WebDriver driver) {

		List <WebElement> li=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int iSize = li.size();
		        for(int i=1;i<=iSize;i++)
		        {
		        	if(!li.get(1).isSelected()) {
		        		li.get(1).click();
		        }
		        }
		}
	
}

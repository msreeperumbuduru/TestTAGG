package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchDonationsPage {
private static WebElement element = null;
	

	public static WebElement lnk_pdfDownload(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='example_wrapper']/div[1])/a[1]/span"));
		return element;
		}
	
	public static WebElement lnk_csvDownload(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='example_wrapper']/div[1])/a[2]/span"));
		return element;
		}
	
	public static WebElement btn_excelDownload(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='example_wrapper']/div[1])/a[3]/span"));
		return element;
		}
	
	public static WebElement txtbox_search(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='example_filter']/label/input"));
		return element;
		}
	public static WebElement calender_from(WebDriver driver)
	{
		element = driver.findElement(By.id("dateStart"));
		return element;
		}
	
	public static WebElement calender_to(WebDriver driver)
	{
		element = driver.findElement(By.id("dateEnd"));
		return element;
		}
	
	public static WebElement btn_previous(WebDriver driver)
	{
		element = driver.findElement(By.id("example_previous"));
		return element;
		}
	
	public static WebElement btn_next(WebDriver driver)
	{
		element = driver.findElement(By.id("example_next"));
		return element;
		}
	
	public static WebElement srch_req(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_orgReq(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_reqAmt(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_donationType(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_donatingBussn(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	public static WebElement srch_eventName(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_dateNeeded(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_status(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_statusReason(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
		}
	
	public static WebElement srch_viewDtls(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[9]/a/span"));
		return element;
		}	

	public static WebElement lnk_dtlApprove(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[id='example']/tbody/tr[3]/td[8]/div/form/button[1]/i"));
		return element;
		}
	public static WebElement lnk_dtlReject(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[id='example']/tbody/tr[3]/td[8]/div/form/button[2/i"));
		return element;
		}
	
}



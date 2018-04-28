package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BusinessProfilePage {
private static WebElement element = null;
	
	public static WebElement input_bsnName(WebDriver driver)
	{
		element = driver.findElement(By.id("org_name"));
		return element;
		}
	
	public static WebElement input_bsnDes(WebDriver driver)
	{
		element = driver.findElement(By.name("org_description"));
		return element;
		}
	
	public static WebElement input_addr1(WebDriver driver)
	{
		element = driver.findElement(By.id("street_address1"));
		return element;
		}
	
	public static WebElement input_addr2(WebDriver driver)
	{
		element = driver.findElement(By.id("street_address2"));
		return element;
		}
	
	public static WebElement input_city(WebDriver driver)
	{
		element = driver.findElement(By.id("city"));
		return element;
		}
	
	public static Select drpdwn_state(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.name("state")));
		return element;
		}
	
	public static WebElement input_zipcode(WebDriver driver)
	{
		element = driver.findElement(By.id("zip_code"));
		return element;
		}
	public static WebElement input_phoneno(WebDriver driver)
	{
		element = driver.findElement(By.id("phone_number"));
		return element;
		}
	
	public static WebElement btn_edit(WebDriver driver)
	{
		element = driver.findElement(By.id("btnEdit"));
		return element;
		}
	public static WebElement btn_save(WebDriver driver)
	{
		element = driver.findElement(By.id("btnSave"));
		return element;
		}
	
	public static WebElement btn_cancel(WebDriver driver)
	{
		element = driver.findElement(By.id("Cancel"));
		return element;
		}
	public static WebElement input_cardNumber(WebDriver driver)
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
	public static WebElement input_cvc(WebDriver driver)
	{
		element = driver.findElement(By.id("cvCode"));
		return element;
		}
	public static WebElement btn_updateCardDtl(WebDriver driver)
	{
		element = driver.findElement(By.id("update-default-card"));
		return element;
		}
	public static WebElement text_alert(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='update-form']/div[1]/ul"));
		return element;
		}
}

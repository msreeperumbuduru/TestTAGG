package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonationPreferencesPage {
private static WebElement element = null;
	
	public static WebElement input_monthlyBudget(WebDriver driver)
	{
		element = driver.findElement(By.id("monthlyBudget"));
		return element;
		}
	public static WebElement input_notice(WebDriver driver)
	{
		element = driver.findElement(By.id("noticeDays"));
		return element;
		}
	public static WebElement btnSave(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='content']//div//div[2]/form/button"));
		return element;
		}
	public static WebElement input_amtreq(WebDriver driver)
	{
		element = driver.findElement(By.id("amtReq"));
		return element;
		}
	public static WebElement chk_aw(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]//div//div[2]/form/div[3]/div[1]/input"));
		return element;
		}
	public static WebElement chk_ach(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[2]/input"));
		return element;
		}
	public static WebElement chk_awach(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[3]/input"));
		return element;
		}

	public static WebElement chk_ci(WebDriver driver)
	{
		//element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[4]/input"));
		element = driver.findElement(By.id("Faith/Religious"));
		return element;//*[@id="Faith/Religious"]
		}
	public static WebElement chk_cg(WebDriver driver)
	{
		element = driver.findElement(By.id("Corporate Giving"));
		//element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[5]/input"));
		return element;
		}
	public static WebElement chk_k12(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[6]/input"));
		return element;
		}
	public static WebElement chk_env(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[7]/input"));
		return element;
		}
	public static WebElement chk_fr(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[8]/input"));
		return element;
		}
	public static WebElement chk_fan(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[9]/input"));
		return element;
		}
	public static WebElement chk_hc(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[10]/input"));
		return element;
		}
	public static WebElement chk_hs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[3]/div[11]/input"));
		return element;
		}
	public static WebElement chk_ysa(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div/div/div[2]/form/div[3]/div[12]/input"));
		return element;
		}
	public static WebElement chk_others(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div/div/div[2]/form/div[3]/div[13]/input"));
		return element;
		}
	public static WebElement chk_yes(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[4]/div[1]/input"));
		return element;
		}
	public static WebElement chk_no(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[4]/div[2]/input"));
		return element;
		}
	public static WebElement chk_cashck(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[5]/div[1]/input"));
		return element;
		}
	public static WebElement chk_gift(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[5]/div[2]/input"));
		return element;
		}
	public static WebElement chk_prod(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[5]/div[3]/input"));
		return element;
		}
	public static WebElement chk_spon(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[5]/div[4]/input"));
		return element;
		}
	public static WebElement chk_othdon(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form/div[5]/div[5]/input"));
		return element;
		}
}
		
	//isChecked = e.findElement(By.tagName("input")).Selected;
	//isChecked = e.findElement(By.tagName("input")).isSelected();
